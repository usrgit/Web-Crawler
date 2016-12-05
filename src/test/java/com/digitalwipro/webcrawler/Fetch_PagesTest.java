package com.digitalwipro.webcrawler;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

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
            page = Fetch_Pages.getURL(address);
            assertNotNull(page);
        }

}