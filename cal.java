package wekk1day2;

public class cal {
 
		public int getAdd (int a, int b) {
			System.out.println(a+b); 
			return a+b;
		}
		public double getSub (double a, double b) {
			System.out.println(a-b); 
			return a-b;
		}
		public int getMultiply (int a, int b) {
			System.out.println(a*b); 
			return a*b;
		}
		public int getDivide (int a, int b) {
			System.out.println(a/b); 
			System.out.println(a%b);
			return a/b;
			
		}
		public String getCal (String f) {
			System.out.println("Calculator Values below:"); 
			return "Cal Values below:";
			
		}
		public static void main(String[] args) {
			cal value = new cal();
			value.getCal("Calculator Values below:");
			value.getAdd(1,2);
			value.getSub(3.5,2.4);
			value.getMultiply(15, 2);
			value.getDivide(10,2);
			
		}
	}