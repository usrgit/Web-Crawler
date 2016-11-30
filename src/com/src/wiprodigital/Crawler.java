package com.src.wiprodigital;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * Created by Shibu on 28/11/2016.
 * This program will show a simple site map, showing links to other pages under the same domain, links to static content such as images, and to external URLs.
 *
 * Please read the  README file for descriptions to find the steps needed to build and run this program.
 */
public class Crawler {
    public static void main(String[] args) throws Exception{
        int z = 0;
        String listOfURLs[] = new String[1000];
        Crawler crawler = new Crawler();
        listOfURLs = crawler.getCrawlFromAddress("http://wiprodigital.com");
        for (String eachURL : listOfURLs) {
            if (z == 0) {
                z++;
                continue;
            }
            System.out.println(eachURL + '\n');
        }
    }

    public String[] getCrawlFromAddress(String address) throws Exception {
        List<Object> list;
        String[] result;
        HashSet set;
        Pattern pattern;
        String urlFromPage;
        Object[] allURLs = new Object[1000];
        String page = Fetch_Pages.getURL(address);
        int i, tmp, MAX = 1000;
        int startingPoint, endingPoint = page.indexOf("<body");
        for (i = 1; i < MAX; i++) {
            startingPoint = page.indexOf("\"http://", endingPoint) + 1;
            endingPoint = page.indexOf("\"", startingPoint);
            tmp = page.indexOf("'", startingPoint);
            if (tmp < endingPoint && tmp != -1) endingPoint = tmp;
            urlFromPage = page.substring(startingPoint, endingPoint);
            pattern = compile("^http://(?:[a-zA-Z0-9-]+\\.)*wiprodigital\\.com(?:/[^#]*(?:#[^#]+)?)?$");
            Matcher matcher = pattern.matcher(urlFromPage);
            if (matcher.find()) {
                allURLs[i] = urlFromPage;
            }
        }
        list = Arrays.asList(allURLs);
        set = new HashSet(list);
        result = new String[set.size()];
        set.toArray(result);
        return result;
    }
}




