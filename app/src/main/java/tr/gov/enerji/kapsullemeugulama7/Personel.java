package tr.gov.enerji.kapsullemeugulama7;

import android.util.Log;

public class Personel {
    private int yas;
    private long maas;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas<18 || yas>55){
            Log.e("Kapsülleme","Hatalı yaş");
            yas=18;
        }
        this.yas = yas;
    }

    public long getMaas() {
        return maas;
    }

    public void setMaas(long maas) {
        if(maas<4253){
            Log.e("Kapsülleme","Hatalı maaş");
            maas=4253;
        }
        this.maas = maas;
    }
}
