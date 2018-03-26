/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author quochung
 */
public class bai3 {
    public static void main(String[] args) {
        System.out.println("danh sach co bao nhieu nhan vien: ");
	Scanner inp= new Scanner(System.in);
        int n =inp.nextInt();
	NHANVIEN [] a = new NHANVIEN[n];
	for(int i=0;i<n;i++)
	{
            System.out.printf("\nnhap vien  thu %s",i+1);
            a[i] = new NHANVIEN();
            a[i].nhap();
	}
	double tong=0;
	for(int i=0;i<n;i++)
	{
            a[i].show();
            System.out.println();
            tong += a[i].Tinhluong();
	}
	System.out.print("\nTong luong: "+tong);
			
	double max=a[0].Tinhluong();
	int j=0;
	for(int i=1;i<n;i++)
	{
            if(a[i].Tinhluong() > max)
            {
		max=a[i].Tinhluong();
		j=i;
            }
	}
	System.out.printf("\nNhan vien co luong cao nhat la: \n");
	a[j].show();
    }
}
