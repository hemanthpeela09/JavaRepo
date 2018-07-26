import java.util.Arrays;

public class Prac1Test {

	public static void main(String[] args) {
		int[] a={1,2,4,5,6,6,7,1,3,4,2};
		int[] result=null;
		result = checkDup(a);
		
		System.out.println(Arrays.toString(result));
	}

	private static int[] checkDup(int[] a) {
		int n = a.length-1;
		int[] result = new int[a.length];
		Arrays.sort(a);
		System.out.println("Sorted array :"+Arrays.toString(a));
		int j=0;
		 for (int i = 0; i < n; i++){
			 if (a[i] != a[i+1]){
				 result[j++] = a[i];
				 System.out.println(a[i]);
			 }
		 }
		 result[j++]=a[n];
		 System.out.println(j);
		return result;
	}
}
