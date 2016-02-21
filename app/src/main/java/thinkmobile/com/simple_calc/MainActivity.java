package thinkmobile.com.simple_calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    TextView result;
    Button pl;
    Button min;
    EditText n1;
    EditText n2;
    double a;
    double b;
    double c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result);
        Button pl = (Button) findViewById(R.id.plus);
        Button min = (Button) findViewById(R.id.minus);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);

        n1.setHint("Enter first number");
        n2.setHint("Enter second number");
        result.setHint("Result");

        View.OnClickListener pll = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1=n1.getText().toString();
                String s2=n2.getText().toString();

                a = Double.parseDouble(s1);
                b = Double.parseDouble(s2);

                c= a+b;

                String s = Double.toString(c);

                result.setText(s);

            }
        };

        View.OnClickListener minl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=n1.getText().toString();
                String s2=n2.getText().toString();

                a = Double.parseDouble(s1);
                b = Double.parseDouble(s2);

                c= a-b;

                String s = Double.toString(c);

                result.setText(s);
            }
        };

        pl.setOnClickListener(pll);
        min.setOnClickListener(minl);
    }
}