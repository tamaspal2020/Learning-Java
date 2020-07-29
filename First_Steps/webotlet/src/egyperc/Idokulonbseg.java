package egyperc;

public class Idokulonbseg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ido1 = "7:35:40";  
		String ido2 = "8:20:15";
		Idokulonbseg i=new Idokulonbseg();
		i.szamol(ido1, ido2);
		
	}
public void szamol(String a, String b) {
	String[] tomb1=a.split(":");
	String[] tomb2=b.split(":"); 
	int idoszam1 = 0;
	int idoszam2 = 0; 
	double x=60;
	for (int i=0; i<tomb1.length ; i++)
	{
		double y=i;
		idoszam1+=Integer.parseInt(tomb1[2-i])*(int)(Math.pow(x, y));
		idoszam2+=Integer.parseInt(tomb2[2-i])*(int)(Math.pow(x, y));
	}
	System.out.println(idoszam1);
	System.out.println(idoszam2);
	int kul=idoszam2-idoszam1;
	int um=kul%60;
	kul=(kul-um)/60;
	int up=kul%60;
	int uo=(kul-up)/60;
	System.out.println(um+","+up+","+ uo);
}
}
