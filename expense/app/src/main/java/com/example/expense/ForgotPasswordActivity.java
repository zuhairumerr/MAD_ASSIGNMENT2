package com.example.expense;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {
    private EditText etRecoveryEmail;
    private Button btnRecover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        etRecoveryEmail = findViewById(R.id.etRecoveryEmail);
        btnRecover = findViewById(R.id.btnRecover);

        btnRecover.setOnClickListener(v -> {
            String email = etRecoveryEmail.getText().toString().trim();
            if (TextUtils.isEmpty(email)) {
                etRecoveryEmail.setError("Email required");
                return;
            }
            Toast.makeText(this, "Recovery initiated", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(ForgotPasswordActivity.this, ResetPasswordActivity.class));
            finish();
        });
    }
}