import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }
    //add
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Đã thêm sách: "+book.getTitle());
    }
   //delete
    public void deleteBook(int id){
        Book bookremove= null;
        for(Book book:books){
            if(book.getId()==id){
                bookremove=book;
                break;
            }
        }
        if(bookremove!= null){
            books.remove(bookremove);

        System.out.println("Đã xóa sách: "+bookremove.getTitle()+"ID: "+bookremove.getId());
        } else{
            System.out.println("Không tìm thấy id");
        }
    }
}
