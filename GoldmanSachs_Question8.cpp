//link: https://practice.geeksforgeeks.org/viewSol.php?subId=e2d800f3525a2d69164273d28a3fdce8&pid=705327&user=gopalsays108	

public:
		int CountWays(string s){
		    int mod = 1000000007;
		    if(s.size()<1) return 0;
            if(s[0]=='0') return 0;
            if(s.size()==1) return 1;
            int l1=1;
            int l2=1;
            for(int i=1;i<s.size();i++){
                int d1=s[i]-'0';
                int d2=(s[i-1]-'0')*10+d1;
                int val=0;
                if(d1>=1) val=(val+l2)%mod;
                if(d2>9 && d2<=26) val=(val+l1)%mod;
                l1=l2;
                l2=val;
            }
            return l2%mod;
	}
