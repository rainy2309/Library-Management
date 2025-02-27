import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }
    //add
    public static void addBook(Book book) {
        books.add(book);
        System.out.println("Đã thêm sách: "+book.getTitle());
    }
   //delete
    public void deleteBook(int id) {
        Book bookremove = null;
        for (Book book : books) {
            if (book.getId() == id) {
                bookremove = book;
                break;
            }
        }
        if (bookremove != null) {
            books.remove(bookremove);
            System.out.println("Đã xóa sách: " + bookremove.getTitle() + ", ID: " + bookremove.getId());
        } else {
            System.out.println("Không tìm thấy id");
        }
    }
    //update
    public void updatebook(int id, String title, String author, int year){
        for (Book book: books){
            if(book.getId()==id){
                book.setTitle(title);
                book.setAuthor(author);
                book.setYear(year);
                System.out.println("Đã cập nhật thông tin sách: "+ book.getId());
            }
        }
    }
    //display
    public void displayAllBooks(){
        for(Book book:books){
            if(book==null){
                System.out.println("Không có sách");
            }else{
                System.out.println(book);
            }
        }
    }
}
