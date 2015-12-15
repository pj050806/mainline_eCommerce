package com.packtpub.wicket.commerce;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;
import com.packtpub.wicket.commerce.CheesrPage;

/**
 * Simple test using the WicketTester
 */
public class TestHomePage
{
	private WicketTester tester;	
	@Before
	public void setUp()
	{
		tester = new WicketTester(new CheesrApplication());
	}

	@Test
	public void homepageRendersSuccessfully()
	{
		//start and render the test page
		tester.startPage(Index.class);		 

		//assert rendered page class
		tester.assertRenderedPage(Index.class);	
	}
}
