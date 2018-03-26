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
public class bai8 {
    public static void main(String[] args) {
        nhanvien danhsach[];
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        int n = in.nextInt();
        danhsach = new nhanvien[n];
        System.out.print("1-Giam doc 2-Quan ly 3-Nhan vien");
        for(int i=0;i<n;i++)
        {
            int choice;
            System.out.print("Moi ban nhap su lua chon ");
            choice=in.nextInt();
            if(choice ==1)
            {
                danhsach[i]=new giamdoc();
                danhsach[i].nhap();
            }
            else if(choice ==2)
            {
                danhsach[i]=new quanly();
                danhsach[i].nhap();
            }
            else if(choice==3)
            {
                danhsach[i]=new nhanvien();
                danhsach[i].nhap();
            }             
        }
        for(int i=0;i<n;i++)
        {
            danhsach[i].xuat();
            System.out.println("");
        }
        float luongmax= danhsach[0].tinhluong();
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(luongmax>danhsach[i].tinhluong()){
                luongmax= danhsach[i].tinhluong();
                j=i;
            }
        }
        danhsach[j].xuat();
        for(int i =0;i<n;i++){
            if(danhsach[i].getThang()==2){
                danhsach[i].xuat();
                System.out.println("");
            }
        }
        for(int i=0;i<n;i++)
        {
             if(danhsach[i].getTenphongban().equalsIgnoreCase("ke toan")){
                danhsach[i].xuat();
                System.out.println("");
            }
        }
        int dem=0;
        for(int i=0;i<n;i++)
        {
             if(danhsach[i].getHoten().contains("An")){
                danhsach[i].xuat();
                System.out.println("");
                dem++;
            }
        }
        System.out.println("co "+dem +"ten An");
    }
}
