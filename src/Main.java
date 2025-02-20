import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm Sách");
            System.out.println("2. Xóa Sách");
            System.out.println("3. Cập Nhật Sách");
            System.out.println("4. Hiển Thị Sách");
            System.out.println("Chọn số đê: ");
            Scanner sc = new Scanner(System.in);
            int choice= sc.nextInt();
            switch (choice){
                case 1:
                    Library.addBook(new Book());

            }

        }

    }
}