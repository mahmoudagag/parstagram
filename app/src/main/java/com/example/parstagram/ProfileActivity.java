package com.example.parstagram;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.parse.ParseUser;

public class ProfileActivity extends MainActivity {

    Button btnLogout;
    public static final String TAG = "ProfileActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.i(TAG,"ENTERED PROFILE ACTIVITY");

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnLogout = findViewById(R.id.btnLogout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ParseUser.logOut();
                Logout();
            }
        });
    }


    private void Logout(){
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
        finish();
    }
}
