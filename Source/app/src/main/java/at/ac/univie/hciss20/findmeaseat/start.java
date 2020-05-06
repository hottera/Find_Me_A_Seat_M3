package at.ac.univie.hciss20.findmeaseat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void go_log_in(View view) {
        Intent change = new Intent(this, log_in.class);
        startActivity(change);
    }
    public void go_register(View view) {
        Intent change = new Intent(this, register.class);
        startActivity(change);
    }


}