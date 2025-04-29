package perpustakaan;

public interface BookLoan {
    void borrowBook(String title);
    void returnBook(String title);
    void borrowBook(String title, int duration);
}
