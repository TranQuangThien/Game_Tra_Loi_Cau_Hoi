package com.example.game_tra_loi_cau_hoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_Quan_Ly_Tai_Khoan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__quan__ly__tai__khoan);
    }

    public void openMuaCredit(View view) {
        Intent intent=new Intent(this,MuaCredit.class);
        startActivity(intent);
    }

    public void openCapNhatTK(View view) {
        Intent intent=new Intent(this,activity_Cap_nhat_tai_khoan.class);
        startActivity(intent);
    }

    public void OpenLinhVuc(View view) {
        Intent intent=new Intent(this,LinhVuc.class);
        startActivity(intent);
    }
}
