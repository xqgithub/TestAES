package example.com.testaes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button button;
    private Button button2;
    private TextView textView;
    private EditText editText;

    private String con;

    private String key = "3c4be9ee27a9691fa302632121714116";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
//                    AESCrypt aesCrypt = new AESCrypt();
                    con = editText.getText().toString().trim();
                    textView.setText(AESCrypt.encrypt(key, con));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                AESCrypt aesCrypt = new AESCrypt();
                con = textView.getText().toString().trim();
                try {
                    textView.setText(AESCrypt.decrypt(key, con));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
