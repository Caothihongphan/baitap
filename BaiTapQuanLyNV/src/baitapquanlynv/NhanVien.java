/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapquanlynv;

/**
 *
 * @author DELL
 */
public class NhanVien extends BaiTapQuanLyNV{
    private double tinhThuong;
    
    public NhanVien() {
        super();
    }
    
    
    public double tinhThuong() {
        if(this.tongSohl<100)
            return this.tinhThuong=0;
        else
            if( this.tongSohl>200 )
                return this.tinhThuong = this.tienLuong * 20000;
        return 
                this.tinhThuong=this.tienLuong *1/10;
     
    
}
}
