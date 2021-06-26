
import java.util.ArrayList;
public class ContactService {

	ArrayList<Contact> contacts;
	
	public ContactService()
	{
		contacts = new ArrayList<>();
	}
	
	public boolean addContact(Contact contact)
	{
		boolean isHere = false;
		for (Contact contactList:contacts) 
		{
			if(contactList.equals(contact)) 
			{
				isHere = true;
			}
		}
		if(!isHere)
		{
			contacts.add(contact);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean deleteContact(String contactID)
	{
		for (Contact contactList:contacts)
		{
			if(contactList.getcontactID().equals(contactID))
			{
				contacts.remove(contactList);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateContact(String contactID, String firstName, String lastName, String pNumber, String address)
	{
		for(Contact contactList:contacts)
		{
			if (contactList.getcontactID().equals(contactID))
			{
				if(!firstName.equals("") && !(firstName.length()>10))
				{
					contactList.setfirstName(firstName);
				}
				if(!lastName.equals("") && !(lastName.length()>10))
				{
					contactList.setlastName(lastName);
				}
				if(!pNumber.equals("") && (pNumber.length()==10))
				{
					contactList.setpNumber(pNumber);
				}
				if(!address.equals("") && !(address.length()>30))
				{
					contactList.setaddress(address);
				}
				return true;
			}
			
		}
		return false;
	}
}
