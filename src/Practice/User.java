package Practice;

import java.util.Optional;

public class User {
	
	public String getUserNameById(int id)
	{
		if(id==100) {
			return "shuaib";
		}
		else if(id==101)
		{
			return "sameer";
			
		}
		else if(id==102) {
			return "pankaj";
		}
		else
			return null;
		
	}
	
	public Optional<String> getUserNameByName(int id)
	{
		String name=null;
		if(id==100) {
			name="shuaib";
		}
		else if(id==101)
		{
			name="sameer";
			
		}
		else if(id==102) 
{
			name= "pankaj";
		}
			return Optional.ofNullable(name);
		
	}

}
