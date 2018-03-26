/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

/**
 *
 * @author quochung
 */
public class bai6 {
    public static void main(String[] args) {
        SoPhuc a = new SoPhuc(3,4);
	SoPhuc b= new SoPhuc(-1,-2);
		
	System.out.print("a= ");
	a.Show();
	System.out.println();
	System.out.print("b= ");
	b.Show();
	System.out.printf("\na+b = ");
	a.Cong(b).Show();
	System.out.printf("\na-b = ");
	a.Tru(b).Show();
	System.out.printf("\na*b = ");
	a.Nhan(b).Show();
	System.out.printf("\na/b = ");
	a.Chia(b).Show();
    }
}
