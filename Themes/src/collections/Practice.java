package collections;

import java.util.HashSet;
import java.util.Set;

public class Practice {
static Set<Wave> waves=new HashSet<>();
	public static void main(String[] args) {
		Wave w1=new Wave(10, 10, 20);
		Wave w2=new Wave(10, 10, 20);
	
		waves.add(w1);
		waves.add(w2);
		for(Wave w : waves) {
			System.out.println(w.getHeight());
			System.out.println(w.getLocationx());
			System.out.println(w.getLocationy());
		}

	}

}

class Wave{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + locationx;
		result = prime * result + locationy;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wave other = (Wave) obj;
		if (height != other.height)
			return false;
		if (locationx != other.locationx)
			return false;
		if (locationy != other.locationy)
			return false;
		return true;
	}

	private int height;
	private int locationx;
	private int locationy;
	public int getHeight() {
		return height;
	}

	public int getLocationx() {
		return locationx;
	}

	public Wave(int height, int locationx, int locationy) {
		super();
		this.height = height;
		this.locationx = locationx;
		this.locationy = locationy;
	}

	public int getLocationy() {
		return locationy;
	}

	public Wave(int height) {
		super();
		this.height = height;
	}
	
	
}