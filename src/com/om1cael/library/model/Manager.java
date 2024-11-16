package com.om1cael.library.model;

public class Manager extends User {
    public Manager(String name, int id, String email) {
        super(name, id, email);
    }

    public User addUser(String name, int id, String email) {
        return new User(name, id, email);
    }

    public void loanedByUser(User user) {
        if(user.getLoanedBook() == null) {
            System.out.println(user.getName() + " has not loaned any book.");
            return;
        }

        System.out.println("Book " + user.getLoanedBook().getTitle() + " is loaned by " + user.getName());
    }

    public void loanBook(User user, Book book) {
        if(book.isAvailable()) {
            user.setLoanedBook(book);
            System.out.println("Loaning book " + book.getTitle() + " to " + user.getName() + ".");
            book.setAvailable(false);
        } else {
            System.out.println("The book is not available for loan.");
        }
    }

    public void listBooks(Book[] listOfBooks) {
        System.out.println();
        System.out.println("List of books:");
        for(Book book : listOfBooks) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}
