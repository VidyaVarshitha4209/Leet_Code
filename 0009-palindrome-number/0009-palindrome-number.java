class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // Step 2: Compare first half and reversed second half
        // For odd digit numbers, drop the middle digit using reversedHalf/10
        return (x == reversedHalf || x == reversedHalf / 10);
    }
}