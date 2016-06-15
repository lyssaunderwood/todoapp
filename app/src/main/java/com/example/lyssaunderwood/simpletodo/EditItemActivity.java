package com.example.lyssaunderwood.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText editText;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String text = getIntent().getStringExtra("text");
        position = getIntent().getIntExtra("position", 0);
        editText = (EditText) findViewById(R.id.editText);
        editText.setText(text);
    }


    public void onEditItem(View view) {
        String newText;
        newText = editText.getText().toString();
        Intent data = new Intent();
        data.putExtra("text", newText);
        data.putExtra("position", position);
        setResult(RESULT_OK, data);
        finish();
    }

}
