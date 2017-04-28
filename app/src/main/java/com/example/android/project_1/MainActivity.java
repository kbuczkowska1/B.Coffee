package com.example.android.project_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

import static com.example.android.project_1.R.id.ourinfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


/**
 * Different color in one TextView.
 */
        TextView textView = (TextView)findViewById(ourinfo);
        String text = "<font color=#ffffff>OUR</font><font color=#07b6ee>INFO</font>";
        textView.setText(Html.fromHtml(text));

    }

}