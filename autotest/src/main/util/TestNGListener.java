package main.util;

import java.util.Iterator;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;

/**
 * 
 *@ClassName:TestNGListener
 *@Description:实现ITestListener接口，当运行失败时调用截屏类
 *@author:邓泽芳
 *@date:2017年2月28日
 *
 */
public class TestNGListener implements ITestListener {

	public TestNGListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onFinish(ITestContext context) {
		// 执行失败的用例结果去重，只显示一个结果
		Iterator<ITestResult> listOfFailedTests = context.getFailedTests().getAllResults().iterator();
        while (listOfFailedTests.hasNext()) {
            ITestResult failedTest = listOfFailedTests.next();
            ITestNGMethod method = failedTest.getMethod();
            if (context.getFailedTests().getResults(method).size() > 1) {
                listOfFailedTests.remove();
            } else {
                if (context.getPassedTests().getResults(method).size() > 0) {
                    listOfFailedTests.remove();
                }
            }
        }
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		
		ScreenShotOnFailure.takeScreenShot(); 
		String errMsg;
		errMsg="系统运行错误，运行时界面截图见：" + ScreenShotOnFailure.getScreenShotPath()+"\\" +ScreenShotOnFailure.getScreenShotName()
				+"\n"+"运行失败的类名："+tr.getInstanceName()+"，方法名："+tr.getMethod().getMethodName();
		Reporter.log(errMsg);
		System.out.println(errMsg); 

	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}
