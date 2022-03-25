package wekk1day2;
import java.util.Arrays;
public class interaction {
		public static void main(String[] args) {
			int[] i = {1,2,3,4,5,6,7};
			int[] j = {1,2,8,4,9,7};
			Arrays.sort(i);
			Arrays.sort(j);
			for (int k=0; k<i.length; k++) {
				for (int l=0; l<j.length; l++) {
					if (i[k]==j[l]) {
						System.out.println(i[k]);
					}
				}
			}
		}
	}
		
