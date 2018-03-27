package com.example.ockkj.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button btn_print = null;
    public Button btn_clear = null;
    public EditText edit_name = null;
    public TextView text_view = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_clear = (Button) findViewById(R.id.clearBtn);
        btn_print = (Button) findViewById(R.id.printBtn);

        edit_name = (EditText) findViewById(R.id.name_edit);
        text_view = (TextView) findViewById(R.id.name_text_view);
        // If Clear button is clicked, the field of text_view and edit_text is clear by using empty space.

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_view.setText("");
                edit_name.setText("");
            }
        });
        // If Print button is clicked, the value of string by entered from name_edit is printed in name_text_view.
        btn_print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_view.setText(edit_name.getText().toString());
            }
        });
    }
}