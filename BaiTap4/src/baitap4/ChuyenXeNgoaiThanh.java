/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author DELL
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe {
     
    // attributes
    public String noiDen;
    public int soNgay;
  
    // constructor
    public ChuyenXeNgoaiThanh(int maChuyen, String taiXe, String soXe, double doanhThu, String noiDen, int soNgay) {
      super(maChuyen, taiXe,soXe, doanhThu);
      this.noiDen = noiDen;
      this.soNgay = soNgay;
    }

    // methods
    // in thong tin chuyen xe
    @Override
    public void inThongTinChuyenXe() {
      super.inThongTinChuyenXe();
      System.out.println("noi den: " + this.noiDen);
      System.out.println("so ngay: " + this.soNgay);
    }
    
}
