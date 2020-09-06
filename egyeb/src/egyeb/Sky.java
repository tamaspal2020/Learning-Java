package egyeb;

import java.util.Set;
import java.util.TreeSet;

public class Sky{
	public static Set<Cloud> clouds =new TreeSet<>();
	public static void main(String[] args) {
		Cloud c1=new Cloud();
		Cloud c2=new Cloud();			
		clouds.add(c1);
		clouds.add(c2);

		
	}
	public static Cloud mergeClouds(Cloud c1, Cloud c2) {
		Cloud c3=new Cloud();
		clouds.remove(c1);
		clouds.remove(c2);
		return c3;				
	}
}

class Cloud{
	int latitude;
	int longitude;
	int height;
	int watercontent;
	int rainintensity;
	int density;
	public void rain(int time) {
		watercontent=watercontent-time*rainintensity;
	}
}