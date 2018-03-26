/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.util.Scanner;
/**
 *
 * @author quochung
 */
public class Time {
    private
	int gio ;
	int phut;
	int giay;
	
    public
	Time() {gio=0;phut=0;giay=0;};
	Time(int Gio, int Phut, int Giay){gio=Gio;phut = Phut;giay=Giay;};
	Time(Time x){gio = x.gio;phut=x.phut;giay=x.giay;}
	void setGio(int Gio)
        {
            gio=Gio;
        }
        void setPhut(int Phut)
        {
            phut=Phut;
        }
        void setGiay(int Giay)
        {
            giay=Giay;
        }
        
	void Input()
	{
		System.out.println("nhap gio phut giay: ");
		Scanner inp= new Scanner(System.in);
		int a =inp.nextInt();
		int b=inp.nextInt();
		int c = inp.nextInt();
		while(c>=60)
		{
			b+=1;
			c-=60;
			
		}	
		while (b>=60)
		{
			a+=1;
			b-=60;
			
		}
		gio=a;
		phut=b;
		giay=c;
	}
	void Show()
	{
            System.out.printf("%s gio %s phut %s giay\n",gio,phut,giay);
	}
	Time sosanh(Time x) //return lon
	{
		if (gio<x.gio)
		{ 
			return x;
		}
		else
			if(phut<x.phut)
				return x;
			else
				if(giay<x.giay)
					return x;
		
		return this;
	}
	void tang() 
	{
		while (true)
		{
			Show();
			
			while(giay>=60)
			{
				phut+=1;
				giay-=60;
				
			}	
			while (phut>=60)
			{
				gio+=1;
				phut-=60;
				
			}
			giay++;
			try        
			{
			    Thread.sleep(1000);
			} 
			catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
		}
	}
}
