import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseChrome {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		

		AndroidDriver<AndroidElement> driver;
		
		// TODO Auto-generated method stub
      

		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo1");
		//capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		driver = new AndroidDriver<> (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		return driver;
		//AndroidUIAutomator
		
	}

}