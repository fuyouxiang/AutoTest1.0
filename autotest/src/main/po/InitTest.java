package main.po;


import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;



import main.util.GlobalContant;

/**
 * 
 *@ClassName:InitTest
 *@Description:初始化浏览器，并设置浏览器
 *@author:邓泽芳
 *@date:2017年2月21日
 *
 */
public class InitTest{
	public final static InitTest instance=new InitTest();
		
	public final   WebDriver driver;
	private final int TIMEOUT = GlobalContant.TIMEOUT;
	
	InitTest(){
		if(GlobalContant.BROWSER.equals("Firefox")){									
			//设置firefox安装路径
			System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			
			//启动本机的firefox配置
			ProfilesIni pi=new ProfilesIni();
			FirefoxProfile profile=pi.getProfile("default");
			profile.setPreference("extensions.firebug.allPagesActivation", "on");
			
			
			driver=new FirefoxDriver(profile);
	     	driver.get(GlobalContant.BASEURL);
	     	driver.manage().window().maximize();
	     	
			
			
			
	     	/*  //另一种启动插件方式
	     	File file=new File("xpi\\firebug-2.0.19.xpi");
	     	FirefoxProfile profilenew=new FirefoxProfile();
	     	try {
				profilenew.addExtension(file);
				profilenew.setPreference("extensions.firebug.currentVersion", "2.0.19");
				profilenew.setPreference("extensions.firebug.allPagesActivation", "on");
				profilenew.setPreference("extensions.firebug.net.enableSites", true);
				profilenew.setPreference("extensions.firebug.cookies.enableSites", true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     	
	     	
	     	drivernew=new FirefoxDriver(profilenew);
			drivernew.get(GlobalContant.BASEURL);
			drivernew.manage().window().maximize();
			drivernew.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS); 
			*/
			/*
			System.setProperty("webdriver.ie.driver", "files\\IEDriverServer.exe");
		    WebDriver driver = new InternetExplorerDriver();
		    driver.get(GlobalContant.BASEURL);
		    driver.manage().window().maximize();
	     	//设置隐式等待时间10s
	     	driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS); 
	     	*/
	     	/*//设置显示等待条件
	     	WebDriverWait wait = new WebDriverWait(driver,TIMEOUT);
	     	wait.until(new ExpectedCondition<WebElement>(){  
            	@Override  
            	public WebElement apply(WebDriver d) {  
                	return d.findElement(By.id("b"));  
            	}}).click();  
			*/
		}else if(GlobalContant.BROWSER.equals("Chrome"))
		{
			
			 //Chrome
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\GoogleChromePortable\\chromedriver2.7.exe");

			driver =new ChromeDriver(); 
			//窗口最大化
			driver.get(GlobalContant.BASEURL);
			driver.manage().window().maximize();
	   
			
		}else if(GlobalContant.BROWSER.equals("IE"))
		{
			
			System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Internet Explorer\\IEDriverServer_x64_2.53.1.exe");

			driver =new InternetExplorerDriver();
			//窗口最大化
			driver.get(GlobalContant.BASEURL);
			driver.manage().window().maximize();
					
			
		}else{
			driver=null;
			System.out.println("请设定正确的浏览器！");
		}
	}

	/*
	 public WebDriver getDriver(){
		 return driver; 
	 }*/
	 
	 public InitTest getInstance(){
		 return instance;
	 }
	
	
	 /*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /*
	    	String IEPath = "C:\\Program Files\\Internet Explorer\\iexplore.exe";
	        //String IEPath_64 = "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe";
	        String pro_Path = System.getProperty("user.dir");
	        String IEDriver_Path = pro_Path + "\\IEDriverServer.exe";
	        System.setProperty("webdriver.ie.bin", IEPath);
	        System.setProperty("webdriver.ie.driver", IEDriver_Path);

	        DesiredCapabilities ieCapabilities = DesiredCapabilities
	                .internetExplorer();
	        ieCapabilities
	                .setCapability(
	                        InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
	                        true);
	        driver = new InternetExplorerDriver(ieCapabilities);
	        driver.get(url);
	 

		WebDriver driver=new FirefoxDriver();
		driver.get("http://10.10.65.134:8080/fcfa");
		String title="资产云";
		LoginPage lp = new LoginPage(driver,"login");
		lp.login("999999999", "1");
		
	    IndexPage indexPage =new IndexPage(driver,title);
	    indexPage.clickCardItem();
	    indexPage.clickCardItem_Add();
	    
	    CardItemAddPage ciap=new CardItemAddPage(driver,title);
	    ciap.cardItemAdd_Save("655", "测试655", "12");
	    
	    ConfirmPage cp=new ConfirmPage(driver,title);
	    cp.clickConfirmBtn();
	}
	*/
	 
	 
	 
	 /*
	    public static void initAllPages(WebDriver driver)
		 {
		      File rootFile = new File(Page.class.getResource(".").getFile());
		       //初始化所有子类
		      setSonList(rootFile, rootFile.getAbsolutePath() + "\\", Page.class, rootFile.getAbsolutePath() + "\\" ,driver);
		 }

		   public static <T> void setSonList(File rootFile, String parentDirectory, Class<T> parentClass, String mainPath ,WebDriver driver) {
		        if (rootFile.isDirectory()) {
		            File[] files = rootFile.listFiles();
		            for (File file : files) {
		                setSonList(file, parentDirectory, parentClass,mainPath, driver);
		            }
		        }
		        else {
		            String className = null;
		            try {
		                if (rootFile.getPath().indexOf(".class") != -1 ) {
		                 
		                    className = rootFile.getPath().replace(mainPath, "").replace(".class", "").replace("\\", ".");
		                    System.err.println("初始化Page:"+parentClass.getPackage().getName()+"."+className);
		                    Class<?> classObject = Class.forName(parentClass.getPackage().getName()+"."+className);
		                    classObject.asSubclass(parentClass);
		                    PageFactory.initElements(driver, (Class<?>) classObject);
		                   
		                }
		            } catch (ClassNotFoundException e) {
		                System.err.println("找不到类 " + className);
		            } catch (ClassCastException e) {
		                System.err.println(className + " 不是 " + parentClass + " 的子类");
		            }
		        }
		    } 
	    */
	 
	
}
