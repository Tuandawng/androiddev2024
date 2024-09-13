package vn.edu.usth.usthweather;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import vn.edu.usth.usthweather.adapter.WeatherAdapter;

public class WeatherActivity extends AppCompatActivity {
    public static final String TAG = "Weather";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewPager2 viewPager2 = findViewById(R.id.weather_viewpager);
        WeatherAdapter weatherAdapter = new WeatherAdapter(this);
        viewPager2.setAdapter(weatherAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout1);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch(position){
                    case 0:
                        tab.setText("HANOI,VIETNAM");
                        break;
                    case 1:
                        tab.setText("PARIS,FRANCE");
                        break;
                    case 2:
                        tab.setText("TOULOUSE,FRANCE");
                        break;
                }
            }
        }).attach();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.i(TAG, "ON_CREATE");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "ON_START");
    }

    protected void onResume(){
        super.onResume();
        Log.i(TAG, "ON_RESUME");
    }
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "ON_PAUSE");
    }
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "ON_STOP");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "ON_DESTROY");
    }
}