/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author quochung
 */
public class Point2D {
    private int x;
    private int y;
    public
            Point2D()
            {
                x=y=0;
            }
            Point2D(int X, int Y)
            {
                x=X;
                y=Y;
            }
            Point2D getPoint()
            {                          
                return new Point2D(x,y); 
            }
            void Move(Point2D a) 
            {
               // return new Point2D(x+a.x,y+a.y);
                x+=a.x;
                y+=a.y;
            }
            double Distance(Point2D b)
            {
		return Math.sqrt(Math.pow(x-b.x,2)+Math.pow(y-b.y,2));
            }
            void Output()
            {
		System.out.printf("(%d;%d) ",x,y);
            }
            void Input()
            {
		System.out.print("nhap toa do x = ");
		Scanner inp = new Scanner(System.in);
		x=inp.nextInt();
                System.out.print("nhap toa do y = ");
		y=inp.nextInt();
            }
            
}
