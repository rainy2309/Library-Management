public class Main {
    public static void main(String[] args) {
        Book book= new Book(23,"HTB","java",2024);
        System.out.println(book);
        Library library = new Library();
        library.addBook(new Book(1,"JAVA","VN",2231));
        library.addBook(new Book(2,"HTML","VN",2025));
        library.displayAllBooks();

    }
}