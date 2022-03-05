package org.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class FailedAll implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation a, Class arg1, Constructor arg2, Method arg3) {
		IRetryAnalyzer r = a.getRetryAnalyzer();
		if (r==null) {
			a.setRetryAnalyzer(Failed.class);
		}
	}
	

}
