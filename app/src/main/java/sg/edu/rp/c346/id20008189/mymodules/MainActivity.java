package sg.edu.rp.c346.id20008189.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvAndroid;
    TextView tvIpad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvAndroid=findViewById(R.id.tvAndroid);
        tvIpad=findViewById(R.id.tvIpad);
        tvAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", 2020);
                intent.putExtra("sem", 4);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W66M");
                startActivity(intent);

            }
        });
        tvIpad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Ipad.class);
                intent.putExtra("code", "C349");
                intent.putExtra("name", "Ipad Programming");
                intent.putExtra("year", 2020);
                intent.putExtra("sem", 4);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W66M");
                startActivity(intent);
                finish();
            }
        });
    }
}