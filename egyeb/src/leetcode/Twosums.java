package leetcode;

public class Twosums {

	public static void main(String[] args) {
		int t=6;
		int[] x= {3,2,4};
		int[] y= {2,7,11,15};
		System.out.println(twoSum(x,  t)[0]+","+twoSum(x, t)[1]);
	}
	public static int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        System.out.println(a[0]+","+a[1]+"out");
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if((nums[i]+nums[j])==target) {
                	System.out.println(nums[i]+","+nums[j]);
                    a[0]=i;
                    a[1]=j;
                    return new int[]{i,j};
                }
            }
        }
        return a;
    }
}

