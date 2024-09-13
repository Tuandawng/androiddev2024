package vn.edu.usth.usthweather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WeatherAndForecastFragment extends Fragment {
    private WeatherFragment weatherFragment;
    private ForecastFragment forecastFragment;
    public WeatherAndForecastFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);
        weatherFragment = new WeatherFragment();
        forecastFragment = new ForecastFragment();
        FragmentManager fragmentManager = getChildFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.weatherContainer,weatherFragment);
        fragmentTransaction.add(R.id.forecastContainer,forecastFragment);
        fragmentTransaction.commit();
        return view;

    }

}