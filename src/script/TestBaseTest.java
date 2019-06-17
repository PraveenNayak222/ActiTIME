package script;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import generic.XL;


public class TestBaseTest extends BaseTest {
	@Test
	public void test()
	{
		try {
			int rc = XL.getRowCount(XL_PATH, "sheet1");
			Reporter.log("no of rows "+rc,true);
		String v = XL.getData(XL_PATH, "sheet1", 0, 0);
		Reporter.log(v,true);
		Reporter.log("test",true);
		//Assert.fail();
		}
		catch(Exception e)
		{
			
		}
		
	
	}

}
