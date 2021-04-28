package com.example.fragmentfactory;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlankFragment fragment =  BlankFragment.newInstance("example", 4);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}