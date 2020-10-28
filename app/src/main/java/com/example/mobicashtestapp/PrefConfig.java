package com.example.mobicashtestapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

public class PrefConfig {
    private SharedPreferences sharedPreference;
    private Context context;

    public PrefConfig(Context context) {
        this.context = context;
        sharedPreference = context.getSharedPreferences(context.getString(R.string.pref_file), context.MODE_PRIVATE);

    }
    public void writeLoginStatus(boolean status){
        SharedPreferences.Editor editor = sharedPreference.edit();
        editor.putBoolean(context.getString(R.string.pref_login_status),status);
        editor.commit();

    }
    public boolean readLoginStatus(){
        return sharedPreference.getBoolean(context.getString(R.string.pref_login_status), false);
    }
    public void writeUserName(String userName){
        SharedPreferences.Editor editor = sharedPreference.edit();
        editor.putString(context.getString(R.string.pref_user_name),userName);
        editor.commit();

    }
    public String readName(){
        return sharedPreference.getString(context.getString(R.string.pref_user_name),"user");
    }
    public void dispalyToast(String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
