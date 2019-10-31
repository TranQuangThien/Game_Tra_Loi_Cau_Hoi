package com.example.game_tra_loi_cau_hoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button) findViewById(R.id.btnDangNhap);
//        button.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                openQLTK();
////            }
////        });
    }

    public void openQLTK(View view) {
        Intent intent=new Intent(this,activity_Quan_Ly_Tai_Khoan.class);
        startActivity(intent);
    }

    public void openQuenMatKhau(View view) {
        Intent intent=new Intent(this,activity_Quen_mat_khau.class);
        startActivity(intent);
    }

    public void openDangKy(View view) {
        Intent intent=new Intent(this,activity_Dang_ki.class);
        startActivity(intent);
    }
}
