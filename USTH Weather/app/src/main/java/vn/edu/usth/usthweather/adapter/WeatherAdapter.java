package vn.edu.usth.usthweather.adapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import vn.edu.usth.usthweather.WeatherAndForecastFragment;

public class WeatherAdapter extends FragmentStateAdapter {
    public WeatherAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new WeatherAndForecastFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
