package fcfa.common.po.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import fcfa.common.po.DeleteConfirmPage;

public class DeleteConfirmPageTest {

	public DeleteConfirmPage deleteConfirmPage;
	
	@BeforeClass
	public void setup(){
		deleteConfirmPage=new DeleteConfirmPage();
	}
	
	@Test
	public void testClickdelConfirmBtn(){
		deleteConfirmPage.clickdelConfirmBtn();
	}
	
	@Test
	public void testClickdelCancelBtn(){
		deleteConfirmPage.clickdelCancelBtn();
	}
}
