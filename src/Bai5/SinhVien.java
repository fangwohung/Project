/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author quochung
 */
public class SinhVien {
        private String _Ten;
	private String _Ho;
	private float _diemTB;
	
	public SinhVien() {
		
	}
	
	public SinhVien(String Ho,String Ten,float diemTB) {
		_Ten=Ten;
		_Ho=Ho;
		_diemTB=diemTB;
	}
		
	public String get_Ten() {
		return _Ten;
	}
	
	public float get_diemTB() {
		return _diemTB;
	}
	
	public String get_Ho() {
		return _Ho;
	}
	
	public void set_Ten(String Ten) {
             _Ten = Ten;
	}

	public void set_diemTB(float diemTB) {
             _diemTB = diemTB;
	}	
	public void set_Ho(String Ho) {
             _Ho=Ho;
	}
	public void Nhap() {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Nhap ho:");
		_Ho=in.nextLine();
		System.out.println("Nhap ten: ");
		_Ten=in.nextLine();
		System.out.println("Nhap diem trung binh: ");
		_diemTB=in.nextFloat();
	}
	
	public void Xuat() {
		System.out.println("Sinh vien: "+_Ho +" "+_Ten+" voi Diem trung binh: "+_diemTB);
	}
	
	public void hoanVi(SinhVien a) {
		SinhVien temp=new SinhVien();
		temp._Ten=_Ten;
		temp._Ho=_Ho;
		temp._diemTB=_diemTB;
                
		_Ten=a._Ten;
		_Ho=a._Ho;
		_diemTB=a._diemTB;
                
		a._Ten=temp._Ten;
		a._Ho=temp._Ho;
		a._diemTB=temp._diemTB;
	}
	  
}
