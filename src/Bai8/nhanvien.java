/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

import java.util.Scanner;

/**
 *
 * @author quochung
 */
public class nhanvien {
    private String hoten;
    private int ngay;
    private int thang;
    private int nam;
    private float hesoluong;
    private String tenphongban;
    
    nhanvien()
    {
        
    }
    nhanvien(String hoten,int ngay,int thang,int nam, float hsl,String pb)
    {
        this.hoten=hoten;
        this.ngay=ngay;
        this.thang=thang;
        this.nam=nam;
        hesoluong=hsl;
        tenphongban=pb;
    }
    public void setNhanvien(String hoten,int ngay,int thang,int nam, float hsl,String pb)
    {
        this.hoten=hoten;
        this.ngay=ngay;
        this.thang=thang;
        this.nam=nam;
        hesoluong=hsl;
        tenphongban=pb;
    }
    public int getNgay()
    {
        return ngay;
    }
    public int getThang()
    {
        return thang;
    }
    public int getNam()
    {
        return nam;
    }
    public String getHoten()
    {
        return hoten;
    }
     public float getHesoluong()
    {
        return hesoluong;
    }
      public String getTenphongban()
    {
        return tenphongban;
    }
    public nhanvien getNhanvien()
    {
        return new nhanvien(hoten,ngay,thang,nam,hesoluong,tenphongban);
    }
    public void nhap()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ten nhan vien: ");
        hoten=in.nextLine();
        System.out.print("Nhap ngay thang nam sinh: ");
        ngay=in.nextInt();
        thang = in.nextInt();
        nam = in.nextInt();
        System.out.print("Nhap he so luong: ");
        hesoluong=in.nextFloat();
        System.out.print("Nhap ten phong ban: ");
        in.nextLine(); 
        tenphongban=in.nextLine();       
    }
    public void xuat()
    {
        System.out.println("");
        System.out.printf("Ten nhan vien: %s\nNgay sinh: %d/%d/%d\nHe so luong: %f"
                +"\nTen phong ban: %s"
                ,hoten,ngay,thang,nam,hesoluong,tenphongban);
    }
    public float tinhluong()
    {
        return hesoluong*1200000;
    }
    
            
}
