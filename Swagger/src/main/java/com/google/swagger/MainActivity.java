package com.google.swagger;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.api.CompetitionCategoryApi;
import io.swagger.client.model.CompetitionCategory;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiInvoker.initializeInstance();


        new Thread(){
            @Override
            public void run() {
                CompetitionCategoryApi competitionCategoryApi = new CompetitionCategoryApi();
                competitionCategoryApi.setBasePath("http://192.168.50.154:8000/football");
                try {
                    List<CompetitionCategory> visitor = competitionCategoryApi.getCompetitionCategories("visitor", 0);
                    Log.e("Swagger",visitor.toString());
                } catch (TimeoutException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ApiException e) {
                    Log.e("Swagger",e.getMessage());
                    e.printStackTrace();
                }

            }
        }.start();

    }
}
