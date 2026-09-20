/*
@author Vedh
*/
class Question3{
    boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Question3 obj = new Question3();
        int[] nums = {1, 2, 3, 1};
        System.out.println(obj.containsDuplicate(nums));
    }
}