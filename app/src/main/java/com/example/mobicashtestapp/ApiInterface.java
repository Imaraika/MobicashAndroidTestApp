package com.example.mobicashtestapp;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
@GET("register.php")
        Call<User> performRegistration(@Query("userName") String username,@Query("email") String email,@Query("password") String password);
@GET("login.ph")
    Call<User> performLogin(@Query("username") String username,@Query("password") String password);


}
