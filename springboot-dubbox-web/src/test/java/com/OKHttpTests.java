package com;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by wangyong on 2017/6/27.
 */
public class OKHttpTests {

    @Test
    public void testOKHttp() throws IOException {
        OkHttpClient httpClient = new OkHttpClient();

        String url = "http://service.shipxy.com/apicall/SearchShip?" +
                "v=2&k=bbde2717cbd24f009210deec82ab8b26&enc=1&kw=cosco&tp=1&max=3";

        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = httpClient.newCall(request).execute();
        String result = response.body().string();

        System.out.println(result);


    }
}
