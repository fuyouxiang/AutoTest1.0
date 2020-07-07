package main.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

/**
 * 
 *@ClassName:RetryListener
 *@Description:监听重复执行接口
 *@author:邓泽芳
 *@date:2017年3月1日
 *
 */
public class RetryListener implements IAnnotationTransformer {

	public RetryListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transform(ITestAnnotation testAnno, Class testClass, Constructor testConstr,
			Method testMeth) {
		// TODO Auto-generated method stub
		
		IRetryAnalyzer retryAnalyzer=testAnno.getRetryAnalyzer();
		if(retryAnalyzer==null){
			testAnno.setRetryAnalyzer(TestngRetry.class);
		}

	}

}
 