package com.digitalwipro.webcrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Shibu on 28/11/2016.
 *
 * This program will fetch a source code page for wiprodigital domain.(http://wiprodigtial.com)
 *
 */
class Fetch_Pages {
    public static String getURL(String address)throws Exception{
        String page = "",inputLine;
        URL url = new URL(address);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openStream()));
        while ((inputLine = in.readLine()) != null)
            page += inputLine;
        in.close();
        return page;
    }

}
