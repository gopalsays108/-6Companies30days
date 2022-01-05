//Done this question in Eclipse we can enter as many as number in array

import java.util.*;

class Solution {
    Object[] getMaxTen(int[] arr) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
            if (q.size() > 10) {
                q.poll();
            }
        }
        return q.toArray();
    }
}

public class Max10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the values of Array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        Object[] ans = obj.getMaxTen(arr);
        Arrays.sort(ans);
        
        System.out.println("\n\nAnswers");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
