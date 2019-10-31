package com.example.game_tra_loi_cau_hoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LinhVuc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linh_vuc);
    }

    public void openGame2(View view) {
        Intent intent=new Intent(this,TroChoi.class);
        startActivity(intent);
    }

    public void opengame1(View view) {
        Intent intent=new Intent(this,TroChoi.class);
        startActivity(intent);
    }

    public void opengame3(View view) {
        Intent intent=new Intent(this,TroChoi.class);
        startActivity(intent);
    }

    public void opengame4(View view) {
        Intent intent=new Intent(this,TroChoi.class);
        startActivity(intent);
    }
}
