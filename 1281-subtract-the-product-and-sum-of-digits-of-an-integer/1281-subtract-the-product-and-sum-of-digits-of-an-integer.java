class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int temp;
        int length = (int)(Math.log10(n)+1);
        for(int digit = 0; digit<length; digit++)
        {
            temp = n%10;//last digit value
            n /= 10;
            product *= temp;
            sum += temp;
        }
        return (product-sum);
    }
}