package com.flip.connect.data.repository.api.account;

import com.flip.connect.data.model.account.AccountResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

/**
 * Created by Kanda on 13/07/2017.
 */

public interface AccountService {

    @Headers({
            "Accept-Language: pt-BR",
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @GET("/user/account")
    Call<AccountResponse> getAccount(@Header("Authorization") String authorization);

}