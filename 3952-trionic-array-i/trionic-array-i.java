 class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;

        // Minimum length must be at least 3
        if (n < 3) return false;

        int i = 0;

        // 1️⃣ Strictly increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // p cannot be at start or end
        if (i == 0 || i == n - 1) return false;

        // 2️⃣ Strictly decreasing
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }

        // q cannot be at end
        if (i == n - 1) return false;

        // 3️⃣ Strictly increasing again
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // Must reach the last index
        return i == n - 1;
    }
}

   