package kr.blogspot.httpcarelesssandbox.a170309hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class page5 extends AppCompatActivity {

    Button b1;
    EditText e1,e2,e3;
    CheckBox cb;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("4th. Helping Waiters.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        b1=(Button)findViewById(R.id.button);

        e1=(EditText)findViewById(R.id.pizzae);
        e2=(EditText)findViewById(R.id.pastae);
        e3=(EditText)findViewById(R.id.salade);

        cb= (CheckBox) findViewById(R.id.checkBox);

        t1=(TextView)findViewById(R.id.many);
        t2=(TextView)findViewById(R.id.much);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text1 = e1.getText().toString();
                if(text1.getBytes().length <= 0)
                {
                    text1="0";
                }
                String text2 = e2.getText().toString();
                if(text2.getBytes().length <= 0)
                {
                    text2="0";
                }
                String text3 = e3.getText().toString();
                if(text3.getBytes().length <= 0)
                {
                    text3="0";
                }
                int result = Integer.parseInt(text1)*15000+Integer.parseInt(text2)*13000+Integer.parseInt(text3)*9000;
                int resultmany=Integer.parseInt(text1)+Integer.parseInt(text2)+Integer.parseInt(text3);

                if(cb.isChecked()) {
                    double dc=result*0.9;
                    t2.setText((int)dc+"");
                    t1.setText(resultmany+"");
                }
                else {
                    t1.setText(resultmany+"");
                    t2.setText(result+"");
                }

            }
        });

    }
}
