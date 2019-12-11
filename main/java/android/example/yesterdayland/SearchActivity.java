package android.example.yesterdayland;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etSearch;
    Button btSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Initialize text field
        etSearch = (EditText) findViewById(R.id.et_search);

        // Initialize search button
        btSearch = (Button) findViewById(R.id.bt_search);
        btSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_search:
                if (!(etSearch.getText().toString().equals(""))) {
                    Toast.makeText(getApplicationContext(), "Searching for " +
                            etSearch.getText().toString(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "No search input!", Toast.LENGTH_SHORT).show();
                }
        }
    }
}
