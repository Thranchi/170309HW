package kr.blogspot.httpcarelesssandbox.a170309hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class page2 extends AppCompatActivity {

    Button b1;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        setTitle("1st. Apple Buyer.");
        b1=(Button)findViewById(R.id.b1);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = e1.getText().toString();
                String text2 = e2.getText().toString();
                int result = Integer.parseInt(text1) * Integer.parseInt(text2);
                Toast.makeText(getApplicationContext(), "It's " + result + " for you.", Toast.LENGTH_SHORT).show();
            }
        });


    }
}