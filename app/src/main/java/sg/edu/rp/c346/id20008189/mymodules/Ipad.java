package sg.edu.rp.c346.id20008189.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ipad extends AppCompatActivity {
    TextView tvAnswer;
    Button btnIpad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipad);
        tvAnswer=findViewById(R.id.tvAnswer);
        btnIpad=findViewById(R.id.btnIpad);
        Intent intentReceived = getIntent();
        String value = intentReceived.getStringExtra("code");
        String value1 = intentReceived.getStringExtra("name");
        int value2 = intentReceived.getIntExtra("year",0);
        int value3 = intentReceived.getIntExtra("sem",0);
        int value4 = intentReceived.getIntExtra("credit",0);
        String value5 = intentReceived.getStringExtra("venue");
        tvAnswer.setText("Module Code: " + value +
                "\n"+"Module Name: "+value1 +
                "\n"+"Academic Year: "+value2 +
                "\n"+"Semester: "+value3 +
                "\n"+"Module Credit: "+value4+
                "\n"+"Venue: "+value5);
        btnIpad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ipad.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}