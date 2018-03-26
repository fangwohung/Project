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
public class NHANVIEN extends Person{
    private
	double Luong;
	float Heso;
	
    public
	
    NHANVIEN() {
	super();
    }
    double Tinhluong() {
		return Luong*Heso;
    }
	
    public void nhap()
    {
	super.nhap();
	System.out.println("nhap luong va he so: \n");
	Scanner inp= new Scanner(System.in);
	Luong = inp.nextDouble();
	Heso = inp.nextFloat();
    }
    void show()
    {
	super.show();
	System.out.printf("Luong co ban: %s \n Heso: %s",Luong,Heso);
    } 
}
