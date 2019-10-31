package com.example.game_tra_loi_cau_hoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_Dang_ki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__dang_ki);
    }

    public void openDangKy(View view) {
    }

    public void openMuaCredit(View view) {
        Intent intent=new Intent(this,MuaCredit.class);
        startActivity(intent);
    }

    public void OpenLinhVuc(View view) {
    }
}
