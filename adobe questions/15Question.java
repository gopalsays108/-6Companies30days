import java.util.Scanner;

public class RecentVersion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first version name");
		String v1 = sc.next();
		String v11 = v1.replaceAll("\\.", "");
		
		System.out.println("Enter second version name");
		String v2 = sc.next();
		String v22 = v2.replaceAll("\\.", "");
		
		int first = Integer.parseInt(v11);
		int second = Integer.parseInt(v22);
		
		if(first > second){
			System.out.println("Version " + v1 + " is more recent");
		}else if(second > first){
			System.out.println("Version " + v2 + " is more recent");			
		}else {
			System.out.println("Both are same");
		}	
		sc.close();		
	}
}
