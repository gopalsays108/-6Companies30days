//link :https://practice.geeksforgeeks.org/viewSol.php?subId=607385825659d91cf7e41e35c066af8d&pid=705333&user=gopalsays108

class Solution
{
    public String FirstNonRepeating(String stream)
    {
        StringBuilder ret = new StringBuilder();
		int isRepeated[] = new int[26];
		Deque<Character> queue = new ArrayDeque<>();
		for (int i = 0; i < stream.length(); i++) {
			char ch = stream.charAt(i);
			if (isRepeated[ch - 'a'] == 0)
				queue.add(ch);
			
			isRepeated[ch - 'a']++;
			while (!queue.isEmpty() && isRepeated[queue.peek() - 'a'] != 1)
				queue.poll();
			ret.append(queue.isEmpty() ? '#' : queue.peek());

		}
		return  ret.toString();
    }	
}
