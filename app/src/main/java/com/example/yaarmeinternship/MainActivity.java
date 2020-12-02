package com.example.yaarmeinternship;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Toolbar toolbar;
    BottomNavigationView bottom_navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(TextView)findViewById(R.id.txt);
        toolbar=(androidx.appcompat.widget.Toolbar)findViewById(R.id.toolbar);
        bottom_navigation=(BottomNavigationView)findViewById(R.id.bottom_navigation);

        // typeface for text
        Typeface typeface=Typeface.createFromAsset(getAssets(),"fonts/lobstertwo.otf");
        txt.setTypeface(typeface);
    }
}
