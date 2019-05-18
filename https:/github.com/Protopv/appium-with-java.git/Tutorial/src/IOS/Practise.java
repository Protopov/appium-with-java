import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

import io.appium.java_client.remote.AutomationName;

import io.appium.java_client.ios.IOSElement;

public class Practise{
	IOSDriver<IOSElement>driver;
	public static IOSDriver<IOSElement>capabilities()
	{

		DesiredCapabilities d = new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME, "Ipone 6");
		d.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		
	d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);	
	d.setCapability(MobileCapabilityType.APP, "//user//xcodeclub/Desktop//UICatolog.app");
	driver=new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),d);
	return driver;
		
	}
}

