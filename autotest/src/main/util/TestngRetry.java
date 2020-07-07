package main.util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.log4testng.Logger;

/**
 * 
 *@ClassName:TestngRetry
 *@Description:实现重复执行接口
 *@author:邓泽芳
 *@date:2017年3月1日
 *
 */
public class TestngRetry implements IRetryAnalyzer {
	
//	private static Logger logger=Logger.getLogger(TestngRetry.class);
	private static int maxRetryCount=3;
	private int retryCount=1;

	public TestngRetry() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retryCount<maxRetryCount){
			String message = "Running retry for '" + result.getName()
                    + "' on class " + this.getClass().getName() + " Retrying "
                    + retryCount + " times";
//			logger.info(message);
//			Reporter.log(message);
			Reporter.setCurrentTestResult(result);
			Reporter.log("该用例重复运行："+(retryCount+1)+"次");
			retryCount++;
			return true;
		}
		
		
		return false;
	}

}
