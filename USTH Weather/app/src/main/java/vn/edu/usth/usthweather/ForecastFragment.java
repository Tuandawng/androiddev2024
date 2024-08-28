package vn.edu.usth.usthweather;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ForecastFragment extends Fragment {


    public ForecastFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setBackgroundColor(Color.parseColor("#00BFFF"));
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        TextView day = new TextView(getContext());
        day.setText(R.string.sunday);
        day.setTextSize(50);
        day.setTextColor(Color.parseColor("#FFFFFF"));
        day.setGravity(View.TEXT_ALIGNMENT_GRAVITY);

        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.rain);
        imageView.setPadding(16,16,16,16);

        linearLayout.addView(day);
        linearLayout.addView(imageView);
        return linearLayout;

    }
}