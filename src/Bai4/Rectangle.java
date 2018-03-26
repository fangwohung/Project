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
public class Rectangle extends Shape {

	private
	float a,b;	
	@Override
	public double Dientich() {
		// TODO Auto-generated method stub
		return a*b;
	}
	@Override
	public String toString()  {
		// TODO Auto-generated method stub
		return "Hinh Chu nhat co Dien tich S = "+ Dientich();
	}
	@Override
	public void Nhap() {
		// TODO Auto-generated method stub
		System.out.print("\nNhap chieu dai va chieu rong:  ");
		Scanner inp= new Scanner(System.in);
		a=inp.nextFloat();
		b=inp.nextFloat();
	}
    
}
