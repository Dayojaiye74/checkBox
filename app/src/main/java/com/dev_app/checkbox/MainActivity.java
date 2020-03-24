package com.dev_app.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox banana_checkBox, apple_checkBox, orange_checkBox;
    Button submitButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //call the checkBox from the XML layout
    banana_checkBox = findViewById(R.id.checkBox);
    apple_checkBox = findViewById(R.id.checkBox2);
    orange_checkBox = findViewById(R.id.checkBox3);
    //Call the button and Textview from the XML layout
    submitButton = findViewById(R.id.submitButton);
    textView = findViewById(R.id.textView);

    }
    //Create onClick Method after the Oncreate, Here we set a condition for each of the check box whenever it's clicked

    public void onClick(View view){
        //action to perform when all the checkBox is selected
        if (banana_checkBox.isChecked() == true && apple_checkBox.isChecked()==true && orange_checkBox.isChecked()==true){
            textView.setText("You like all fruits!");
        }
        else if
        //action to perform when Banana and Apple is selected
        (banana_checkBox.isChecked()==true && apple_checkBox.isChecked()==true){
            textView.setText("You like Banana and Apple!");
        }
        else if
            //action to perform when Banana and Orange is selected
        (banana_checkBox.isChecked()==true && orange_checkBox.isChecked()==true){
            textView.setText("You like Banana and Orange!");
        }
        else if
        //action to perform when Apple and Orange is selected
        (apple_checkBox.isChecked()== true && orange_checkBox.isChecked()==true){
            textView.setText("You like Apple and Orange!");
        }
        else if
         //Banana is selected
        (banana_checkBox.isChecked()==true){
            textView.setText("You like Banana!");
        }
        else if
        ////Apple is selected
        (apple_checkBox.isChecked()==true){
            textView.setText("You like Apple!");
        }
        else if
         //Orange is selected
        (orange_checkBox.isChecked()==true){
            textView.setText("You like Orange!");
        }
        else
            //No fruit is selected
            {
            textView.setText("You don't like these fruits?");
        }

    }

}
