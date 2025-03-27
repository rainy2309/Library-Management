import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm Sách");
            System.out.println("2. Xóa Sách");
            System.out.println("3. Cập Nhật Sách");
            System.out.println("4. Hiển Thị Sách");
            System.out.println("5. Đóng chương trình");
            System.out.println("Chọn số đê: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập ID sách: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập tiêu đề sách: ");
                    String title = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String author = sc.nextLine();
                    System.out.print("Nhập năm xuất bản: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    library.addBook(new Book(id, title, author, year));
                    break;

                case 2:
                    System.out.print("Nhập ID sách cần xóa: ");
                    int removeId = sc.nextInt();
                    sc.nextLine();
                    library.deleteBook(removeId);
                    break;

                case 3:
                    System.out.print("Nhập ID sách cần cập nhật: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập tiêu đề mới: ");
                    String newTitle = sc.nextLine();
                    System.out.print("Nhập tác giả mới: ");
                    String newAuthor = sc.nextLine();
                    System.out.print("Nhập năm xuất bản mới: ");
                    int newYear = sc.nextInt();
                    sc.nextLine();
                    library.updatebook(updateId, newTitle, newAuthor, newYear);
                    break;

                case 4:
                    library.displayAllBooks();
                    break;

                case 5:
                    System.out.println("Thoát...");
                    sc.close();
                    return;

                default:
                    System.out.println("Đéo có số, chọn lại đi");

            }

        }
    }
}