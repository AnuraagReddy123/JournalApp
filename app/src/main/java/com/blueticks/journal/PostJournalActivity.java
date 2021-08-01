package com.blueticks.journal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import util.JournalApi;

public class PostJournalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_journal);

        Bundle bundle = getIntent().getExtras();
        JournalApi journalApi = JournalApi.getInstance();

        if (bundle != null) {
            String userName = bundle.getString("userName");
            String userId = bundle.getString("userId");
        }
    }
}