package com.example.nickzarate.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.nickzarate.myfirstapp.EXTRA_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText bookText = (EditText) findViewById(R.id.edit_book_message);
        EditText chapterText = (EditText) findViewById(R.id.edit_chapter_message);
        EditText verseText = (EditText) findViewById(R.id.edit_verse_message);
        String message = "Your favorite scripture is: "
                + bookText.getText().toString()
                + " "
                + chapterText.getText().toString()
                + ": "
                + verseText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
