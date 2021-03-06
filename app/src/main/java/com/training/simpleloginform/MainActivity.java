package com.training.simpleloginform;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Assignment add validation to edit text fields
 * <p>
 * if an edit text is empty, show a toast that says "edit text cannot be empty", where edit text can be username or password
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button submitButton;
    private Button resetButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameEditText = findViewById(R.id.user_name_edit_text);
        passwordEditText = findViewById(R.id.password_edit_text);
        submitButton = findViewById(R.id.submit_button);
        resetButton = findViewById(R.id.reset_button);

        submitButton.setOnClickListener(this);
        resetButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.submit_button:
                Intent i = new Intent(this, SecondActivity.class);
                i.putExtra("username", usernameEditText.getText().toString());
                i.putExtra("password", passwordEditText.getText().toString());
                startActivity(i);


                break;
            case R.id.reset_button:
                setResetButton();

                break;
        }
    }

    public void setResetButton() {
        usernameEditText.setText("");
        passwordEditText.setText("");

    }

}
