
class Solution {
    public int largestPrime(int n) {

        int currentPrimeSum = 0;
        int largestPrimeSum = 0;

        for (int number = 2; ; number++) {

            if (checkPrime(number) == 1) {

                currentPrimeSum = currentPrimeSum + number;

                if (currentPrimeSum > n) {
                    break;
                }

                if (checkPrime(currentPrimeSum) == 1) {
                    largestPrimeSum = currentPrimeSum;
                }
            }
        }

        return largestPrimeSum;
    }

    public int checkPrime(int number) {

        if (number < 2) {
            return 0;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {

            if (number % divisor == 0) {
                return 0;
            }
        }

        return 1;
    }
}
