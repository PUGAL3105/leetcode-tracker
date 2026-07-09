// Last updated: 09/07/2026, 09:49:01
class Solution {
    private int countPairs(int[] leftarr, int leftSize, int[] rightarr, int rightSize) {
        int i = 0, j = 0, result = 0;

        while (i < leftSize && j < rightSize) {
            if (leftarr[i] > 2L * rightarr[j]) {
                result += leftSize - i;
                j++;
            } else {
                i++;
            }
        }

        return result;
    }

    int merge(int[] nums, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int[] leftarr = new int[leftSize];
        int[] rightarr = new int[rightSize];

        int k = left;

        for (int i = 0; i < leftSize; i++)
            leftarr[i] = nums[k++];

        for (int j = 0; j < rightSize; j++)
            rightarr[j] = nums[k++];

        int result = countPairs(leftarr, leftSize, rightarr, rightSize);

        int i = 0, j = 0;
        k = left;

        while (i < leftSize && j < rightSize) {
            if (leftarr[i] >= rightarr[j])
                nums[k++] = rightarr[j++];
            else
                nums[k++] = leftarr[i++];
        }

        while (i < leftSize)
            nums[k++] = leftarr[i++];

        while (j < rightSize)
            nums[k++] = rightarr[j++];

        return result;
    }

    int mergeSort(int[] nums, int left, int right) {
        if (left >= right)
            return 0;

        int result = 0;
        int mid = left + (right - left) / 2;

        result += mergeSort(nums, left, mid);
        result += mergeSort(nums, mid + 1, right);
        result += merge(nums, left, mid, right);

        return result;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}