public class User {
    private String name;
    private int id;
    private String email;
    private Book loanedBook;

    public User(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public void returnBook(Book book) {
        if(loanedBook == book) {
            System.out.println("Returning book " + loanedBook.getTitle() + ".");
            book.setAvailable(true);
            return;
        }

        System.out.println("You have not loaned this book.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Book getLoanedBook() {
        return loanedBook;
    }

    public void setLoanedBook(Book loanedBook) {
        this.loanedBook = loanedBook;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
