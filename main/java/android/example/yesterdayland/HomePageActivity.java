package android.example.yesterdayland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.example.yesterdayland.classes.TopUpAccount;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomePageActivity extends AppCompatActivity
        implements View.OnClickListener {

    // Declare buttons to act upon
    private ImageButton mMapButton;
    private ImageButton mSocialWallButton;
    private ImageButton mSearchButton;
    private ImageButton mUpcomingEventsButton;
    private ImageButton mTopUpButton;
    private ImageButton mContactUsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Initialize map button and set OnClickListener
        mMapButton = (ImageButton) findViewById(R.id.bt_map);
        mMapButton.setOnClickListener(this);

        // Initialize social wall button and set OnClickListener
        mSocialWallButton = (ImageButton) findViewById(R.id.bt_socialWall);
        mSocialWallButton.setOnClickListener(this);

        // Initialize search button and set OnClickListener
        mSearchButton = (ImageButton) findViewById(R.id.bt_search);
        mSearchButton.setOnClickListener(this);

        // Initialize upcoming events button and set OnClickListener
        mUpcomingEventsButton = (ImageButton) findViewById(R.id.bt_upcomingEvents);
        mUpcomingEventsButton.setOnClickListener(this);

        // Initialize top up button and set OnClickListener
        mTopUpButton = (ImageButton) findViewById(R.id.bt_topUp);
        mTopUpButton.setOnClickListener(this);

        // Initialize contact us button and set OnClickListener
        mContactUsButton = (ImageButton) findViewById(R.id.bt_contactUs);
        mContactUsButton.setOnClickListener(this);
    }

    // Create intentions for clicks
    @Override
    public void onClick(View v) {

        // Store target class
        Class<?> targetClass = null;

        // Assign target class value based on user input
        switch (v.getId()) {
            case R.id.bt_map:
                targetClass = MapActivity.class;
                break;
            case R.id.bt_socialWall:
                targetClass = SocialWallActivity.class;
                break;
            case R.id.bt_search:
                targetClass = SearchActivity.class;
                break;
            case R.id.bt_upcomingEvents:
                targetClass = PerformanceViewActivity.class;
                break;
            case R.id.bt_topUp:
                targetClass = TopUpActivity.class;
                break;
            case R.id.bt_contactUs:
                targetClass = ContactUsActivity.class;
                break;
        }

        // Launch new activity
        Intent intentStartActivity = new Intent(this, targetClass);
        startActivity(intentStartActivity);
    }
}
