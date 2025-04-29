package perpustakaan;

public class Member implements BookLoan{
    private final String name;
    private final String memberID;

    public Member(String name, String memberID){
        this.name = name;
        this.memberID = memberID;
    }
    public void nameList(){
        System.out.println("Member: " + name + " ID: " + memberID);
    }

    @Override
    public void borrowBook(String title){
        System.out.println(name + "(" + memberID+ ")" + " borrowed the book " + title);
    }

    @Override
    public void borrowBook(String title, int duration){
        System.out.println(name + "(" + memberID+ ")" + " borrowed the book: " + title + " for " + duration + " days.");
    }

    @Override
    public void returnBook(String title){
        System.out.println(name + "(" + memberID+ ")" + " returned the book: " + title);
    }
}
