package kr.blogspot.httpcarelesssandbox.a170309hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class page3 extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        setTitle("2nd. Age Count.");
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = e1.getText().toString();
                int result = 2017-Integer.parseInt(text1)+1;
                Toast.makeText(getApplicationContext(), "You are " + result + " years old.", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text2 = e2.getText().toString();
                int result2 = 2017-Integer.parseInt(text2)+1;
                Toast.makeText(getApplicationContext(), "You are born in " + result2 + ".", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
