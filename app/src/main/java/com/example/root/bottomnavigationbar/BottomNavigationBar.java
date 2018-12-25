package com.example.root.bottomnavigationbar;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class BottomNavigationBar extends AppCompatActivity {

    private BottomNavigationView mainnav;
    private FrameLayout mainframe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_bar);

        mainframe = findViewById(R.id.nav_frame);
        mainnav = findViewById(R.id.main_nav);

        mainnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.nav_home:
                        mainnav.setItemBackgroundResource(R.color.coloryalo);
                        return true;

                    case R.id.nav_notification:
                        mainnav.setItemBackgroundResource(R.color.colorparpal);
                        return true;

                    case R.id.nav_account:
                        mainnav.setItemBackgroundResource(R.color.colorbelu);
                        return true;

                    default:
                        return false;
                }

            }
        });
    }
}
