package tr.gov.enerji.kapsullemeugulama7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextYas = findViewById(R.id.editTextYas);
        EditText editTextMaas = findViewById(R.id.editTextMaas);
        Button buttonKaydet = findViewById(R.id.buttonKaydet);
        TextView textViewSonuc = findViewById(R.id.textViewSonuc);
        buttonKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int yas = Integer.parseInt(editTextYas.getText().toString());
                long maas=Long.parseLong(editTextMaas.getText().toString());
                Personel personel = new Personel();
                personel.setYas(yas);
                personel.setMaas(maas);
                textViewSonuc.setText("Yaş:"+personel.getYas()+" Maaş:"+personel.getMaas());
            }
        });
    }
}