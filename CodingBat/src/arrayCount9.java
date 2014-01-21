public int arrayCount9(int[] nums) {
  int numberOfNines = 0;
  for(int r = 0; r < nums.length; r++) {
    if (nums[r] == 9) {
    numberOfNines = numberOfNines + 1;
    }
  }
  return numberOfNines;
}
