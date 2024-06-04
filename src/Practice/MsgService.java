package Practice;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter User Id");
	int id=sc.nextInt();
	User u=new User();
	
//	String UserName=u.getUserNameById(id);
//	String msg=UserName.toUpperCase()+" Welcome";
//	System.out.println(msg);
	
	Optional<String> userName=u.getUserNameByName(id);
	if(userName.isPresent())
	{
		String s=userName.get();
		System.out.println(s.toUpperCase()+"Welcome");
	}
	else
	{
		System.out.println("No Data Found");
	}

	}

}
