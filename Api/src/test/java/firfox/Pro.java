package firfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pro {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();      //to maximise browser
		driver.get("https://www.google.co.in/"); //to open any url
		//String title= driver.getTitle();
	//	System.out.println("Title of the page is    "+title);
		//driver.navigate().back();
		//driver.navigate().forward();
	//	driver.navigate().refresh();
		driver.navigate().to("https://demoqa.com/alerts");
		//driver.close();//to close current url open in ur window
		driver.quit();
	
		//ALERT HANDLING
		//driver.manage().window().maximize();
		//  driver.get("https://demoqa.com/alerts");
		 // driver.findElement(By.xpath("//*[@id='alertButton']")).click();
		 // driver.switchTo().alert().accept();
	}

}
