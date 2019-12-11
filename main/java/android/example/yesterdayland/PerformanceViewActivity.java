package android.example.yesterdayland;

import android.content.Intent;
import android.example.yesterdayland.classes.Performance;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PerformanceViewActivity extends AppCompatActivity implements View.OnClickListener {


    // Declare titles for specific textviews
    TextView tv_performance1_title, tv_performance2_title, tv_performance3_title, tv_performance4_title,
            tv_performance5_title, tv_performance6_title;

    // Declare descriptions for specific textviews
    TextView tv_performance1_description, tv_performance2_description, tv_performance3_description, tv_performance4_description,
            tv_performance5_description, tv_performance6_description;

    // Declare buttons for specific textviews
    Button mExpandPerformance1Button, mExpandPerformance2Button, mExpandPerformance3Button,
            mExpandPerformance4Button, mExpandPerformance5Button, mExpandPerformance6Button;

    // Define placeholder strings for performance descriptions
    String placeholderText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque leo elit, vestibulum quis elit et, vestibulum suscipit elit. Quisque hendrerit sem ut nisi pellentesque varius. Nunc tristique tortor quis dui porttitor, eu sagittis libero ultricies. Nulla vestibulum diam at tempus tincidunt. Integer purus diam, porta quis neque sed, porttitor luctus tellus. Donec at lectus varius, porta lacus eu, maximus elit. Suspendisse lectus ante, efficitur eget metus in, ultricies finibus risus.";
    String shortPlaceHolderText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

    // Initialize performance objects
    Performance performance1, performance2, performance3, performance4, performance5, performance6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        // Initialize performance objects
        initializePerformances();

        // Initialize & populate TextViews
        initializeTextViews();
        populateTextViews();

        // Initialize buttons
        initializeButtons();

        // Initialize toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    // Create intentions for clicks
    @Override
    public void onClick(View v) {

        // Create new intent
        Intent intentStartActivity = new Intent(this, DetailPerformanceActivity.class);

        // Payload
        String[] payload = null;
        String title = null, date = null, artist = null, description = null, venue = null;

        // Assign payload value based on user input
        switch (v.getId()) {
            case R.id.bt_expand_performance1:
                payload = performance1.getInfo(true);
                break;
            case R.id.bt_expand_performance2:
                payload = performance2.getInfo(true);
                break;
            case R.id.bt_expand_performance3:
                payload = performance3.getInfo(true);
                break;
            case R.id.bt_expand_performance4:
                payload = performance3.getInfo(true);
                break;
            case R.id.bt_expand_performance5:
                payload = performance3.getInfo(true);
                break;
            case R.id.bt_expand_performance6:
                payload = performance3.getInfo(true);
                break;
        }

        // Launch new activity
        intentStartActivity.putExtra(Intent.EXTRA_TEXT, payload);
        startActivity(intentStartActivity);
    }


    public void populate(Performance performance, TextView mTitle, TextView mDescription) {

            // Get performance information (short)
            String[] viewInfo = performance.getInfo(false);

            // Set title and description
            mTitle.setText(viewInfo[0]);
            mDescription.setText(viewInfo[4]);

    }


    public void initializeTextViews() {

        // Initialize TextViews for performance 1
        tv_performance1_title = (TextView) findViewById(R.id.tv_performance1_title);
        tv_performance1_description = (TextView) findViewById(R.id.tv_performance1_description);

        // Initialize TextViews for performance 2
        tv_performance2_title = (TextView) findViewById(R.id.tv_performance2_title);
        tv_performance2_description = (TextView) findViewById(R.id.tv_performance2_description);

        // Initialize TextViews for performance 3
        tv_performance3_title = (TextView) findViewById(R.id.tv_performance3_title);
        tv_performance3_description = (TextView) findViewById(R.id.tv_performance3_description);

        // Initialize TextViews for performance 1
        tv_performance4_title = (TextView) findViewById(R.id.tv_performance4_title);
        tv_performance4_description = (TextView) findViewById(R.id.tv_performance4_description);

        // Initialize TextViews for performance 1
        tv_performance5_title = (TextView) findViewById(R.id.tv_performance5_title);
        tv_performance5_description = (TextView) findViewById(R.id.tv_performance5_description);

        // Initialize TextViews for performance 1
        tv_performance6_title = (TextView) findViewById(R.id.tv_performance6_title);
        tv_performance6_description = (TextView) findViewById(R.id.tv_performance6_description);
    }

    public void populateTextViews() {

        populate(performance1, tv_performance1_title, tv_performance1_description);
        populate(performance2, tv_performance2_title, tv_performance2_description);
        populate(performance3, tv_performance3_title, tv_performance3_description);
        populate(performance4, tv_performance4_title, tv_performance4_description);
        populate(performance5, tv_performance5_title, tv_performance5_description);
        populate(performance6, tv_performance6_title, tv_performance6_description);

    }


    public void initializeButtons() {

        // Initialize buttons and set OnClickListener
        mExpandPerformance1Button = (Button) findViewById(R.id.bt_expand_performance1);
        mExpandPerformance1Button.setOnClickListener(this);

        mExpandPerformance2Button = (Button) findViewById(R.id.bt_expand_performance2);
        mExpandPerformance2Button.setOnClickListener(this);

        mExpandPerformance3Button = (Button) findViewById(R.id.bt_expand_performance3);
        mExpandPerformance3Button.setOnClickListener(this);

        mExpandPerformance4Button = (Button) findViewById(R.id.bt_expand_performance4);
        mExpandPerformance4Button.setOnClickListener(this);

        mExpandPerformance5Button = (Button) findViewById(R.id.bt_expand_performance5);
        mExpandPerformance5Button.setOnClickListener(this);

        mExpandPerformance6Button = (Button) findViewById(R.id.bt_expand_performance6);
        mExpandPerformance6Button.setOnClickListener(this);

    }


    public void initializePerformances() {

        // Initialize performance 1
        performance1 = new Performance("Raining Beats",
                "Dec. 29th, 3:00PM",
                "Dimitri Vegas",
                "Main Stage",
                placeholderText,
                shortPlaceHolderText);

        // Initialize performance 2
        performance2 = new Performance("Raining Beats",
                "Dec. 29th, 3:00PM",
                "Dimitri Vegas",
                "Main Stage",
                placeholderText,
                shortPlaceHolderText);

        // Initialize performance 3
        performance3 = new Performance("Raining Beats",
                "Dec. 29th, 3:00PM",
                "Dimitri Vegas",
                "Main Stage",
                placeholderText,
                shortPlaceHolderText);

        // Initialize performance 4
        performance4 = new Performance("Raining Beats",
                "Dec. 29th, 3:00PM",
                "Dimitri Vegas",
                "Main Stage",
                placeholderText,
                shortPlaceHolderText);

        // Initialize performance 5
        performance5 = new Performance("Raining Beats",
                "Dec. 29th, 3:00PM",
                "Dimitri Vegas",
                "Main Stage",
                placeholderText,
                shortPlaceHolderText);

        // Initialize performance 6
        performance6 = new Performance("Raining Beats",
                "Dec. 29th, 3:00PM",
                "Dimitri Vegas",
                "Main Stage",
                placeholderText,
                shortPlaceHolderText);

    }

}
