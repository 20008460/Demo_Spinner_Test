package sg.edu.rp.c346.id20008460.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spnYesNo;
    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        results = findViewById(R.id.tv);
        spnYesNo = findViewById(R.id.spinner);

        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                        results.setText(R.string.spinYes);
                        break;
                    case 1:
                        results.setText(R.string.spinNo);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }



}