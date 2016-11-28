package com.src.wiprodigital;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Shibu on 28/11/2016.
 * This program will show a simple site map, showing links to other pages under the same domain,
 * links to static content such as images, and to external URLs.
 *
 * Please read the  README file for descriptions to find the steps needed to build and run this Program.
 *
 */
public class Fetch_Pages {
    public static String getURL(String address)throws Exception{
        String page = "",inputLine = "";
        URL url = new URL(address);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openStream()));
        while ((inputLine = in.readLine()) != null)
            page += inputLine;
        in.close();
        return page;
    }

}
