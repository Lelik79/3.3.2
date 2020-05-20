package com.example.a332;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Spinner mLanguageSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLanguageSpinner = findViewById(R.id.languageSpinner);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Locale locale;


                if (mLanguageSpinner.getSelectedItem().toString().equals("English")) {
                    locale = new Locale("en");
                } else {
                    locale = new Locale("ru");
                }

                Configuration config = new Configuration();
                config.setLocale(locale);
                getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                recreate();

                Toast.makeText(MainActivity.this
                        , mLanguageSpinner.getSelectedItem().toString()
                                + " "

                        , Toast.LENGTH_LONG)
                        .show();
            }


        });

    }

}