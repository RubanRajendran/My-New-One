package org.fail;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult arg0) {
		int a=0;
		int b=3;
		if (a<b) {
			a++;
			return true;
			
		}
		
		return false;
	}

}
