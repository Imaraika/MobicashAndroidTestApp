package com.example.mobicashtestapp;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("response")
    private String Response;

    public void getResponse(String response) {
        Response = response;
    }
@SerializedName("userName")
    private String userName;

    public String getUserName() {
        return userName;
    }
}
