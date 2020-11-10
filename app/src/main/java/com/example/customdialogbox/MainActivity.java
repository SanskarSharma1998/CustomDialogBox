package com.example.customdialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.text);
    }

    public void click(View view) {
        final AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
        View mview=getLayoutInflater().inflate(R.layout.custom_dialog_box,null);

        final EditText text=(EditText)mview.findViewById(R.id.edit);
       Button b1=(Button)mview.findViewById(R.id.declineButton);
        Button b2=(Button)mview.findViewById(R.id.declineButton1);

        alert.setView(mview);

        final AlertDialog alertDialog=alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(text.getText().toString());
            }
        });

        alertDialog.show();
    }

}