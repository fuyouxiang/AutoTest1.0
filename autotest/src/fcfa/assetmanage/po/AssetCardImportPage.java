package fcfa.assetmanage.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import autoitx4java.AutoItX;
import main.po.BasePage;
/**
 * 
 *@ClassName:AssetCardImportPage
 *@Description:资产管理-资产导入页面类
 *@author:邓泽芳
 *@date:2017年3月30日
 *
 */
public class AssetCardImportPage extends BasePage {

	@FindBy(linkText="保存")
	private WebElement saveDataBtn;
	
	@FindBy(linkText="检视")
	private WebElement checkDataBtn;
	
	@FindBy(linkText="导入")
	private WebElement importBtn;
	
	@FindBy(css="#delBtn")
	private WebElement delBtn;
	
	@FindBy(css="#setBtn")
	private WebElement setBtn;
	
	@FindBy(css="#downBtn")
	private WebElement downBtn;
	
	@FindBy(css="#assetFile")
	private WebElement assetFile;
	
	public void importFile(String filePath){
		assetFile.click();
		AutoItX aix=new AutoItX();
		String title="文件上传";
		aix.winWait(title);
		aix.winActivate(title);
		aix.controlFocus(title, "", "[CLASS:Edit; INSTANCE:1]");
		aix.send(filePath);
		
		aix.controlClick(title, "打开(&O)", "[CLASS:Button; INSTANCE:1]"); 
		
		checkDataBtn.click();
		importBtn.click();
		saveDataBtn.click();
		

		
//		aix.controlClick(title, "取消", "[CLASS:Button; INSTANCE:2]");	 /********点击取消按钮*********/
//		aix.run("notepad", "C:/Windows/System32", AutoItX.SW_MAXIMIZE);  /********打开记事本*********/
	
	}
	
}
