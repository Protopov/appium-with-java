import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.File;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;



import static io.appium.java_client.touch.offset.ElementOption.element;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class desiredcapab {

	
		
		

		@Test
		public void test() throws MalformedURLException {
			       File appDir = new File("src");
			   
			    File app = new File(appDir, "bookMyShow-ucb.apk");

			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
			
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
			cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
			//driver.findElementById("com.bt.bms:id/btnLogin").click();
			driver.findElementById("com.bt.bms:id/btnSignUp").click();
		int s=driver.findElements(By.className("android.widget.EditText")).size();
			System.out.println(s);
			List<WebElement>a=driver.findElements(By.className("android.widget.EditText"));
			a.get(0).sendKeys("Appium");
			a.get(1).sendKeys("Mobile");
			a.get(2).sendKeys("appium@training");
			a.get(3).sendKeys("password");
			driver.findElementById("com.bt.bms:id/action_icon").click();	
		
		
		
		}	
		
	}


