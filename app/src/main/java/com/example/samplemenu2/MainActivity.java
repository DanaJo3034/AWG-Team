package com.example.samplemenu2;

//Standard imports
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {    //This is the onCreate method: When the app is opened, this is what this page will be able to do.
        super.onCreate(savedInstanceState);                 //Default code for onCreate method
        setContentView(R.layout.activity_main);             //Default code for setContentView

        Button secondActbutton = findViewById(R.id.second_act_btn);                 //Locates the button on the screen
        secondActbutton.setOnClickListener(view -> {                                //When the button is clicked, this code will run
            Intent intent = new Intent(this, SecondActivity.class);    //Changes the screen to the second activity
            startActivity(intent);                                                  //Starts the second activity
        });

        Button thirdActbutton = findViewById(R.id.third_act_btn);                   //Locates the button on the screen
        thirdActbutton.setOnClickListener(view -> {                                 //When the button is clicked, this code will run
            Intent intent = new Intent(this, ThirdActivity.class);    //Changes the screen to the third activity
            startActivity(intent);                                                  //Starts the third activity
        });

        //Remember not to mix Kotlin and Java syntax
    }
}