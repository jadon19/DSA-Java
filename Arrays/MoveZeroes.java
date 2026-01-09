class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int writePos = 0; // next position for a non-zero

        // Pass 1: compact non-zeros to the front (stable)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[writePos++] = nums[i];
            }
        }

        // Pass 2: fill the remainder with zeros
        while (writePos < nums.length) {
            nums[writePos++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,2,5,0,0,9,0,1};
        MoveZeroes obj = new MoveZeroes();
        obj.moveZeroes(nums);
        for(int i =0;i<nums.length;i++){
        System.err.println(nums[i]);
        }
        
    }
}