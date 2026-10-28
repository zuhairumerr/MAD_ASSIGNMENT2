package com.example.expense;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button btnProfile = findViewById(R.id.btnModuleProfile);
        Button btnCourses = findViewById(R.id.btnModuleCourses);
        Button btnGrades = findViewById(R.id.btnModuleGrades);
        Button btnSettings = findViewById(R.id.btnModuleSettings);

        btnProfile.setOnClickListener(v -> startActivity(new Intent(DashboardActivity.this, ProfileActivity.class)));
        btnCourses.setOnClickListener(v -> Toast.makeText(this, "Courses Clicked", Toast.LENGTH_SHORT).show());
        btnGrades.setOnClickListener(v -> Toast.makeText(this, "Grades Clicked", Toast.LENGTH_SHORT).show());
        btnSettings.setOnClickListener(v -> Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show());
    }
}