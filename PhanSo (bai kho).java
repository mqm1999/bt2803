/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rutgonphanso;

/**
 *
 * @author HP Pavilion
 */
    public class PhanSo {
    int tuSo, mauSo;
    public PhanSo(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public void show(){
        System.out.println(tuSo + "/" + mauSo);
    }
    public static PhanSo cong2ps(PhanSo a, PhanSo b){
        int tuSo = a.tuSo * b.mauSo + b.tuSo * a.mauSo;
        int mauSo = a.mauSo * b.mauSo;
        PhanSo c = new PhanSo(tuSo, mauSo);
        return c;
    }
    public static PhanSo tru2ps(PhanSo a, PhanSo b){
        int tuSo = a.tuSo * b.mauSo - b.tuSo * a.mauSo;
        int mauSo = a.mauSo * b.mauSo;
        PhanSo c = new PhanSo(tuSo, mauSo);
        return c;
    }
    public static PhanSo nhan2ps(PhanSo a, PhanSo b){
        int tuSo = a.tuSo * b.tuSo;
        int mauSo = a.mauSo * b.mauSo;
        PhanSo c = new PhanSo(tuSo, mauSo);
        return c;
    }
    public static PhanSo chia2ps(PhanSo a, PhanSo b){
        int tuSo = a.tuSo * b.mauSo;
        int mauSo = a.mauSo * b.tuSo;
        PhanSo c = new PhanSo(tuSo, mauSo);
        return c;
    }
    int UCLN(int a, int b) {
        while(a != b)
        {
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        int UCLN = a;
        return UCLN;
    }
    public void rutGonps(){
        int x = UCLN(this.tuSo, this.mauSo);
        this.tuSo = this.tuSo / x;
        this.mauSo = this.mauSo / x;
    }
}
