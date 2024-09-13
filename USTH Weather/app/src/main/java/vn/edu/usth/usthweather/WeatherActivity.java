package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import java.util.zip.GZIPInputStream;

import vn.edu.usth.usthweather.adapter.WeatherAdapter;

public class WeatherActivity extends AppCompatActivity {
    public static final String TAG = "Weather";
    private ViewPager2 viewPager2;
    private WeatherAdapter weatherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        viewPager2 = findViewById(R.id.weather_viewpager);
        weatherAdapter = new WeatherAdapter(this);
        viewPager2.setAdapter(weatherAdapter);
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