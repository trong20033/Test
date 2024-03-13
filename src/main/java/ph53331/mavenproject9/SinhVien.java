
package ph53331.mavenproject9;

import java.util.Scanner;

public class SinhVien {

    private String hoTen;
    private String maSV;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV, double diem) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap vao ma Sinh Vien: ");
        maSV = sc.nextLine();
        System.out.print("Nhap vao diem: ");
        diem = Double.parseDouble(sc.nextLine());
    }
    
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", maSV=" + maSV + ", diem=" + diem + '}';
    }
    
    
}
