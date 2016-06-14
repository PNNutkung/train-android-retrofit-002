package com.example.nut.retrofittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.second_activity_text_view)
    TextView secondActivityTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);

        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString("INPUT_TEXT");
        secondActivityTextView.setText(text);
    }
}
