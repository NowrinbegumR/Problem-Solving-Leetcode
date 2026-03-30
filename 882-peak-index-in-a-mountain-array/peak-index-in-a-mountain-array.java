class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int lo = 1;
        int hi = arr.length - 2;

        while (lo <= hi) {

            int mid = (lo + hi) / 2;

            // Peak found
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // Increasing slope → move right
            else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            }
            // Decreasing slope → move left
            else {
                hi = mid - 1;
            }
        }

        return -1;
    }
}