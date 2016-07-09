package com.mwongera.rento;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by imaya on 6/30/16.
 */
public class SignupActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.btn_signup);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, LoginActivity.class);
                startActivity(intent);

            }

        });

    }
}