package com.test.wiprodigital;

import com.src.wiprodigital.Fetch_Pages;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import static org.junit.Assert.*;

/**
 * Created by Shibu on 28/11/2016.
 *
 * This program is doing the unit testing of Fetch_Pages.java by JUnit
 *
 */
public class Fetch_PagesTest {
    @Test
    public void getURL() throws Exception {
            String page;
            String address = "http://wiprodigital.com";
            Fetch_Pages fetch_pages = new Fetch_Pages();
            page = fetch_pages.getURL(address);
            assertNotNull(page);
        }

}