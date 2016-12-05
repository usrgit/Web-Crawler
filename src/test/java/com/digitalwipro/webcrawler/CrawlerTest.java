package com.digitalwipro.webcrawler;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Shibu on 28/11/2016.
 *
 * This program is doing the unit testing of Crawler.java by JUnit
 *
 */
public class CrawlerTest {

    @Test
    public void getCrawlFromAddress() throws Exception {
        String [] allURLs;
        Crawler crawler = new Crawler();
        allURLs = crawler.getCrawlFromAddress("http://wiprodigital.com");
        assertNotNull(allURLs);
        assertEquals("http://wiprodigital.com/",allURLs[1]);
        assertNotEquals("http://wiprodigital.com/",allURLs[4]);
        assertEquals("http://wiprodigital.com/join-our-team#wdcareers_team",allURLs[5]);
    }

}