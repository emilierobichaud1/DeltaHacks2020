package app.hackathon.com.deltahacks2020;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.appcompat.app.AppCompatActivity;

import static app.hackathon.com.deltahacks2020.SignupActivity.MyPREFERENCES;

public class LoginActivity extends AppCompatActivity {

    public static final String userId = "userId";
    public static final String MyPREFERENCES = "MyPrefs";
    private static final String TAG = "LoginActivity";
    SharedPreferences sharedPreferences;
    private FirebaseAuth Auth;
    private EditText passwordText;
    private EditText emailText;
    private String uid;
    private FirebaseDatabase database;
    private DatabaseReference usernamesRef;
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        emailText = (EditText) findViewById(R.id.email);
        passwordText = (EditText) findViewById(R.id.password_text);
        Auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        usernamesRef = database.getReference("users/");


    }
}
