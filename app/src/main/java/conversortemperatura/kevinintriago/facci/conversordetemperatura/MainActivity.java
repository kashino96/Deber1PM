package conversortemperatura.kevinintriago.facci.conversordetemperatura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Button cToF,fToC;
    private TextView result;
    private EditText enterTemp;
    double result0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cToF = findViewById(R.id.cToF);
        fToC = findViewById(R.id.fToC);
        result = findViewById(R.id.result);
        enterTemp = findViewById(R.id.enterTemp);

        cToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double temp = Double.parseDouble(enterTemp.getText().toString());
                result0 = (temp *1.8) + 32;
                result.setText(String.valueOf(result0));

            }
        });

        fToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result0 = (temp - 32) / 1.8;
                result.setText(String.valueOf(result0));
            }

        });

        Log.e("Introducción al desarrollo nativo de una app Android", "Kevin Josue Intriago Mora" );


    }
}
