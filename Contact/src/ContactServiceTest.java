import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	//Adding Test
	@Test
	public void addtest() 
	{
		ContactService s = new ContactService();
		Contact c01 = new Contact("10011001", "Albert", "Alvarez", "1001234501", "1st ST");
		assertEquals(true, s.addContact(c01));
	}
	//Deleting test to see what can be deleted or not
	@Test
	public void deletetest()
	{
		ContactService s = new ContactService();
		Contact c01 = new Contact("10011001", "Albert", "Alvarez", "1001234501", "1st ST");
		Contact c02 = new Contact("10011002", "Bob", "Burger", "1001234502", "2nd ST");
		Contact c03 = new Contact("10011003", "Chris", "Colt", "1001234503", "3rd ST");
		s.addContact(c01);
		s.addContact(c02);
		s.addContact(c03);
		assertEquals(true, s.deleteContact("10011001"));
		assertEquals(false, s.deleteContact("10011004"));
	}
	//Updating test to see what can be added or not
	@Test
	public void updatetest()
	{
		ContactService s = new ContactService();
		Contact c01 = new Contact("10011001", "Albert", "Alvarez", "1001234501", "1st ST");
		Contact c02 = new Contact("10011002", "Bob", "Burger", "1001234502", "2nd ST");
		Contact c03 = new Contact("10011003", "Chris", "Colt", "1001234503", "3rd ST");
		s.addContact(c01);
		s.addContact(c02);
		s.addContact(c03);
		assertEquals(true, s.updateContact("10011001", "Tommy", "Oliver", "1562876410", "Angel St"));
		assertEquals(false, s.updateContact("10011004", "Chris", "Colt", "1001234503", "3rd ST"));
	}

}
