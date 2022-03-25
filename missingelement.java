package wekk1day2;
import java.util.Arrays;
public class missingelement {

	public static void main(String[] args) {
			int[] arr = {1,2,3,4,5,7};
			
			Arrays.sort(arr);
			for (int i =0; i<arr.length; i++) {
				int j = arr [i+1] -1;
				if (j!=arr[i]) {
					System.out.println("Missing Num: " + j);
					break;
				}
			}
		}

	}
	

