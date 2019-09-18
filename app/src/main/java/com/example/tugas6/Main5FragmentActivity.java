package com.example.tugas6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5_fragment);

        Button btnfrag1 = findViewById(R.id.BtnFrag1);
        Button btnfrag2 = findViewById(R.id.BtnFrag2);

        btnfrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.FrameMain5, new ListMahasiswaFragment());
                ft.commit();
            }
        });

        btnfrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.FrameMain5, new EditDataFragment());
                ft.commit();
            }
        });
    }
}
