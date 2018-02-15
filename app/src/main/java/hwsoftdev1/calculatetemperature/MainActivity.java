package hwsoftdev1.calculatetemperature;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edit1,edit2;
    private Button bt1,bt2;
    private ImageView image1;
    private String scal,scal1;
    private double cal,ccal,cal1,ccal1;
    private TextView t4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        image1 = findViewById(R.id.image1);
        t4 = findViewById(R.id.t4);
    }

    public void changeF(View view) {
            cal = Double.parseDouble(edit1.getText().toString());
            ccal = (cal*(9.0/5.0))+32;
            scal = Double.toString(ccal);
            edit2.setText(scal);
            t4.setText("Calculate Fahrenheit to Celcuis  ");
    }

    public void changeC(View view) {
            cal1 = Double.parseDouble(edit2.getText().toString());
            ccal1 = (cal1-32)*(5.0/9.0);
            scal1 = Double.toString(ccal1);
            edit1.setText(scal1);
            t4.setText("Calculate celcuis to Fahrenheit  ");
    }
}
