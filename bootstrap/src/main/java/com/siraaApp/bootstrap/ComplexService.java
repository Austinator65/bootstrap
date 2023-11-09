package com.siraaApp.bootstrap;

import java.io.IOException;

import elemental.json.JsonObject;
//import com.vaadin.flow.component.JsonObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject; // you were missing this import probably

@org.springframework.stereotype.Service
public class ComplexService {
    private final String posturl = "https://jsonplaceholder.typicode.com/posts";
    // private final Moshi moshi = new Moshi.Builder().build();
    OkHttpClient client = new OkHttpClient();

    Response response;

    public JSONObject getData() throws IOException {
        Request request = new Request.Builder()
                .url(posturl)
                .build();

        response = client.newCall(request).execute();

        try{
            return new JSONObject(response.body().toString());
        }catch (JSONException e){
            System.out.println(e.getMessage());
            return null;
        }


        // try {
        // return new JsonAdapter.fromJson(response.body().source());
        // } catch (JsonException e) {
        // e.printStackTrace();
        // }

        // return null;
    }

}
