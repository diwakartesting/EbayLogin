# EbayLogin
package objectrepository;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import sampTest.DesireCapa;


public class EbayLogin  extends DesireCapa {

	public WebDriver driver;
	
	public EbayLogin(WebDriver driver)
	{
	this.driver=driver;
	
	}
	//By Navigation =By.xpath("//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]");
	//By Navigation =By.xpath("//android.widget.LinearLayout[@content-desc=\"Sign in or Register\"]/android.widget.LinearLayout/android.widget.Button[2]");
	By Signin=By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.Button[@index='1']");
	By ClickEdit=By.id("com.ebay.mobile:id/edit_text_username");
	By ClickPwd=By.id("com.ebay.mobile:id/edit_text_password");
	By ClickSignin=By.id("com.ebay.mobile:id/button_sign_in");
	By MayBe=By.xpath("//android.widget.ScrollView[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.Button[@index='0']");
	By Search=By.xpath("//android.view.ViewGroup[@index='1']/android.widget.LinearLayout[@index='0']/android.view.ViewGroup[@index='0']/android.widget.LinearLayout[@index='0']");
	By Serc=By.xpath("//*[@text='Search for anything']");
	By Text=By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.TextView[@index='0']");
	By Pric=By.id("com.ebay.mobile:id/textview_item_price");
	By Buy=By.xpath("//*[@text='BUY IT NOW']");
	By Rew=By.xpath("//*[@text='REVIEW']");
   

	public WebElement Sign() 
	{
		
		return driver.findElement(Signin); 
		
		
	}
	public WebElement Edit() 
	{
		
		return driver.findElement(ClickEdit);
		
	}
	public WebElement Pwd() 
	{
		
		return driver.findElement(ClickPwd);
		
	}
	public WebElement Signin() 
	{
		
		return driver.findElement(ClickSignin);
		
	}
	public WebElement Maybe() 
	{
		
		return driver.findElement(MayBe);
		
	}
	public WebElement search() 
	{
		
		return driver.findElement(Search);
		
	}
	
	public WebElement Serc()
	{
		return driver.findElement(Serc);
	}
	
	public WebElement Text()
	{
		return driver.findElement(Text);
		
	}
	
	public WebElement Pric()
	{
		return driver.findElement(Pric);
	}
	
	public WebElement Buy()
	{
		return driver.findElement(Buy);
	}
	
	public WebElement Rew()
	{
		return driver.findElement(Rew);
		
	}
	public String dd()
	{
	String cc=driver.findElement(Text).getText().trim();
	return cc;
	}
     
	
}



