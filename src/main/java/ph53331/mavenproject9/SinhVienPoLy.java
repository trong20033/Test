
package ph53331.mavenproject9;

import java.util.Scanner;

public class SinhVienPoLy extends SinhVien{
    private int hocKy;

    public SinhVienPoLy() {
    }

    public SinhVienPoLy(int hocKy) {
        this.hocKy = hocKy;
    }

    public SinhVienPoLy(int hocKy, String hoTen, String maSV, double diem) {
        super(hoTen, maSV, diem);
        this.hocKy = hocKy;
    }

    public int getHocKy() {
        return hocKy;
    }

    public void setHocKy(int hocKy) {
        this.hocKy = hocKy;
    }

    @Override
    public String toString() {
        return super.toString() + "Hoc ky: "+hocKy;
    }
    @Override
    public void xuat(){
        System.out.println(toString());
    }
     @Override
     public void nhap(){
         Scanner sc = new Scanner(System.in);
         super.nhap();
         System.out.println("Nhap vao hoc ki: ");
         hocKy = Integer.parseInt(sc.nextLine());
     }
    
    
    
}
