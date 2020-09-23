 /**
 * Amicable numbers are two different numbers so related
 * that the sum of the proper divisors of each is equal to the other number.
 * (A proper divisor of a number is a positive factor of that number other than the number itself.
 * For example, the proper divisors of 6 are 1, 2, and 3.)
 * A pair of amicable numbers constitutes an aliquot sequence of period 2.
 * It is unknown if there are infinitely many pairs of amicable numbers.
 * *
 * <p>
 * * link: https://en.wikipedia.org/wiki/Amicable_numbers
 * * </p>
 * <p>
 * Simple Example : (220,284) 220 is divisible by {1,2,4,5,10,11,20,22,44,55,110 } <- Sum = 284
 * 284 is divisible by -> 1,2,4,71,142 and the Sum of that is. Yes right you probably expected it 220
  * 亲和数： 定义数对 (x,y) 为亲和数对且x、y各自的所有非自身正因子之和等于另一个数.
  * 例如 (220,284) 是亲和数对,220非自身正因子之和为 284,284非自身正因子之和220数对 (x,y ) 跟 (y,x) 被认为是同一数对
 */

public class AmicableNumber {
     public static void main(String[] args) {
         findAllNumInRange(1, 1000);

     }

     /**
      *  calculated in recursive calls the Sum of all the Dividers beside it self
      *  @param num div = the next to test dividely by using the modulo operator
      *  @return sum of all the dividers
      */
     static int sumOfDivider(int num, int div){
         if (div == 1){
             return 0;
         }else if (num % --div == 0){
             return sumOfDivider(num, div) + div;
         }else {
             return sumOfDivider(num, div);
         }
     }

     /**
      * Check if {@code numberOne and numberTwo } are AmicableNumbers or not
      *
      * @param numberOne numberTwo
      * @return {@code true} if {@code numberOne numberTwo} isAmicableNumbers  otherwise false
      */
     static boolean isAmicableNumber(int numberOne, int numberTwo){
         return (sumOfDivider(numberOne, numberOne) == numberTwo) && (sumOfDivider(numberTwo, numberTwo) == numberOne);
     }

     /**
      * @param startValue
      * @param stopValue
      * @return
      */
     static void findAllNumInRange(int startValue, int stopValue){
         StringBuilder res = new StringBuilder();
         int countOfRes = 0;

         for(int i = startValue; i < stopValue; i++){
             for(int j = i + 1; j < stopValue; j++){
                 if (isAmicableNumber(i, j)){
                     countOfRes++;
                     res.append("" + countOfRes + ": = ( " + i + "," + j + " )" + "\t");
                 }
             }
         }
         res.insert(0, "Int Range of " + startValue + " till " + stopValue + " there are " + countOfRes + " Amicable_numbers.These are \n ");
         System.out.println(res.toString());
     }
 }
