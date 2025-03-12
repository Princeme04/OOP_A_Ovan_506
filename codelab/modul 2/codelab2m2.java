public class codelab2m2 {
    public static void main(String[] args){
        // Create two SystemBank account objects with initial balances
        SystemBank account1 = new SystemBank("202410370110506", "opan", 5000);
        SystemBank account2 = new SystemBank("202410370110400", "viero", 5000);

        // Display initial information for account1
        account1.displayInfo();
        // Deposit into account1
        account1.deposit(4000);
        // Withdraw from account1
        account1.withdraw(300);

        // Display initial information for account2
        account2.displayInfo();
        // Deposit into account2
        account2.deposit(4411);
        // Withdraw from account2
        account2.withdraw(400);
    }
}
