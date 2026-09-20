/*
@author Vedh
*/
class Question5{
    int[] rotateArray(int[] nums, int k) {
        k = k % nums.length;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            result[(i + k) % nums.length] = nums[i];
        return result;
    }
    public static void main(String[] args) {
        Question5 obj = new Question5();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] result = obj.rotateArray(nums, 3);
        for (int x : result)
            System.out.print(x + " ");
    }
}