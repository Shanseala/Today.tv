package com.punbear.todaytv;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LruCache;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

/*
 * Created by JMunyer on 4/21/2017 for Today.tv.
 */


public class AppController extends Application{
    //public static final String TAG = AppController.class.getSimpleName();

    //private static AppController mInstance;
    //private RequestQueue mRequestQueue;
    //private ImageLoader mImageLoader;
    //private static Context mCtx;

    /*@Override
    public void onCreate(){
        super.onCreate();
        mInstance = this;
    }

    //If I don't have this here, AndroidManifest.xml goes crazy about it not having a default constructor.  However, as I do have it
    //stuff instantiates without a context which causes nullpointerexceptions.  In interest of time, reworking the app to remove use
    //of singleton
    public AppController(){

    }

    private AppController(Context context) {
        mCtx = context;
        mRequestQueue = getRequestQueue();

        mImageLoader = new ImageLoader(mRequestQueue,
                new ImageLoader.ImageCache() {
                    private final LruCache<String, Bitmap>
                            cache = new LruCache<>(20);

                    @Override
                    public Bitmap getBitmap(String url) {
                        return cache.get(url);
                    }

                    @Override
                    public void putBitmap(String url, Bitmap bitmap) {
                        cache.put(url, bitmap);
                    }
                });
    }

    public static synchronized AppController getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new AppController(context);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            // getApplicationContext() is key, it keeps you from leaking the
            // Activity or BroadcastReceiver if someone passes one in.
            mRequestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        }
        return mRequestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }

    public ImageLoader getImageLoader() {
        return mImageLoader;
    }
*/
}
