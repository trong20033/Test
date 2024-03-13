
package ph53331.mavenproject9;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSV ql = new QLSV();
        while(true){
            menu();
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.exit(0);
                    break;
                case 2:
                    ql.nhapDSSV();
                    break;
                case 3:
                    ql.inDSSV();
                    break;
                case 4:
                    ql.capNhapThongTinNV();
                    break;
                case 5:
                    ql.sapXepSVtheoDiem();
                    break;
                case 6:
                    SinhVienPoLy svp = new SinhVienPoLy(2, "hoTen", "maSV", 10.0);
                    svp.xuat();
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
    }
    
    public static void menu(){
        System.out.println("1. Dung chuong trinh");
        System.out.println("2. Nhap danh sach sinh vien");
        System.out.println("3. xuat danh sach sinh vien");
        System.out.println("4. Tim va sua sinh vien theo ma");
        System.out.println("5. Sap xep danh sach sinh vien theo diem");
        System.out.println("6. Sinh vien Poly");
        System.out.print("Moi ban chon chuc nang: ");
    }
}
