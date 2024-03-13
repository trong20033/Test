package ph53331.mavenproject9;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {

    ArrayList<SinhVien> lssv = new ArrayList<>();

    public void nhapDSSV() {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        while (true) {
            sv.nhap();
            lssv.add(sv);
            System.out.print("Ban co muon tiep tuc nhap khong ? (Y/N): ");
            String traLoi = sc.nextLine();
            if (traLoi.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void inDSSV() {
        for (SinhVien sv : lssv) {
            sv.xuat();
        }
    }

    public void sapXepSVtheoDiem() {
        lssv.sort((o1, o2) -> {
            Double d1 = o1.getDiem();
            Double d2 = o2.getDiem();
            return d1.compareTo(d2);
        });
    }

    public void capNhapThongTinNV() {
        boolean ketQua = false;
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma sinh vien ban muon tim kiem:  ");
        String timKiem = sc.nextLine();
        System.out.println("Thong tin ban tim duoc");
        for (SinhVien nv : lssv) {
            if (nv.getMaSV().equalsIgnoreCase(timKiem)) {
                nv.xuat();
                System.out.println("Cap nhap thong tin sinh vien. \nNhan Enter de bo qua nhung gia tri khong can cap nhap.");
                ketQua = true;
                System.out.print("Moi nhap vao ho ten moi: ");
                String hoTenNew = sc.nextLine();
                if (!hoTenNew.equalsIgnoreCase("")) {
                    nv.setHoTen(hoTenNew);
                }
                System.out.print("Moi nhap vao ma SV moi: ");
                String maSVNew = sc.nextLine();
                if (!maSVNew.equalsIgnoreCase("")) {
                    nv.setMaSV(maSVNew);
                }
                System.out.print("Moi nhap vao diem moi: ");
                String diemNew = sc.nextLine();
                if (!diemNew.equalsIgnoreCase("")) {
                    nv.setDiem(Double.parseDouble(diemNew));
                }
                lssv.set(index, nv);
                System.out.println("Hoan thanh cap nhap.");
                break;
            }
            index++;

        }

        if (ketQua == false) {
            System.out.println("Khong co sinh vien ma ban muon tim!!!");
        }

    }
}
