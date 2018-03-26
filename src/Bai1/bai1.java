/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author quochung
 */
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point2D a = new Point2D();
        a.Input();
        Point2D b = new Point2D();
        b.Input();
        System.out.println("Nhap vecto");
        Point2D vec = new Point2D();
        vec.Input();
        a.Move(vec);
        b.Move(vec);
        a.Output();
        b.Output();
        System.out.print("\nKhoang cach 2 diem = "+a.Distance(b));
        
    }
    
}
