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
public class SoPhuc {
    private
	float thuc, ao;
    SoPhuc(){thuc=0;ao=0;};
    SoPhuc(int Thuc, int Ao)
    {
        thuc=Thuc;ao=Ao;
    }
    public SoPhuc Cong(SoPhuc x)
    {
	SoPhuc temp= new SoPhuc();
	temp.thuc=thuc+x.thuc;
	temp.ao=ao+x.ao;
	return temp;
    }
	
    public SoPhuc Tru(SoPhuc x)
    {
	SoPhuc temp= new SoPhuc();
	temp.thuc=thuc+x.thuc;
	temp.ao=ao+x.ao;
	return temp;
    }
    public SoPhuc Nhan(SoPhuc x)
	{
		SoPhuc temp= new SoPhuc();
		temp.thuc=thuc*x.thuc - ao*x.ao;
		temp.ao=thuc*x.ao+ao*x.thuc;
		return temp;
	}
	
    public SoPhuc Chia(SoPhuc x)
    {
	SoPhuc temp= new SoPhuc();
	temp.thuc=(thuc*x.thuc + ao*x.ao)/(thuc*thuc+ao*ao);
	temp.ao=(thuc*x.ao+ao*x.thuc)/(thuc*thuc+ao*ao);
	return temp;
    }

    public void Show()
    {
	System.out.printf("%s + %si", thuc,ao);
    }
}
