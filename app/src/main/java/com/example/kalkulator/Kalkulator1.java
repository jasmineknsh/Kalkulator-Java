package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator1 extends AppCompatActivity {
    EditText TextNumber1, TextNumber2;
    Button bt_tambah, bt_kurang, bt_kali, bt_bagi, bt_bersih;
    TextView tv_hasil;
    Integer bil1, bil2, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator1);

        TextNumber1 = findViewById(R.id.TextNumber1);
        TextNumber2 = findViewById(R.id.TextNumber2);
        bt_tambah = findViewById(R.id.bt_tambah);
        bt_kurang = findViewById(R.id.bt_kurang);
        bt_bagi = findViewById(R.id.bt_bagi);
        bt_kali = findViewById(R.id.bt_kali);
        bt_bersih = findViewById(R.id.bt_bersih);
        tv_hasil = findViewById(R.id.tv_hasil);

        bt_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bil1 = Integer.parseInt(TextNumber1.getText().toString());
                bil2 = Integer.parseInt(TextNumber2.getText().toString());
                hasil = bil1 + bil2;
                tv_hasil.setText(String.valueOf(hasil));
            }
        });

        bt_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bil1 = Integer.parseInt(TextNumber1.getText().toString());
                bil2 = Integer.parseInt(TextNumber2.getText().toString());
                hasil = bil1 - bil2;
                tv_hasil.setText(String.valueOf(hasil));
            }
        });

        bt_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bil1 = Integer.parseInt(TextNumber1.getText().toString());
                bil2 = Integer.parseInt(TextNumber2.getText().toString());
                hasil = bil1 * bil2;
                tv_hasil.setText(String.valueOf(hasil));
            }
        });

        bt_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bil1 = Integer.parseInt(TextNumber1.getText().toString());
                bil2 = Integer.parseInt(TextNumber2.getText().toString());
                hasil = bil1 / bil2;
                tv_hasil.setText(String.valueOf(hasil));
            }
        });

        bt_bersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextNumber1.setText("");
                TextNumber2.setText("");
                tv_hasil.setText("0");
                TextNumber1.requestFocus();
            }
        });
    }
}