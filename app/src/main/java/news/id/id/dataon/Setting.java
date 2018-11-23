package news.id.id.dataon;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Setting extends AppCompatActivity {

    Button btn;
    Spinner spn1, spn2, spn3, spn4;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

//
//        final String[] Ruangan = {"Ruanagan A", "Ruangan B", "Ruangan C", "Ruangan D", "Ruangan E", "Ruangan F", "Ping pong",
//                "Football", "Badminton", "Chess", "Test App", "Cafetaria", "Auditorium", "Rooftop"
//
//        };
//
//
//        String[] Floor = {"4", "5"};

        spn1 = (Spinner)findViewById(R.id.List1);
        spn2 = (Spinner)findViewById(R.id.List2);
        spn3 = (Spinner)findViewById(R.id.List3);
        spn4 = (Spinner)findViewById(R.id.List4);

//        ArrayAdapter<String>adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, Ruangan);
//        ArrayAdapter<String>adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, Floor);
//        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spn1.setAdapter(adapter1);
//        spn2.setAdapter(adapter1);
//        spn3.setAdapter(adapter1);
//        spn4.setAdapter(adapter2);
//
//        adapter1.add("Select option");
//        adapter1.add([Ruangan]);


        btn = (Button)findViewById(R.id.submitt);
        final SharedPreferences pref = getApplicationContext().getSharedPreferences("Options", MODE_PRIVATE);
        editor = pref.edit();



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String spin1 = spn1.getSelectedItem().toString();
                String spin2 = spn2.getSelectedItem().toString();
                String spin3 = spn3.getSelectedItem().toString();
                String spin4 = spn4.getSelectedItem().toString();

                    String dataSpinner1 = spin1;
                    editor.putString("SPIN1", dataSpinner1);
                    editor.putString("SPIN2", spin2);
                    editor.putString("SPIN3", spin3);
                    editor.putString("SPIN4", spin4);
                    editor.commit();

                    if (dataSpinner1.equals("Select option") ) {
                        Toast.makeText(getApplicationContext(), "Maaf Pilih Yang Belum dipilih!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Data : " + dataSpinner1, Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Setting.this, HomeActivity.class));
                        finish();
                    }
                    //startActivity(new Intent(Setting.this, HomeActivity.class));
                    //finish();







            }
        });




    }
}
