package com.blueticks.journal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

public class CreateAccountActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button createButton;
    private ProgressBar progressBar;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private FirebaseUser currentUser;

    // Firestore Connection
    private FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        mAuth = FirebaseAuth.getInstance();

        usernameEditText = findViewById(R.id.username_account);
        emailEditText = findViewById(R.id.email_account);
        passwordEditText = findViewById(R.id.password_account);
        createButton = findViewById(R.id.create_acct_button);
        progressBar = findViewById(R.id.create_acct_progress);
    }

    @Override
    protected void onStart() {
        super.onStart();
        currentUser = mAuth.getCurrentUser();
        mAuth.addAuthStateListener(authStateListener);
    }
}