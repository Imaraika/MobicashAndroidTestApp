package com.example.mobicashtestapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

//import retrofit2.RetrofitError;


public class MainActivity extends AppCompatActivity {

    public static PrefConfig prefConfig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prefConfig = new PrefConfig(this);
        if(findViewById(R.id.fragment_container)!=null)
        {
            if(savedInstanceState!=null){
                return;
            }
            if (prefConfig.readLoginStatus()){
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,new WelcomeFragment()).commit();

            }
            else{
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,new LoginFragment()).commit();
            }

        }
    }
}