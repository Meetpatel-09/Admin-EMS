package com.example.adminems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.adminems.faculty.ViewFaculty;
import com.example.adminems.notice.DeleteNoticeActivity;
import com.example.adminems.notice.UploadNotice;
import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MaterialCardView uploadNotice, addGalleryImage, addEbook, addFaculty, deleteNotice;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private Button logOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = this.getSharedPreferences("login", MODE_PRIVATE);
        editor = sharedPreferences.edit();

        if (sharedPreferences.getString("isLogin", "false").equals("false")) {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        }

        uploadNotice = findViewById(R.id.add_notification);
        addGalleryImage = findViewById(R.id.add_image);
        addEbook = findViewById(R.id.add_ebook);
        addFaculty = findViewById(R.id.add_faculty);
        deleteNotice = findViewById(R.id.delete_notice);
        logOut = findViewById(R.id.btn_logout);

        uploadNotice.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);
        addEbook.setOnClickListener(this);
        addFaculty.setOnClickListener(this);
        deleteNotice.setOnClickListener(this);
        logOut.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.add_notification:
                intent = new Intent(MainActivity.this, UploadNotice.class);
                startActivity(intent);
                break;
            case R.id.add_image:
                intent = new Intent(MainActivity.this, UploadImage.class);
                startActivity(intent);
                break;
            case R.id.add_ebook:
                intent = new Intent(MainActivity.this, UploadPdf.class);
                startActivity(intent);
                break;
            case R.id.add_faculty:
                intent = new Intent(MainActivity.this, ViewFaculty.class);
                startActivity(intent);
                break;
            case R.id.delete_notice:
                intent = new Intent(MainActivity.this, DeleteNoticeActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_logout:
                editor.putString("isLogin", "false");
                editor.commit();
                intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}