package com.example.expense;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private EditText etName, etEmail, etPassword, etConfirmPassword;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            String email = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString().trim();
            String confirmPassword = etConfirmPassword.getText().toString().trim();

            if (TextUtils.isEmpty(name)) { etName.setError("Name required"); return; }
            if (TextUtils.isEmpty(email)) { etEmail.setError("Email required"); return; }
            if (TextUtils.isEmpty(password)) { etPassword.setError("Password required"); return; }
            if (!password.equals(confirmPassword)) { etConfirmPassword.setError("Passwords mismatch"); return; }

            Toast.makeText(this, "Registered successfully!", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}