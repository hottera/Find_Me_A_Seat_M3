package at.ac.univie.hciss20.findmeaseat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void go_main(View view) {
        Intent change = new Intent(this, navMain.class);
        startActivity(change);
    }


}
