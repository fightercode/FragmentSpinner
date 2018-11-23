package news.id.id.dataon;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView txt;
    Button show1;
    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

         show1 = (Button)findViewById(R.id.show);
         txt = (TextView)findViewById(R.id.optiondisp);pref = getApplication().getSharedPreferences("Options", MODE_PRIVATE);
         show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String spin1 = pref.getString("SPIN1", "");
                String spin2 = pref.getString("SPIN2", "");
                String spin3 = pref.getString("SPIN3", "");
                String spin4 = pref.getString("SPIN4", "");

                txt.setText("Ruangan: " + spin1 + "\n Ruangan: " + spin2 + "\n Ruangan: " + spin3 + "\n Lantai: " + spin4);

            }
        });

    }
}
