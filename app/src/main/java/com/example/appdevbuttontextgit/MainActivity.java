package com.example.appdevbuttontextgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView countText,checkFruitName,showCount;
    int countFruit = 0;
    String fruitname;
    Button btn;
    EditText editTextFruit,initialCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countText = findViewById(R.id.textViewCount);
        btn = findViewById(R.id.buttonPlus);
        editTextFruit = findViewById(R.id.editTextFruit);
        checkFruitName = findViewById(R.id.textCheckFruitName);
        initialCount = findViewById(R.id.editTextFruitCount);
        showCount = findViewById(R.id.textShowCount);

        showCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countFruit = Integer.parseInt(initialCount.getText().toString());
                countText.setText(String.valueOf(countFruit));
            }
        });





        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                countFruit = countFruit +1;
                countText.setText(String.valueOf(countFruit));


            }
        });

        checkFruitName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fruitname = editTextFruit.getText().toString();

                Toast.makeText(MainActivity.this, "Your fruit name is "+fruitname, Toast.LENGTH_SHORT).show();
            }
        });

    }
}