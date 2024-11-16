public class Main {
    public static void main(String[] args) {
        Book books[] = new Book[2];
        books[0] = new Book("Introduction to OOP in Java", "John Marston", 0);
        books[1] = new Book("Introduction to Filesystem in Java", "John Marston", 1);

        Manager manager = new Manager("Paul", 0, "paul@paul.com");
        User user = manager.addUser("John", 1, "test@test.com");
        manager.loanBook(user, books[0]);

        manager.listBooks(books);

        user.returnBook(books[0]);
    }
}