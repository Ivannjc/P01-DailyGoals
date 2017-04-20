package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent i = getIntent();
        String [] info = i.getStringArrayExtra("info");
        TextView tv =(TextView)findViewById(R.id.textViewSummary);
        tv.setText("Read up on materials before class: " + info[0] + "\n Arrive on time so as to not miss important part of the lesson: " + info[1] + "\n Attempt the problem myself:" + info[2] + "\n Reflection: " + info[3]);

        Button btn = (Button)findViewById(R.id.btnBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(summary.this, MainActivity.class));
            }
        });
    }
}
