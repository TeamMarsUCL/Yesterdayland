package android.example.yesterdayland;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.example.yesterdayland.classes.SocialWallPost;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class SocialWallActivity extends AppCompatActivity implements View.OnClickListener {


    // Define placeholder strings for post contents
    String placeholderText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque leo elit, vestibulum quis elit et, vestibulum suscipit elit. Quisque hendrerit sem ut nisi pellentesque varius. Nunc tristique tortor quis dui porttitor, eu sagittis libero ultricies. Nulla vestibulum diam at tempus tincidunt. Integer purus diam, porta quis neque sed, porttitor luctus tellus. Donec at lectus varius, porta lacus eu, maximus elit. Suspendisse lectus ante, efficitur eget metus in, ultricies finibus risus.";
    String shortPlaceHolderText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

    // Initialize post objects
    SocialWallPost post1, post2, post3, post4, post5, post6;

    // Declare authors for specific textviews
    TextView tv_post1_author, tv_post2_author, tv_post3_author, tv_post4_author,
            tv_post5_author, tv_post6_author;

    // Declare contents for specific textviews
    TextView tv_post1_content, tv_post2_content, tv_post3_content, tv_post4_content,
            tv_post5_content, tv_post6_content;

    // Declare buttons
    ImageButton bt_like1, bt_like2, bt_like3, bt_like4, bt_like5, bt_like6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_wall);

        // Initialize post objects
        initializePosts();

        // Initialize & populate TextViews
        initializeTextViews();
        populateTextViews();

        // Initialize Buttons
        initializeButtons();

        // Initialize toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public void onClick(View v) {

        int idClicked = v.getId();
        ImageButton clickedButton = (ImageButton) findViewById(idClicked);

        boolean isNotLiked = (int) clickedButton.getTag() == R.drawable.empty_heart_icon;
        int newIconId = isNotLiked ? R.drawable.filled_heart_icon : R.drawable.empty_heart_icon;

        clickedButton.setImageDrawable(getResources().getDrawable(newIconId));
        clickedButton.setTag(newIconId);
    }

    private void populateTextViews() {

        populate(post1, tv_post1_author, tv_post1_content);
        populate(post2, tv_post2_author, tv_post2_content);
        populate(post3, tv_post3_author, tv_post3_content);
        populate(post4, tv_post4_author, tv_post4_content);
        populate(post5, tv_post5_author, tv_post5_content);
        populate(post6, tv_post6_author, tv_post6_content);

    }


    private void populate(SocialWallPost post, TextView mAuthor, TextView mContent) {

        // Get post information
        String[] viewInfo = post.getUiInfo();

        // Set title and description
        mAuthor.setText(viewInfo[0]);
        mContent.setText(viewInfo[1]);

    }


    private void initializeButtons() {

        bt_like1 = (ImageButton) findViewById(R.id.bt_like1);
        bt_like1.setOnClickListener(this);
        bt_like1.setTag(R.drawable.empty_heart_icon);

        bt_like2 = (ImageButton) findViewById(R.id.bt_like2);
        bt_like2.setOnClickListener(this);
        bt_like2.setTag(R.drawable.empty_heart_icon);

        bt_like3 = (ImageButton) findViewById(R.id.bt_like3);
        bt_like3.setOnClickListener(this);
        bt_like3.setTag(R.drawable.empty_heart_icon);

        bt_like4 = (ImageButton) findViewById(R.id.bt_like4);
        bt_like4.setOnClickListener(this);
        bt_like4.setTag(R.drawable.empty_heart_icon);

        bt_like5 = (ImageButton) findViewById(R.id.bt_like5);
        bt_like5.setOnClickListener(this);
        bt_like5.setTag(R.drawable.empty_heart_icon);

        bt_like6 = (ImageButton) findViewById(R.id.bt_like6);
        bt_like6.setOnClickListener(this);
        bt_like6.setTag(R.drawable.empty_heart_icon);

    }


    private void initializeTextViews() {

        // Initialize TextViews for performance 1
        tv_post1_author = (TextView) findViewById(R.id.tv_post1_author);
        tv_post1_content = (TextView) findViewById(R.id.tv_post1_content);

        // Initialize TextViews for performance 2
        tv_post2_author = (TextView) findViewById(R.id.tv_post2_author);
        tv_post2_content = (TextView) findViewById(R.id.tv_post2_content);

        // Initialize TextViews for performance 3
        tv_post3_author = (TextView) findViewById(R.id.tv_post3_author);
        tv_post3_content = (TextView) findViewById(R.id.tv_post3_content);

        // Initialize TextViews for performance 1
        tv_post4_author = (TextView) findViewById(R.id.tv_post4_author);
        tv_post4_content = (TextView) findViewById(R.id.tv_post4_content);

        // Initialize TextViews for performance 1
        tv_post5_author = (TextView) findViewById(R.id.tv_post5_author);
        tv_post5_content = (TextView) findViewById(R.id.tv_post5_content);

        // Initialize TextViews for performance 1
        tv_post6_author = (TextView) findViewById(R.id.tv_post6_author);
        tv_post6_content = (TextView) findViewById(R.id.tv_post6_content);

    }


    private void initializePosts() {

        // Dummy author ID for demonstration purposes
        int dummyAuthorId = 0;

        // Initialize post 1
        post1 = new SocialWallPost(placeholderText, "Dimitri Vegas", dummyAuthorId);

        // Initialize post 2
        post2 = new SocialWallPost(placeholderText, "David Guetta", dummyAuthorId);

        // Initialize post 3
        post3 = new SocialWallPost(placeholderText, "Marshmello", dummyAuthorId);

        // Initialize post 4
        post4 = new SocialWallPost(placeholderText, "Tiësto", dummyAuthorId);

        // Initialize post 5
        post5 = new SocialWallPost(placeholderText, "Calvin Harris", dummyAuthorId);

        // Initialize post 6
        post6 = new SocialWallPost(placeholderText, "Avicii", dummyAuthorId);

    }
}
