package kr.blogspot.httpcarelesssandbox.a170309hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class page6 extends AppCompatActivity {

    Button b1,b2,b3,b4;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);
        setTitle("5th. Calculator.");

        b1=(Button)findViewById(R.id.q1);
        b2=(Button)findViewById(R.id.q2);
        b3=(Button)findViewById(R.id.q3);
        b4=(Button)findViewById(R.id.q4);

        e1=(EditText)findViewById(R.id.no1);
        e2=(EditText)findViewById(R.id.no2);

        e1.setFocusableInTouchMode(true);
        e2.setFocusableInTouchMode(true);



    //더하기
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = e1.getText().toString();
                String text2 = e2.getText().toString();
                if(text1.getBytes().length <= 0 || text2.getBytes().length <= 0)
                {
                    Toast.makeText(getApplicationContext(), "You should type.", Toast.LENGTH_SHORT).show();
                    if(text1.getBytes().length<=0)
                    e1.requestFocus();
                    if(text2.getBytes().length<=0)
                        e2.requestFocus();
                }
                else
                {
                    int result = Integer.parseInt(text1) + Integer.parseInt(text2);
                    Toast.makeText(getApplicationContext(), "It's " + result + ".", Toast.LENGTH_SHORT).show();
                }


            }
        });

        //빼기
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = e1.getText().toString();
                String text2 = e2.getText().toString();
                if(text1.getBytes().length <= 0 || text2.getBytes().length <= 0)
                {
                    Toast.makeText(getApplicationContext(), "You should type.", Toast.LENGTH_SHORT).show();
                    if(text1.getBytes().length<=0)
                        e1.requestFocus();
                    if(text2.getBytes().length<=0)
                        e2.requestFocus();
                }
                else
                {
                    int result = Integer.parseInt(text1) - Integer.parseInt(text2);
                    Toast.makeText(getApplicationContext(), "It's " + result + ".", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //곱하기
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = e1.getText().toString();
                String text2 = e2.getText().toString();
                if(text1.getBytes().length <= 0 || text2.getBytes().length <= 0)
                {
                    Toast.makeText(getApplicationContext(), "You should type.", Toast.LENGTH_SHORT).show();
                    if(text1.getBytes().length<=0)
                        e1.requestFocus();
                    if(text2.getBytes().length<=0)
                        e2.requestFocus();
                }
                else
                {
                    int result = Integer.parseInt(text1) * Integer.parseInt(text2);
                    Toast.makeText(getApplicationContext(), "It's " + result + ".", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //나누기
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = e1.getText().toString();
                String text2 = e2.getText().toString();
                if(text1.getBytes().length <= 0 || text2.getBytes().length <= 0)
                {
                    Toast.makeText(getApplicationContext(), "You should type.", Toast.LENGTH_SHORT).show();
                    if(text1.getBytes().length<=0)
                        e1.requestFocus();
                    if(text2.getBytes().length<=0)
                        e2.requestFocus();
                }
                else
                {
                    if(Integer.parseInt(text2)==0)
                    {
                        Toast.makeText(getApplicationContext(), "Impossible.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        double result = Integer.parseInt(text1) / Integer.parseInt(text2);
                        Toast.makeText(getApplicationContext(), "It's " + (int)result + ".", Toast.LENGTH_SHORT).show();
                    }
                }



            }
        });

    }
}
