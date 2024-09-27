*/ You are given an array of integers arr . Your task is to reverse the given array and return the reversed array.

Examples:

Input: arr = [1, 2, 3, 4]
Output: [4, 3, 2, 1]
Explanation: The elements of the array are 1 2 3 4. After reversing the array, the first element goes to the last position,
the second element goes to the second last position and so on. Hence, the answer is 4 3 2 1.*/


class Solution {
    public void reverseArray(int arr[]) {
        // code here
        Stack<Integer> s = new Stack<>();
        
        for(int i : arr){
            
            s.push(i);
        }
        
        
        int i = 0;
        while(!s.isEmpty()){
           int val = s.peek();
           s.pop();
           arr[i++] = val;
        }
    }
}