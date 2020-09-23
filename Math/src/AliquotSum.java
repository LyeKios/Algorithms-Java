/**
 * <p>
 * In number theory, the aliquot sum s(n) of a positive integer n is the sum of all proper divisors of n,
 * that is, all divisors of n other than n itself.
 * For example, the proper divisors of 15 (that is, the positive divisors of 15 that are not equal to 15)
 * are 1, 3 and 5, so the aliquot sum of 15 is 9 i.e. (1 + 3 + 5).
 * </p>
 * Wikipedia: https://en.wikipedia.org/wiki/Aliquot_sum
 */
public class AliquotSum {
    public static void main(String[] args) {
        System.out.println(aliquotSum(100));
    }

    public static int aliquotSum(int targetNum) {
        /**
         * Finds the aliquot sum of an integer number
         *
         * @param number a positive integer
         * @return aliquot sum of given {@code number}
         */
        int sum = 0;
        for (int i = 1; i <= targetNum / 2; i++) {
            if (targetNum % i == 0){ sum = sum + i; }
        }
        return sum;
    }
}
