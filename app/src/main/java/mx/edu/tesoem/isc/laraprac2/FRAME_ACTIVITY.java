package mx.edu.tesoem.isc.laraprac2;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class FRAME_ACTIVITY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame__activity);
    }
    public void botton2(View view){
        Intent frame2=new Intent(this, FRAME_ACTIVITY2.class);
        startActivity(frame2);
        finish();
    }
}

