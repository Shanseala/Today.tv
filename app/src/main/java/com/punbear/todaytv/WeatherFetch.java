package com.punbear.todaytv;
/*
 * Created by JMunyer on 4/19/2017 for Today.tv.
 */


import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.justi.todaytv.R;

import org.json.JSONObject;

public class WeatherFetch extends Activity{
    private String urlString;
    RequestQueue mRequestQueue;


    public WeatherFetch(String urlString) {
        this.urlString = urlString;
        mRequestQueue = Volley.newRequestQueue(this);
    }

    public void fetch(){
        final TextView mTxtDisplay;
        ImageView mImageView;
        //mTxtDisplay = (TextView) findViewById(R.id.txtDisplay);
        //String url = "http://my-json-feed";

        System.out.println(urlString);

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, urlString, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        //mTxtDisplay.setText("Response: " + response.toString());
                        System.out.println(response.toString());
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub

                    }
                });

// Access the RequestQueue through your singleton class.
        //AppController.getInstance(this).addToRequestQueue(jsObjRequest);

        mRequestQueue.add(jsObjRequest);
    }

}

