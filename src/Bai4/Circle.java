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
public class Circle extends Shape {
	
	private
	float r;	       
	@Override
	public double Dientich() {
		// TODO Auto-generated method stub
		return r* Math.PI;
	}
	@Override
	public String toString() {			
		return "Hinh tron co Dien tich S = " + Dientich() ;
	}

	@Override
	void Nhap() {
		// TODO Auto-generated method stub
		System.out.printf("\nNhap ban kinh:  ");
		Scanner in= new Scanner(System.in);
		r=in.nextFloat();
	}
    
}
