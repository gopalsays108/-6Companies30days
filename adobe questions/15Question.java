public class RecentVersion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first version name");
		String version1 = sc.next();
		String[] version_1 = version1.split("\\.");
		
		System.out.println("Enter second version name");
		String version2 = sc.next();
		String[] version_2 = version2.split("\\.");
		
	    int len = (version_1.length >= version_2.length) ? version_2.length : version_1.length;
	    boolean ans = false;
		for(int i = 0 ; i < len ; i++)
		{
		    if(Integer.parseInt(version_1[i]) > Integer.parseInt(version_2[i])){
		        System.out.println("Version " + version1 + " is more recent");
		        ans = true;
		        break;
		    }
		        
		        
		    else if (Integer.parseInt(version_2[i]) > Integer.parseInt(version_1[i])){
		        System.out.println("Version " + version2 + " is more recent");
		        ans = true;
		        break;
		    }
		    
		    else
		        continue;
		       
		}
		if(!ans)
			if(version_1.length > version_2.length)
				System.out.println("Version " + version1 + " is more recent");
			else
				System.out.println("Version " + version2 + " is more recent");

		sc.close();		
		
	}
}
