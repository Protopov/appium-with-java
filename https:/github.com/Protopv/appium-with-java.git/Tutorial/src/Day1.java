//package basics;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriverException;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Day1 {

public static int gotoframe(WebDriver driver1,By by)

{

driver1.switchTo().defaultContent();

int i;

int num = -1;

int a=driver1.findElements(By.tagName("iframe")).size();

for(i=0;i<a;i++)

{

driver1.switchTo().defaultContent();

driver1.switchTo().frame(i);

int b=driver1.findElements(by).size();

if(b>0)

{

num=i;

break;

}

}

driver1.switchTo().defaultContent();

return num;

/*
WebDriver driver=new FirefoxDriver();
driver.get("https://fantasycricket.dream11.com/IN/");
WebDriverWait wd=new WebDriverWait(driver,5);
driver.findElement(By.xpath(".//*[@id='mail']")).sendKeys("aa");
wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("I1_1441700500937")));
driver.findElement(By.xpath(".//*[@id='hor']")).click();

int number=findFramenumber(driver,By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
driver.switcgTo().frame(number);
driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
driver.switchTo().defaultContent();

int number=findFramenumber(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));
driver.switcgTo().frame(number1);
driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();




*/



}}