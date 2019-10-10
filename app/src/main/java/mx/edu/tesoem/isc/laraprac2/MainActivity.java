package mx.edu.tesoem.isc.laraprac2;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void botton1(View view){
        Intent frame1=new Intent(this, FRAME_ACTIVITY.class);
        startActivity(frame1);
        finish();
    }
}
