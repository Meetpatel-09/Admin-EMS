package com.example.adminems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.adminems.faculty.ViewFaculty;
import com.example.adminems.notice.DeleteNoticeActivity;
import com.example.adminems.notice.UploadNotice;
import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MaterialCardView uploadNotice, addGalleryImage, addEbook, addFaculty, deleteNotice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice = findViewById(R.id.add_notification);
        addGalleryImage = findViewById(R.id.add_image);
        addEbook = findViewById(R.id.add_ebook);
        addFaculty = findViewById(R.id.add_faculty);
        deleteNotice = findViewById(R.id.delete_notice);

        uploadNotice.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);
        addEbook.setOnClickListener(this);
        addFaculty.setOnClickListener(this);
        deleteNotice.setOnClickListener(this);
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
        }
    }
}