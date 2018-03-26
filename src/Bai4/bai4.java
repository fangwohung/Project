/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author quochung
 */
public class bai4 {
    public static void main(String[] args) {
        
	System.out.println("cho biet mang co bao nhieu hinh: ");
	Scanner inp = new Scanner(System.in);
	int n = inp.nextInt();
	Shape []a= new Shape[n];
	int hcn=0;
	for(int i=0;i<n;i++)
	{
            System.out.printf("\n0->HCN || 1->TRON \nHinh thu "+(i+1));
            int flag = inp.nextInt();
            if(flag==0)
            {
		a[i] = new Rectangle();
		a[i].Nhap();
		hcn++;
            }
            else
            {
		a[i] = new Circle();
		a[i].Nhap();
            }
	}
	System.out.printf("\n Co %s HCN va %s Hinh tron", hcn,n-hcn);
	double max=a[0].Dientich();
	int pos =0;
	for(int i=1;i<n;i++)
	{
            if(a[i].Dientich()> max)
            {
		max=a[i].Dientich();
		pos=i;
            }
	}
        System.out.print("\n Hinh co dien tich lon nhat la: \n "+a[pos].toString());
					
	}
    
}
