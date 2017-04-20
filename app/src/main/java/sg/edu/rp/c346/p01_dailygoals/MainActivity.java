package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.buttonOk);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                RadioGroup rg1 = (RadioGroup) findViewById(R.id.RadioGroup1);
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.RadioGroup2);
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.RadioGroup3);

                EditText etReflect = (EditText)findViewById(R.id.editTextReflect);
                String reflection = etReflect.getText().toString();

                int RadioGrp1 = rg1.getCheckedRadioButtonId();
                int RadioGrp2 = rg2.getCheckedRadioButtonId();
                int RadioGrp3 = rg3.getCheckedRadioButtonId();

                RadioButton rb1 = (RadioButton) findViewById(RadioGrp1);
                RadioButton rb2 = (RadioButton) findViewById(RadioGrp2);
                RadioButton rb3 = (RadioButton) findViewById(RadioGrp3);


                String[] info = {rb1.getText().toString(),rb2.getText().toString(),rb3.getText().toString()};

                Intent i = new Intent(MainActivity.this, summary.class);
                i.putExtra("info",info);

                startActivity(i);



            }
        });
    }
}
