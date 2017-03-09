package kr.blogspot.httpcarelesssandbox.a170309hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class page4 extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        setTitle("3rd. Temperature for American Scientist.");

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);

//Put C
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = e1.getText().toString();
                double result = Integer.parseInt(text1)*1.8+32;
                Toast.makeText(getApplicationContext(), "It's " + result + "degrees for F.", Toast.LENGTH_SHORT).show();
            }
        });

//Put F
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text2 = e2.getText().toString();
                double result2 = (Integer.parseInt(text2)-32)/1.8;
                Toast.makeText(getApplicationContext(), "It's " + result2 + "degrees for C.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
