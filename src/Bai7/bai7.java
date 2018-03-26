/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.Scanner;

/**
 *
 * @author quochung
 */
public class bai7 {
    public static void main(String[] args) {
        int a1,a2;
	float b1;
	float c1,c2,c3;
	Scanner in=new Scanner(System.in);
		
	System.out.println("Nhap hai so nguyen: ");
	a1=in.nextInt();
	a2=in.nextInt();
	System.out.println("Uoc chung lon nhat cua hai so nguyen: "+MyMath.USCLN(a1, a2));
	System.out.println("Nhap 3 so thuc:");
	c1=in.nextFloat();
	c2=in.nextFloat();
	c3=in.nextFloat();
	System.out.println("Gia tri lon nhat cua ba so thuc: "+MyMath.Max3so(c1, c2, c3));
	System.out.println("Gia tri nho nhat cua ba so thuc: "+MyMath.Min3so(c1, c2, c3));
		
	if(MyMath.ktSNT(a1)==true)
            System.out.println(a1+" la so nguyen to");
	else
            System.out.println(a1+" Khong la so nguyen to");		
	System.out.println("Tong tu 1+..+"+a2+" la: "+MyMath.SumN(a2));		
	System.out.println("Tri tuyet doi cua " +a1+" la:"+MyMath.trituyetdoi(a1));		
	System.out.println("Nhap so thuc can lam tron: ");
	b1=in.nextFloat();
	System.out.println(b1+"Sau khi lam tron la: "+MyMath.lamTron(b1));
    }
}
