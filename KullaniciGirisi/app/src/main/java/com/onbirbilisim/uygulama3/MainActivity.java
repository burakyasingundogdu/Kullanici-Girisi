package com.onbirbilisim.uygulama3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText_KulAdi;
    EditText editText2_Sifre;
    Button button;

    final String kullaniciAdi="burak";
    final String Sistem_sifre="1881";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_KulAdi = findViewById(R.id.editTextText);
        editText2_Sifre = findViewById(R.id.editTextText2);
        button = findViewById(R.id.button);
    }
    public void giris(View view){
        String kul_adi=editText_KulAdi.getText().toString();
        String sifre=editText2_Sifre.getText().toString();
        if (kul_adi.equals(kullaniciAdi)&&sifre.equals(Sistem_sifre)) {
            Toast.makeText(MainActivity.this, "Giriş onaylandı", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this,"Giriş onaylanmadı",Toast.LENGTH_LONG).show();

        }


    }
}