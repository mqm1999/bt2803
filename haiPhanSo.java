/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rutgonphanso;

import static rutgonphanso.PhanSo.chia2ps;
import static rutgonphanso.PhanSo.cong2ps;
import static rutgonphanso.PhanSo.nhan2ps;
import static rutgonphanso.PhanSo.tru2ps;



/**
 *
 * @author HP Pavilion
 */
public class haiPhanSo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    PhanSo a = new PhanSo(1,3);
    PhanSo b = new PhanSo(1,2);
    PhanSo c = cong2ps(a,b);
    c.rutGonps();
    c.show();
    PhanSo d = tru2ps(a,b);
    d.rutGonps();
    d.show();
    PhanSo e = nhan2ps(a,b);
    e.rutGonps();
    e.show();
    PhanSo f = chia2ps(a,b);
    f.rutGonps();
    f.show();
    }
}
