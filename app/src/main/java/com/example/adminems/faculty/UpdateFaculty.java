package com.example.adminems.faculty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.adminems.R;

public class UpdateFaculty extends AppCompatActivity {

    private ImageView updateTeacherImage;
    private EditText updateTeacherName, updateTeacherEmail, updateTeacherPost;
    private Button updateTeacherButton, deleteTeacherButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_faculty);

        updateTeacherImage = findViewById(R.id.update_teacher_image);
        updateTeacherName = findViewById(R.id.update_teacher_name);
        updateTeacherEmail = findViewById(R.id.update_teacher_email);
        updateTeacherPost = findViewById(R.id.update_teacher_post);
        updateTeacherButton = findViewById(R.id.update_teacher_button);
        deleteTeacherButton = findViewById(R.id.delete_teacher_button);


    }
}