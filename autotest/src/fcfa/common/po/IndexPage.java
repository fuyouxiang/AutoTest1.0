package fcfa.common.po;

import java.util.List;

import main.po.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

/**
 * 
 *@ClassName:IndexPage
 *@Description:登录系统之后的主页面
 *@author:邓泽芳
 *@date:2017年2月22日
 *
 */
public class IndexPage extends BasePage {
	
	public IndexPage(){
		super();
	}
	
	@FindBy(css="a[title='资产管理']>span")   //资产管理
	private WebElement assetManage;
	
	@FindBy(css="a[href='#assetManage/cardItem/cardItem']>span")
	private WebElement cardItem;   //资产管理-信息项管理
	
	@FindBy(css="a[href='#assetManage/assetItemMapping/assetItemMapping']>span")
	private WebElement assetItemMapping;   //资产管理-资产必填项
	
	@FindBy(linkText="新增")
	private WebElement add_btn;
	
	@FindBy(linkText="修改")
	private WebElement modify_btn;
	
	@FindBy(linkText="删除")
	private WebElement delete_btn;
	
	@FindBy(linkText="启用")
	private WebElement enable_btn;
	
	@FindBy(linkText="停用")
	private WebElement disable_btn;
	
	@FindBy(linkText="注销")
	private WebElement logoutUser_btn;   //用户管理中注销按钮
	
	@FindBy(css=".u-grid-checkbox-tick-outline")
	private List<WebElement> rows;
	
	
	
	@FindBy(css="a[title='系统管理']>span")  //系统管理
	private WebElement sysManage;
	@FindBy(xpath="//ul[@id='F00201']//a[@title='业务模块管理']/span")
	private WebElement spApp;
	
	@FindBy(css="a[href='#sysManage/role/spAppRole']")
	private WebElement spAppRole;  //系统管理-角色管理
	
	
	@FindBy(css="a[href='#sysManage/user/sysUser']")
	private WebElement sysUser;    //系统管理-用户管理
	
	
	@FindBy(css="a[href='#F00101']>span")  //基础数据管理    
	private WebElement baseData;
	@FindBy(xpath="//ul[@id='F00101']//a[@href='#baseData/sysElement']/span")
	private WebElement sysElement;
	
	
	@FindBy(css="a[href='#assetManage/assetSplit/assetSplit']>span")  //资产拆分
	private WebElement assetSplit;
	
	@FindBy(css="a[href='#assetManage/dataImport/assetCardImport']>span")  //资产导入
	private WebElement assetImport;
	
	@FindBy(xpath="//a[@href='/fcfa/logout']")
	private WebElement logout_btn;     //主界面右上角注销按钮
	
	
	@FindBy(css="a[appcode='F010']")
	private WebElement assetList;  //模块列表中的资产管理
	
	
	/**
	 * 
	 *@Method:clickCardItem
	 *@Description:点击资产管理-信息项管理
	 *
	 */
	public void clickCardItem(){
		assetManage.click();
		cardItem.click();
	}
	
	public void clickAssetItemMapping(){
		assetManage.click();
		assetItemMapping.click();
	}
	
	/**
	 * 
	 *@Method:clickAddBtn
	 *@Description:点击增加按钮
	 *
	 */
	public void clickAddBtn(){
		add_btn.click();
	}
	
	
	/**
	 * 
	 *@Method:clickModifyBtn
	 *@Description:点击修改按钮
	 *
	 */
	public void clickModifyBtn(){
		modify_btn.click();
	}
	
	public void clickDeleteBtn(){
		delete_btn.click();
	}
	
	public void clickEnableBtn(){
		enable_btn.click();
	}
	
	public void clickDisableBtn(){
		disable_btn.click();
	}
	
	public void clickLogoutUserBtn(){
		logoutUser_btn.click();
	}
	
	
	/**
	 * 
	 *@Method:selectRow
	 *@Description:选择表格中的行数
	 *
	 */
	public void selectRow(int row){
		rows.get(row).click();
	}
	
	
	/**
	 * 
	 *@Method:clickSpApp
	 *@Description:点击系统管理-业务模块管理
	 *
	 */
	public void clickSpApp(){
		sysManage.click();
		spApp.click();
	}
	
	public void clickSpAppRole(){
		sysManage.click();
		spAppRole.click();
	}
	

	
	public void clickSysUser(){
		sysManage.click();
		sysUser.click();
	}
	
	/**
	 * 
	 *@Method:clickSpApp
	 *@Description:点击基础数据管理-要素代码集定义
	 *
	 */
	public void clickSysElement(){
		baseData.click();
		sysElement.click();
	}
	
	
	public void clickAssetSplit(){
		assetManage.click();
		assetSplit.click();
	}
	
	public void clickAssetImport(){
		assetManage.click();
		assetImport.click();
	}
	
	/**
	 * 
	 *@Method:clickLogoutBtn
	 *@Description:登出系统
	 *
	 */
	public void clickLogoutBtn(){
		logout_btn.click();
	}
	
	
	public void clickAssetList(){
		assetList.click();
	}
	
}
