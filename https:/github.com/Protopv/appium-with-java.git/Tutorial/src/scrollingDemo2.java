import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;




public class scrollingDemo2 extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     Dimension size = driver.manage().window().getSize();
	     int x = size.getWidth() / 2;
	     int starty = (int)(size.getHeight()* 0.60);
	     int endy = (int)(size.getHeight()* 0.10);
	     driver.swipe(x, starty, x, endy, 2000);
	     
	     driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
	     
	     
	     
	}

}
