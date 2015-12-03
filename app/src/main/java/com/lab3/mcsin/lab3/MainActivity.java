package com.lab3.mcsin.lab3;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity
{
    //Declare variables here - inside the class but outside of any function
    //to make them accessible to other functions. Make them private so that
    //no other class can manipulate their values(only this class's functions
    //can manipulate the values)

    private EditText input1;
    private TextView output1;
    private  TextView output2;
    private Button button1;

    @Override
    public void onCreate(Bundle savedData)
    {

        super.onCreate(savedData);

        // Create and initialize the layout
        LinearLayout myLayout = new LinearLayout(this);
        myLayout.setOrientation(LinearLayout.VERTICAL);

        //Instantiate the controls (create them in memory)
        input1 = new EditText(this);
        output1 = new TextView(this);
        output2 = new TextView(this);
        button1 = new Button(this);
        TextView label1 = new TextView(this);
        label1.setText("Please Enther the Number of Cups:");
        input1.setInputType(InputType.TYPE_CLASS_NUMBER);

        //Add text to the Button
        button1.setText("OK");

        //add a click listener to the button
        button1.setOnClickListener(myListener);

        //Create a LayoutParams object
        LinearLayout.LayoutParams lparams =new LinearLayout.LayoutParams(300,100);// Width , height



        // Use the LayoutParams object to set the control widths and heights
        label1.setLayoutParams(lparams);
        input1.setLayoutParams(lparams);
        output1.setLayoutParams(lparams);
        output2.setLayoutParams(lparams);
        button1.setLayoutParams(lparams);

        //Add the controls to the layout. The order you add them determines
        //the order they will appear on the display
        myLayout.addView(label1);
        myLayout.addView(input1);
        myLayout.addView(button1);//Appears under the input
        myLayout.addView(output1);//Appears under the button
        myLayout.addView(output2);//Appears under the button
        //Designate the layout as the layout to be displayed
        //on the user device
        setContentView(myLayout);
    }

    //Create an onClickListener object
    private OnClickListener myListener = new OnClickListener()
    {
        @Override
        public void onClick(View v) {
                // Do something here
            output1.setText("The teaspoons of number are:"+input1.getText());
           int tablespoons=Integer.parseInt(input1.getText().toString())+5;
            output2.setText("The tablespoons of number are:"+tablespoons);
        }

    }; // <-- Don't forget the semicolon here

}



