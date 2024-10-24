*/The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
/*



class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      int n = nums1.length;
    int[] result = new int[n];
    int x=0;
    if(nums1[0]==0){
        result[x++] = -1;
        return result;
    }
    for (int i = 0; i < n; i++) {
        // Find the index of nums1[i] in nums2
        for (int j = 0; j < nums2.length; j++) {
            if (nums2[j] == nums1[i]) {
                // Look for the next greater element
                for (int k = j + 1; k < nums2.length; k++) {
                    if (nums2[k] > nums2[j]) {
                        result[i] = nums2[k];
                        break;
                    }
                    if (k == nums2.length - 1) {
                        result[i] = -1;
                    }
                }
                break;
            }else{
                result[i] = -1;
            }
        }
    }
    
    return result;
      }

    }




