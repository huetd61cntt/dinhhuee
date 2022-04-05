package cntt61.hue61133694;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // gán biến id btn vào giao diện
        button = findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener() {
            class activity_login {
            }

            @Override
            public void onClick(View v) {
                // chuyen man hinh
                Intent intent = new Intent(MainActivity.this, activity_login.class);
                startActivity(intent);
            }
        });
    }
}