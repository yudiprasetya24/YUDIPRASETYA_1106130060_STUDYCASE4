package com.example.yudiprasetya.yudiprasetya_1106130060_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //method saat button ditekan
    public void namaMahasiswa (View view) {
        //untuk berpindah ke aktivitas mahasiswa
        Intent intent = new Intent (getApplicationContext(), NAMAmahasiswa.class);
        startActivity(intent);
    }
    //method saat button ditekan
    public void cariGambar(View view){
        //untuk berpindah ke aktivitas gambar
        Intent intent1 = new Intent (getApplicationContext(), SEARCHINGgambar.class);
        startActivity(intent1);

    }
}