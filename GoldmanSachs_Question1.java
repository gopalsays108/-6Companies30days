//Submission link: https://practice.geeksforgeeks.org/viewSol.php?subId=f977f193acd2becab1ad03647e765ada&pid=701966&user=gopalsays108

class Solution {
    public List<List<String>> Anagrams(String[]  string_list ){
        // Code here 
        
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bMap = new HashMap<>();
        
        for(String str: string_list){
            HashMap<Character, Integer> fMap = new HashMap<>();
            
            for(int i =0; i<str.length(); i++){
                char ch = str.charAt(i);
                fMap.put(ch, fMap.getOrDefault(ch,0) + 1);
            }
            
            if(bMap.containsKey(fMap) == false){
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                
                bMap.put(fMap,list);
            }else{
                ArrayList<String> list = bMap.get(fMap);
                list.add(str);
            }
        }
        
        List<List<String>> result = new ArrayList<>();
        for(ArrayList<String> val: bMap.values()){ // It return all values of the hashmap
            result.add(val);
        } 
        
        return result;
    }
}
