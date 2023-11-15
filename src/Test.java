import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        DanhSachSanPham danhSachSanPham = new DanhSachSanPham();
        Scanner scanner=new Scanner(System.in);
        int choice=0;
        do {
            System.out.println("-----------Menu-------------");
            System.out.println("Danh sach san pham");
            System.out.println("1. Thêm sản phẩm\n"+
                    "2. Hiển thị sản phẩm\n"+
                    "3. Tim thông tin sản phẩm\n"+
                    "4. Xóa sản phẩm\n"+
                    "0. Thoát khỏi chương trình\n");
            choice=scanner.nextInt();
            scanner.nextLine();
            if (choice==1){
                System.out.println("Nhập id sp");
                int id = scanner.nextInt();
                System.out.println("Nhập Tên sản phẩm");
                String name = scanner.nextLine();
                System.out.println("Nhập địa chỉ sản phẩm");
                String price = scanner.nextLine();
                System.out.println("Nhập số lượng");
                int quatity = scanner.nextInt();
                SanPham sanPham = new SanPham(id,name,price,quatity);
                danhSachSanPham.add(sanPham);


            } else if (choice==2) {
                danhSachSanPham.inDsSinhVien();
                scanner.nextLine();
            } else if (choice==3) {
                System.out.println("Sản phầm cần tìm");

                String find = scanner.nextLine();
                danhSachSanPham.findAll(find);

            }else if (choice==4){
                System.out.println("Sản phầm cần xóa");
               int deletel = scanner.nextInt();
               danhSachSanPham.dellete(deletel);
            }


        }while (choice!=0);



    }
}
