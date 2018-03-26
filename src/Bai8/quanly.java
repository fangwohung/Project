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
public class quanly extends nhanvien {
    private int soluongnvquanly;
    quanly()
    {
        super();
    }
    public int getSoluongnvquanly()
    {
        return soluongnvquanly;
    }
    public void setSoluongnvquanly(int luongnvquanly)
    {
        soluongnvquanly=luongnvquanly;
    }
    @Override
    public void nhap()
    {
        super.nhap();
        Scanner in =new Scanner(System.in);
        System.out.print("Nhap so luong nv quan ly: ");
        soluongnvquanly=in.nextInt();
    }
    @Override
    public float tinhluong()
    {
        return super.tinhluong()+soluongnvquanly;
    }
    @Override
    public void xuat()
    {
        super.xuat();
        System.out.print("\nSo luong nv quan ly: "+soluongnvquanly);     
    }
}
