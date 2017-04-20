package com.example.justi.todaytv;
/*
 * Created by JMunyer on 4/19/2017 for Today.tv.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

import android.content.Context;
import android.util.Log;

public class WeatherFetch {
    private String urlString;

    public WeatherFetch(String urlString) {
        this.urlString = urlString;
    }

    public JSONObject getJSON() {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            StringBuilder json = new StringBuilder(1024);
            String tmp;
            while ((tmp = reader.readLine()) != null) {
                json.append(tmp).append("\n");
            }
            reader.close();

            JSONObject data = new JSONObject(json.toString());

            if (data.getInt("cod") != 200) {
                return null;
            }
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

