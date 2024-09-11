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

public class WeatherActivity extends AppCompatActivity {
    public static final String TAG = "Weather";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.i(TAG, "ON_CREATE");
        ForecastFragment forecastFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(
                R.id.forecast_fragment, forecastFragment).commit();
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