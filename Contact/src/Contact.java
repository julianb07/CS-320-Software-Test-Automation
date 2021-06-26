
public class Contact {
String contactID;
String firstName;
String lastName;
String pNumber;
String address;

	public Contact(String contactID, String firstName, String lastName, String pNumber, String address)
	{
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pNumber = pNumber;
		this.address = address;	
	}

	public String getcontactID()
	{
		return contactID;
	}

	public void setcontactID(String contactID)
	{
		this.contactID = contactID;
	}

	public String getfirstName()
	{
		return firstName;
	}

	public void setfirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getlastName()
	{
		return lastName;
	}

	public void setlastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getpNumber()
	{
		return pNumber;
	}

	public void setpNumber(String pNumber)
	{
		this.pNumber = pNumber;
	}

	public String getaddress()
	{
		return address;
	}

	public void setaddress(String address)
	{
		this.address = address;
	}

	public String toString()
	{
		return "Contact: \n contactID:" + contactID + ", \n firstName:" + firstName + ", \n lastName:" + lastName + ", \n pNumber:" + pNumber + ", \n address:" + address +"";
	}

}
