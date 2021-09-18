package me.mayankchoudhary.viewpager2example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public ViewPager2 viewPager2;
    private ViewPager2Adapter viewPager2Adapter;
    private int[] images = {R.drawable.ic_baseline_filter_1, R.drawable.ic_baseline_filter_2, R.drawable.ic_baseline_filter_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewPager);
        viewPager2Adapter = new ViewPager2Adapter(this, images);
        viewPager2.setAdapter(viewPager2Adapter);

        // swipe event
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            // This method is triggered when there is
            // any scrolling activity for the current page
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }
            // triggered when you select a new page
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }
            // triggered when there is
            // scroll state will be changed
            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }
}