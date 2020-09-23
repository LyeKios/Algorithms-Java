/*
* Caculate the Max abs
* eg: absMax([0, 5, 1, 11]) = 11, absMax([3 , -10, -2]) = -10
 */

import java.util.Arrays;

public class AbsoluteMax {
    public static void main(String[] args) {
        int[] testArr = {1, 4, 16, -20}; //wanna got getAbsMax(testArr) = 20
//        if (getAbsMax(testArr) != 2) throw new AssertionError();
        assert getAbsMax(testArr) == -20;

        System.out.println("The AbsMax of (" + Arrays.toString(testArr) + ") is "+ getAbsMax(testArr));

    }

    public static int getAbsMax(int[] Arr) {
        int maxNum = Arr[0];
        for (int j : Arr) maxNum = (Math.abs(j) > Math.abs(maxNum)) ? j : maxNum;
        final int maxNum1 = maxNum;
        return maxNum1;
    }

}
