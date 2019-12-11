package android.example.yesterdayland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.example.yesterdayland.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.nio.file.Path;

public class DetailPerformanceActivity extends AppCompatActivity implements View.OnClickListener {

    // Declare intent that started this activity
    Intent catalyzerIntent;

    // Declare elements in activity view
    TextView mTitle, mDateTime, mArtist, mVenue, mDescription;

    // Declare "attend" button
    Button bt_attend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_performance);

        // Initialize view elements
        mTitle = (TextView) findViewById(R.id.tv_title);
        mDateTime = (TextView) findViewById(R.id.tv_datetime);
        mArtist = (TextView) findViewById(R.id.tv_artist);
        mVenue = (TextView) findViewById(R.id.tv_venue);
        mDescription = (TextView) findViewById(R.id.tv_description);

        // Initialize button and set onClickListener
        bt_attend = (Button) findViewById(R.id.bt_attend);
        bt_attend.setOnClickListener(this);

        // Get payloads and update view
        getCatalyzerIntent();
        setViewInfo();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_attend:
                String message = "You've been added to the event's list!";
                Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
    }

    // Set information for specific views
    public void setViewInfo() {

        // Check for extra information
        if (catalyzerIntent.hasExtra(Intent.EXTRA_TEXT)) {

            // Extract information and allocate to individual TextViews
            String[] viewInfo = catalyzerIntent.getStringArrayExtra(Intent.EXTRA_TEXT);
            mTitle.setText(viewInfo[0]);
            mDateTime.setText(viewInfo[1]);
            mArtist.setText(viewInfo[2]);
            mVenue.setText(viewInfo[3]);
            mDescription.setText(viewInfo[4]);
        }
    }

    // Obtain intent that started this activity
    public void getCatalyzerIntent() {
        catalyzerIntent = getIntent();
    }
}
