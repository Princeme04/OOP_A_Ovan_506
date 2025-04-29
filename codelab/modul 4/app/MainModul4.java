package app;

import perpustakaan.Book;
import perpustakaan.Fiction;
import perpustakaan.NonFiction;

public class MainModul4 {
    public static void main(){
        Book fiction = new Fiction("Real", "Takehiko Inoue");
        Book nonFiction = new NonFiction("Metamorphosis", "Franz Kafka");

        fiction.displayInfo();
        nonFiction.displayInfo();

        System.out.println();
    }

}
