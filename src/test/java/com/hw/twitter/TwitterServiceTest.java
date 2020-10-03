package com.hw.twitter;


import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.hw.twitter.service.TwitterService;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TwitterServiceTest {
	
	@LocalServerPort
	private int port;
	@Autowired
	private TestRestTemplate restTemplate;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TwitterService.class);

	
	
	@Test
	public void testRequestManagement()
	{
		
		try
		{
			Assert.assertEquals("test" ,TwitterService.createTweet("test"));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			LOGGER.error("An error occurred while running test case:", e);
		}
	}

}
