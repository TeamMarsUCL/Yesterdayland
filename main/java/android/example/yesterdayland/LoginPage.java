package android.example.yesterdayland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    // Initialize the elements in login_page.xml
    EditText etUserEmail;
    EditText etUserPassword;
    Button mLogInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        // Initialize text input views
        etUserEmail = (EditText) findViewById(R.id.et_email);
        etUserPassword = (EditText) findViewById(R.id.et_password);

        // Initialize mLogInButton and set intent
        mLogInButton = (Button) findViewById(R.id.bt_login);
        mLogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Validate credentials
                boolean isValidEmail = etUserEmail.getText().toString().equals("manuelhurtadoram@gmail.com");
                boolean isValidPassword = etUserPassword.getText().toString().equals("Password123");

                // If credentials are valid, go to home page
                // Else, raise error message
                if (isValidEmail && isValidPassword) {
                    Intent intentLogIn = new Intent(LoginPage.this, HomePageActivity.class);
                    startActivity(intentLogIn);
                } else {
                    String invalidCredentials = "Sorry, credentials are invalid!";
                    Toast.makeText(LoginPage.this, invalidCredentials, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
