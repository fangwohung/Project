/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author quochung
 */
public class bai2 {
    public static void main(String[] args) {
        
	Time a = new Time();
	Time b = new Time();
	System.out.println("nhap thoi gian thu 1: ");
	a.Input();
	System.out.println("nhap thoi gian thu 2: ");
	b.Input();			
	System.out.println("thoi gian lon hon la: ");				
	a.sosanh(b).Show();
	System.out.println("");			
	a.tang();
    }
  
}
