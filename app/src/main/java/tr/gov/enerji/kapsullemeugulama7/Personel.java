package tr.gov.enerji.kapsullemeugulama7;

import android.util.Log;

public class Personel {
    private int yas;

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
}
