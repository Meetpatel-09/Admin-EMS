package com.example.adminems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MaterialCardView uploadNotice, addGalleryImage, add_ebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice = findViewById(R.id.add_notification);
        addGalleryImage = findViewById(R.id.add_image);
        add_ebook = findViewById(R.id.add_ebook);

        uploadNotice.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);
        add_ebook.setOnClickListener(this);
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
        }
    }
}