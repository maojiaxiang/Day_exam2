package movie.bw.com.maojiaxiang20190618;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegActivity extends AppCompatActivity {
    private EditText name,sex,data,phone,email,pwd;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        name = findViewById(R.id.name);
        sex = findViewById(R.id.sex);
        data = findViewById(R.id.data);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        pwd = findViewById(R.id.pwd);

        register = findViewById(R.id.btn_register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(RegActivity.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(RegActivity.this,"注册成功",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
