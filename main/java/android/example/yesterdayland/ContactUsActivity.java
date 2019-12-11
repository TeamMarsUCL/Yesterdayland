package android.example.yesterdayland;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContactUsActivity extends AppCompatActivity implements View.OnClickListener {

    // Declare buttons
    Button btCall, btEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        // Initialize 'call' button
        btCall = (Button) findViewById(R.id.bt_call);
        btCall.setOnClickListener(this);

        // Initialize 'email' button
        btEmail = (Button) findViewById(R.id.bt_email);
        btEmail.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String action = null;
        switch (v.getId()) {
            case R.id.bt_call:
                action = "Starting call!";
                break;
            case R.id.bt_email:
                action = "Opening email app!";
                break;
        }
        Toast.makeText(this, action, Toast.LENGTH_SHORT).show();
    }
}
