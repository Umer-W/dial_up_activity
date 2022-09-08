package com.muhammadumer.explicitandimplicitactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button one,two,three,four,five,six,seven,eight,nine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show();
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2();
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show3();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show4();
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show5();
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show6();
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show7();
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show8();
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show9();
            }
        });

    }
    public void show()
    {


            Intent intent = new Intent(MainActivity.this,MainActivity2.class);

            startActivity(intent);

    }public void show2()
    {


            Intent intent = new Intent(MainActivity.this,MainActivity3.class);

            startActivity(intent);

    }
    public void show3()
    {


            Intent intent = new Intent(MainActivity.this,MainActivity4.class);

            startActivity(intent);

    }public void show4()
    {


            Intent intent = new Intent(MainActivity.this,MainActivity5.class);

            startActivity(intent);

    }public void show5()
    {


            Intent intent = new Intent(MainActivity.this,MainActivity6.class);

            startActivity(intent);

    }public void show6()
    {


            Intent intent = new Intent(MainActivity.this,MainActivity7.class);

            startActivity(intent);

    }public void show7()
    {


            Intent intent = new Intent(MainActivity.this,MainActivity8.class);

            startActivity(intent);

    }
    public void show8()
    {


            Intent intent = new Intent(MainActivity.this,MainActivity9.class);

            startActivity(intent);

    }
    public void show9()
    {


            Intent intent = new Intent(MainActivity.this,MainActivity10.class);

            startActivity(intent);

    }

}