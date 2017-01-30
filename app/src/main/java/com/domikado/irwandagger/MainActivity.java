package com.domikado.irwandagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;


import com.domikado.irwandagger.module.DataModule;

import javax.inject.Inject;

import static com.domikado.irwandagger.R.id.test;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    ApplicationComponent applicationComponent;

    @Inject
    DomikadoUser domikadoUser;

    @Inject
    Test tester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(test);

        applicationComponent = DaggerApplicationComponent.builder()
                .dataModule(new DataModule())
                .build();
        applicationComponent.inject(this);


        textView.setText(domikadoUser.say("hello world"));
        String a = tester.getNama();
        Toast.makeText(this, a, Toast.LENGTH_SHORT).show();

    }
}
