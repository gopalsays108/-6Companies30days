Link: https://practice.geeksforgeeks.org/viewSol.php?subId=f6c7d01743f9f433b573a54f789a3e88&pid=700243&user=gopalsays108

class GfG
 {
	String encode(String str)
	{
          //Your code here
          StringBuilder sb = new StringBuilder();
          
          int count  =1;
          boolean nows = false;
          for(int i =0;i < str.length();i++){
              
                if(str.length() == 1){
                  return str.charAt(0) + "1" ;
              }
              
              if(i < str.length() -1){
                  
                  if(str.charAt(i) == str.charAt(i+1) ){
                     count++; 
                  }else{
                      sb.append(str.charAt(i) + "" + count);
                      nows = true;
                      count = 1;
                  }
                  
                  if(nows && ( i == str.length() - 2)  )
                     sb.append(str.charAt(i+1) + "" + count); 

                //  if(str.charAt(i) != str.charAt(i+1))
              }
              
          }
          
          return sb.toString();
	}
	
 }
