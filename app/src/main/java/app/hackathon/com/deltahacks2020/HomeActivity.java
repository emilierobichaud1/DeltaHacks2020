package app.hackathon.com.deltahacks2020;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.FirebaseApp;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        FirebaseApp.initializeApp(this);
    }

    public void logIn(View view){
        //go to log in page when log in button pressed
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }

    public void signUp(View view){
        //go to sign up page when sign up button pressed
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);

    }
}
