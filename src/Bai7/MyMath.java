/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

/**
 *
 * @author quochung
 */
public class MyMath {
     public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
     public static float Max3so(float a, float b, float c)
     {
         if(a>b && a>c)
             return a;
         if(b>a&& b>c)
             return b;
         return c;
     }
      public static float Min3so(float a, float b, float c)
     {
         if(a<b && a<c)
             return a;
         if(b<a && b<c)
             return b;
         return c;
     }
      public static boolean ktSNT(int n)
      {
          if(n<2)
              return false;
          for(int i=2;i<n;i++)
              if(n%i==0)
                  return false;
          return true;
      }
      public static int trituyetdoi(int n)
      {
          return Math.abs(n);
      }
      public static int SumN(int n)
      {
          int s=0;
          for(int i=1;i<=n;i++)
              s+=i;
          return s;
      }
      public static int lamTron(float a) {
            return (int)Math.round(a);
      }
}
