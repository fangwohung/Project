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
public class giamdoc extends nhanvien{
    private float hesochucvu;
    giamdoc()
    {
        super();
    }
   
    @Override
    public void nhap()
    {
        super.nhap();
        Scanner in =new Scanner(System.in);
        System.out.println("Nhap he so chuc vu: ");
        hesochucvu=in.nextFloat();
    }
    @Override
    public void xuat()
    {
        super.xuat();
        System.out.print("\nHe so chuc vu: "+hesochucvu);        
    }
    @Override
    public float tinhluong()
    {
        return super.tinhluong()+hesochucvu*1200000;
    }
    public float gethesochucvu()
    {
        return hesochucvu;
    }
    public void sethesochucvu(float hesochucvu)
    {
        this.hesochucvu=hesochucvu;
    }
}
