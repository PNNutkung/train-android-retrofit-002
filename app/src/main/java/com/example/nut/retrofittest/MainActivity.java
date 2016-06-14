package com.example.nut.retrofittest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.example.nut.retrofittest.dao.Contributor;
import com.example.nut.retrofittest.service.ApiService;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public final String OWNER = "pakponj";
    public final String REPO = "KUPewPewGdx";
    @BindView(R.id.main_activity_edit_text)
    EditText mainActivityEditText;
    @BindView(R.id.main_activity_btn)
    Button mainActivityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.main_activity_btn)
    public void onClick() {
        ApiService service = RetrofitManager.getInstance().getRetrofit().create(ApiService.class);
        Call<List<Contributor>> call = service.repoContibutors(OWNER,REPO);
        call.enqueue(new Callback<List<Contributor>>() {
            @Override
            public void onResponse(Call<List<Contributor>> call, Response<List<Contributor>> response) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String data = response.body().toString();
                intent.putExtra("INPUT_TEXT", data);
                startActivity(intent);
            }

            @Override
            public void onFailure(Call<List<Contributor>> call, Throwable t) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("INPUT_TEXT", "Failed! " + t.getMessage());
                startActivity(intent);
            }
        });

    }
}
