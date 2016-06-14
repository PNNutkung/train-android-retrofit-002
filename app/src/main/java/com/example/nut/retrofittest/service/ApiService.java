package com.example.nut.retrofittest.service;

import com.example.nut.retrofittest.dao.Contributor;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by nut on 13/6/2559.
 */
public interface ApiService {
    @GET ("repos/{owner}/{repo}/contributors")
    Call<List<Contributor>> repoContibutors(
            @Path("owner") String owner,
            @Path("repo") String repo
    );
}
