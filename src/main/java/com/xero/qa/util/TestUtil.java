package com.xero.qa.util;

import com.xero.qa.base.TestBase;

public class TestUtil extends TestBase {
public static long Page_Load_TimeOut=20;
public static long Implicit_wait=10;

public void SwitchToframe() 
{
driver.switchTo().frame("mainPanel");
   }
}
