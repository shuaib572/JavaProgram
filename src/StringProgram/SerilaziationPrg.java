package StringProgram;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilaziationPrg  implements Serializable
{
	private int id;
	private String name;
	
	public SerilaziationPrg(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		SerilaziationPrg ob=new SerilaziationPrg(101,"jhava is awesome");
		try {
			FileOutputStream fis=new FileOutputStream("‪D:\\aa.txt");
			ObjectOutputStream obj=new ObjectOutputStream(fis);
			obj.writeObject(ob);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
