/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author DELL
 */
public class BaiTap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVienIT it = new SinhVienIT("Nguyen Van A", "CNTT", 9, 10, 10);
        it.xuat();
        System.out.println("diem: " + it.getDiem());
        System.out.println("hoc luc: " + it.getHocLuc());
        // TODO code application logic here
    }
    
}
