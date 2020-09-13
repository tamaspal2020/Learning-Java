package egyeb;

public class StaticblockInstanceblock {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		//StatinstDemo s=new StatinstDemo();
	
		Class.forName("egyeb.StatinstDemo").newInstance();	
		
	}

}

class StatinstDemo{
	
	static{
		System.out.println("from the static block");
	}
	
	{
		System.out.println("from the instance block");
	}
	 public String getDescription(){
		   return "StatinstDemo";
		  }
	
}
