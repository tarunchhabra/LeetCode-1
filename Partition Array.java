public class Solution {
    /*
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // left找偶數, right找奇數, left左邊都是奇數, right右邊都是偶數
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            while (left <= right && nums[left] % 2 != 0) {
                left++;
            }
            while (left <= right && nums[right] % 2 == 0) {
                right--;
            }
            
            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }
}