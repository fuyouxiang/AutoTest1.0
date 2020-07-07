package main.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import main.po.InitTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.Reporter;

/**
 * 
 *@ClassName:ScreenShotOnFailure
 *@Description:截取当前屏幕，保存为jpg文件
 *@author:邓泽芳
 *@date:2017年2月28日
 *
 */
public class ScreenShotOnFailure {

	private final static String SCREEN_SHOT_PATH="test-output\\screen-shot";
	private static String SCREEN_SHOT_NAME=null;
	
	/**
	 * 
	 *@Method:takeScreenShot
	 *@Description:实现截屏功能方法
	 *@param:无
	 *
	 */
	public  static void takeScreenShot(){
		File screenShotDir = new File(SCREEN_SHOT_PATH);
		if(!screenShotDir.exists()){
			screenShotDir.mkdirs();
		}
		
		WebDriver driver=InitTest.instance.driver;
		
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		SCREEN_SHOT_NAME=driver.getTitle()+df.format(new Date())+".jpg";
		
		try {
			FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File(SCREEN_SHOT_PATH + "\\" + SCREEN_SHOT_NAME));
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("浏览器驱动异常"+e.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("读写文件异常"+e.toString());
		}
		
	}
	
	
	 public static String getScreenShotPath() {  
	        return SCREEN_SHOT_PATH;  
	 }  
	  
	    public static String getScreenShotName() {  
	        return SCREEN_SHOT_NAME;  
	 }  
}
