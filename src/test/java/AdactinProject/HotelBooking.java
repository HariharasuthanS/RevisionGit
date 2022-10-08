package AdactinProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {
	public static void main(String[] args) throws InterruptedException, IOException {
		//
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Oops\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//web page searching
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
	
	
	

	driver.findElement(By.xpath("//strong[text()='Go to Build 2 ']")).click();
	
	//username send 
	WebElement username = driver.findElement(By.name("username"));
	username.click();
	username.sendKeys("hari1997");
	
	//password entered
	driver.findElement(By.id("password")).sendKeys("roobika2017");
	
	//login click
	
	driver.findElement(By.name("login")).click();
	
	//search hotel
	//search location
	
	WebElement hotelName = driver.findElement(By.name("location"));
	hotelName.click();
	
	
	Select hotel = new Select(hotelName);
	hotel.selectByValue("Melbourne");
	
	//search hotel name
	WebElement hotelN = driver.findElement(By.name("hotels"));
	hotelN.click();
	Select hName = new Select(hotelN);
	hName.selectByVisibleText("Hotel Sunshine");
	//Room type
	
	WebElement roomType = driver.findElement(By.name("room_type"));
	roomType.click();
	
	Select room = new Select(roomType);
	room.selectByValue("Deluxe");
	//number of rooms
	
	WebElement RoomsN = driver.findElement(By.name("room_nos"));
	RoomsN.click();
	
	Select NumberOfRooms = new Select(RoomsN);
	NumberOfRooms.selectByValue("2");
	
	//check in date
	
	WebElement inDate = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	inDate.click();
	inDate.clear();
	inDate.sendKeys("30/09/2022");
	
	//check out date
	
	WebElement outDate = driver.findElement(By.name("datepick_out"));
	outDate.click();
	outDate.clear();
	outDate.sendKeys("10/10/2022");
	
	//adults per room
	
	WebElement adultsRoom = driver.findElement(By.name("adult_room"));
	adultsRoom.click();
	
	Select adults = new Select(adultsRoom);
	adults.selectByValue("2");
	
	//childrens per room
	WebElement child = driver.findElement(By.name("child_room"));
	child.click();
	
	Select childRoom = new Select(child);
	
	childRoom.selectByValue("2");
	
	//search button
	
	driver.findElement(By.name("Submit")).click();
	
	//radio button
	driver.findElement(By.name("radiobutton_0")).click();
	
	//continue button
	driver.findElement(By.name("continue")).click();
	
	//first name
	WebElement firstname = driver.findElement(By.name("first_name"));
	firstname.click();
	firstname.sendKeys("Hariharasuthan");
	
	//last name
	driver.findElement(By.name("last_name")).sendKeys("S");
	//address
	driver.findElement(By.name("address")).sendKeys("greens technology");
	// credit card number 
	
	driver.findElement(By.name("cc_num")).sendKeys("1234567890123456");
	
	//credit card type
	WebElement credit = driver.findElement(By.name("cc_type"));
	credit.click();
	
	Select cc = new Select(credit);
	cc.selectByValue("OTHR");
	
	//select month
	WebElement month = driver.findElement(By.name("cc_exp_month"));
	month.click();
	
	Select mm = new Select(month);
	mm.selectByVisibleText("December");
	
	//select year
	
	WebElement year = driver.findElement(By.name("cc_exp_year"));
	year.click();
	
	Select yy = new Select(year);
	yy.selectByValue("2019");
	
	//CVV number
	
	driver.findElement(By.name("cc_cvv")).sendKeys("652");
	
	
   TakesScreenshot ts= (TakesScreenshot)driver;
	
	File source=ts.getScreenshotAs(OutputType.FILE);
	
	File ff=new File("C:\\Users\\Admin\\eclipse-workspace\\Adactin\\screen\\adact.png");
	
	FileUtils.copyFile(source, ff);
	
	
	//book now
	
	driver.findElement(By.name("book_now")).click();
	

}

}



