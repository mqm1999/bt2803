/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

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
    void show(){
        System.out.println(this.tuSo + "/" + this.mauSo);
    }
    void cong(int x){
        tuSo = tuSo + mauSo * x;
    }
    void tru(int x){
        tuSo = tuSo - mauSo * x;
    }
    void nhan(int x){
        tuSo = tuSo * x;
    }
    void chia(int x){
        mauSo = mauSo * x;
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