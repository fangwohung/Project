/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author quochung
 */
public class bai5 {
    public static void main(String[] args) {
        ArrayList<SinhVien> SV=new ArrayList<>();
	int n;
	int[] Array=null;
	int _tinhNang;
	Scanner inp =new Scanner(System.in);
	do {
			
		System.out.println("---Chon tinh nang can dung---\n"
                    +"1: De nhap danh sach sinh vien.\n"
                    +"2: Xem danh sach sinh vien da nhap.\n"
                    +"3: Sap xep danh sach theo thu tu diem trung binh tang dan.\n"
                    +"4: Xuat thong tin sinh vien co ho 'Le'.\n"
                    +"5: De thoat khoi chuong trinh.\n");
								
		_tinhNang=inp.nextInt();
			
		switch(_tinhNang) {
		case 1:{
			System.out.println("So luong sinh vien muon nhap la: ");
			n=inp.nextInt();
			Array=new int[n];
			for(int i=0;i<Array.length;i++) {
                            System.out.println("Nhap thong tin sinh vien thu: "+(i+1));
                            SinhVien a=new SinhVien();
                            a.Nhap();
                            SV.add(a);
				
			}	
			break;
		}
		case 2:{
			System.out.println("Danh sach sinh vien da nhap: ");
			for(int i=0;i<SV.size();i++) 
                            SV.get(i).Xuat();
			
			break;
		}
		case 3:{
			System.out.println("Danh sach sinh vien co diem trung binh tang dan: ");
			for(int i=0;i<SV.size();i++) {
                            for(int j=i+1;j<SV.size();j++) 
				if(SV.get(i).get_diemTB()>SV.get(j).get_diemTB()) 
					SV.get(i).hoanVi(SV.get(j));										                            						
			}
			for(int i=0;i<SV.size();i++) 
                            SV.get(i).Xuat();
			
			break;
		}
		case 4: {
                        System.out.println("Danh sach sinh vien co ho la 'Le': ");
			for(int i=0;i<SV.size();i++) {
                            if(SV.get(i).get_Ho().equals("Le")) {
				SV.get(i).Xuat();
						
                            }
			
			}
                        break;
		}			
                }			
	}while(_tinhNang!=5);
	
    }
}
