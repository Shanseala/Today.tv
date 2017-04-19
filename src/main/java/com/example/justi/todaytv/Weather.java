package com.example.justi.todaytv;

import android.net.Uri;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/*
 * Created by JMunyer on 4/17/2017 for Today.tv.
 */

class Weather {
    private String baseURL = "http://api.wunderground.com/api/bbbb60c3a23903f6/conditions/q/";
    private Integer zip;



    Weather(int zip){
        this.zip=zip;
    }

    String getApiUrl(){
        String urlString = baseURL + zip.toString() + ".json";

        System.out.println(urlString);

        return urlString;
        /*HttpURLConnection urlConnection;
        URL url;
        JSONObject object = null;

        try
        {
            url = new URL(urlString);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream inStream;
            inStream = urlConnection.getInputStream();
            BufferedReader bReader = new BufferedReader(new InputStreamReader(inStream));
            String temp, response = "";
            while ((temp = bReader.readLine()) != null)
                response += temp;
            bReader.close();
            inStream.close();
            urlConnection.disconnect();

            System.out.println(object.toString());
            //object = (JSONObject) new JSONTokener(response).nextValue();
            //String city = object.getString("city");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        //return (object);
        */
    }


}



