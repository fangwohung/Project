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
public class Person {
    private
	String Hoten;
	int Tuoi;
	String Diachi;
	
    public	
	Person() {
            
        }
	Person(String a, int b, String c) {Hoten = a;Tuoi = b; Diachi=c;};
	void show() {
            System.out.printf("Ho ten: %s \nTuoi: %s\nDia chi: %s\n",Hoten,Tuoi,Diachi);
	}
	public void nhap()
	{
		System.out.printf("\nNhap ten, tuoi, dia chi: ");
		Scanner in= new Scanner(System.in);
		Hoten = in.nextLine();
		Tuoi = in.nextInt();
		Diachi = in.nextLine();
	}
}
