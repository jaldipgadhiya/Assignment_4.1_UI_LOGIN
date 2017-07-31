package uilogin.android.acadgild.com.ui_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginUI extends AppCompatActivity {

    private EditText email_id;
    private EditText pass;
    private Button loin_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_ui_relative);
        getSupportActionBar();

        loin_btn = (Button) findViewById(R.id.btnLogin);




        loin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email_id = (EditText) findViewById(R.id.txtEmail);
                pass = (EditText) findViewById(R.id.txtPass);


                String email = email_id.getText().toString().trim();

                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

                // onClick of button perform this simplest code.
                if (email.matches(emailPattern)) {
                    Toast.makeText(getApplicationContext(), "Valid email address", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();
                }

                if (pass.length() <= 6) {
                    Toast.makeText(LoginUI.this, "Password should be greater than 6 characters.", Toast.LENGTH_LONG).show();
                }


            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater M = getMenuInflater();

        M.inflate(R.menu.main, menu);



        //  getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


}
