package app;

import perpustakaan.Book;
import perpustakaan.Fiction;
import perpustakaan.Member;
import perpustakaan.NonFiction;

public class MainModul4 {
    public static void main(){
        Book fiction = new Fiction("Real", "Takehiko Inoue");
        Book nonFiction = new NonFiction("Metamorphosis", "Franz Kafka");

        fiction.displayInfo();
        nonFiction.displayInfo();

        System.out.println();

        Member ovan = new Member("Ovan Skywalker", "506");
        Member viero = new Member("Viero Smith", "423");

        ovan.nameList();
        viero.nameList();

        ovan.borrowBook("Real");
        viero.borrowBook("Metamorphosis", 24);
        ovan.returnBook("Real");

    }

}
