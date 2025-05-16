import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StockManagement {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean decision = true;

//        itemList.add(new Item("Notebook", 10));
//        itemList.add(new Item("Pen", 20));
//        itemList.add(new Item("Eraser", 15));
//        itemList.add(new Item("Book", 20));

        while (decision) {
            System.out.println("\n--- Stock Management Menu ---");
            System.out.println("1. Add New Item");
            System.out.println("2. Display All Items");
            System.out.println("3. Reduce Item Stock");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } catch (InputMismatchException e) {
                System.out.println("Input must be a number!");
                scanner.nextLine(); // clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial stock: ");
                    try {
                        int stock = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        itemList.add(new Item(name, stock));
                        System.out.println("Item added successfully.");
                    } catch (InputMismatchException e) {
                        System.out.println("Stock input must be a number!");
                        scanner.nextLine(); // clear invalid input
                    }
                    break;

                case 2:
                    if (itemList.isEmpty()) {
                        System.out.println("Item stock is empty.");
                    } else {
                        System.out.println("--- All Items ---");
                        for (Item item : itemList) {
                            System.out.println("Name: " + item.getName() + ", Stock: " + item.getStock());
                        }
                    }
                    break;

                case 3:
                    if (itemList.isEmpty()) {
                        System.out.println("No items to reduce stock from.");
                        break;
                    }

                    System.out.println("--- Items List ---");
                    for (int i = 1; i < itemList.size(); i++) {
                        System.out.println(i + ": " + itemList.get(i).getName() + " - Stock: " + itemList.get(i).getStock());
                    }

                    try {
                        System.out.print("Enter item index to reduce stock: ");
                        int index = scanner.nextInt();
                        System.out.print("Enter amount to reduce: ");
                        int amount = scanner.nextInt();
                        scanner.nextLine();

                        Item selectedItem = itemList.get(index);

                        if (amount > selectedItem.getStock()) {
                            throw new InsufficientStockException("Stock for " + selectedItem.getName() + " is only " + selectedItem.getStock() + " left.");
                        }

                        selectedItem.setStock(selectedItem.getStock() - amount);
                        System.out.println("Stock reduced successfully. Remaining stock: " + selectedItem.getStock());

                    } catch (InputMismatchException e) {
                        System.out.println("Index and amount must be numbers.");
                        scanner.nextLine(); // clear invalid input
                    } catch (InsufficientStockException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 0:
                    decision = false;
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }

        scanner.close();
    }
}
