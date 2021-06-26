import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {
	//An example for the test to access
	Contact contact = new Contact("10011001", "Albert", "Alvarez", "1001234501", "1st ST");
	//ID Test
	@Test
	public void getcontactID() 
	{
		assertEquals("10011001", contact.getcontactID());
	}
	//FirstName Test
	@Test
	public void getfirstName() 
	{
		assertEquals("Albert", contact.getfirstName());
	}
	//LastName Test
	@Test
	public void getlastName() 
	{
		assertEquals("Alvarez", contact.getlastName());
	}
	//PhoneNumber Test
	@Test
	public void getpNumber() 
	{
		assertEquals("1001234501", contact.getpNumber());
	}
	//Address Test
	@Test
	public void getaddress() 
	{
		assertEquals("1st ST", contact.getaddress());
	}
	
}
