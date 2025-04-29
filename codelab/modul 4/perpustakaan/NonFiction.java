public class NonFiksi extends Buku{
    public NonFiksi(String title, String author){
        super(title, author);
    }
    @Override
    public void displaInfo(){
        System.out.println("Fiction Book: ");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author)
    }
}
