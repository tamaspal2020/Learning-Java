import java.util.HashSet;

public class Firstduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a=new int[] {1,4,6,346,87,8,4,3,236,7,98,1,32,1,4,5};
System.out.print(firstDuplicate(a));
	}


static int firstDuplicate(int[] a) {
HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<a.length;i++){
            if (! hashSet.contains(a[i])) {
                hashSet.add(a[i]);
            } else {
                return a[i];
            }
        }
        return -1;
	
}
}
