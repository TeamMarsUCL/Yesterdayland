package android.example.yesterdayland;

import androidx.appcompat.app.AppCompatActivity;

import android.example.yesterdayland.classes.TopUpAccount;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TopUpActivity extends AppCompatActivity implements View.OnClickListener {

    private TopUpAccount topUpAccount = new TopUpAccount(000000);
    private EditText etAmount;
    private Button btTopUp;
    private TextView tvBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up);

        // Initialize text view balance
        tvBalance = (TextView) findViewById(R.id.tv_balance);

        // Initalize amount input
        etAmount = (EditText) findViewById(R.id.et_amount_input);

        // Initialize top up button
        btTopUp = (Button) findViewById(R.id.bt_topUp);
        btTopUp.setOnClickListener(this);

        // Update balance
        updateBalanceView();
    }

    private void updateBalanceView() { tvBalance.setText(String.valueOf(topUpAccount.getBalance())); }

    private void executeTransaction(int amount) {
        topUpAccount.topUp(amount);
        Toast.makeText(getApplicationContext(), "Topped up £" + amount + " in your account!", Toast.LENGTH_SHORT).show();
        updateBalanceView();
    }

    @Override
    public void onClick(View v) {
        int amount = 0;
        switch (v.getId()) {
            case R.id.bt_topUp:
                Log.d(TopUpActivity.class.getSimpleName(), "onClick: sss");
                try {
                    amount = Integer.parseInt(etAmount.getText().toString());
                    executeTransaction(amount);
                    etAmount.getText().clear();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "No amount entered!", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
