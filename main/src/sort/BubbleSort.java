package sort;

import java.util.Arrays;

/**
 * Created by ozc on 2018/3/14.
 *
 * @author ozc
 * @version 1.0
 */
public class BubbleSort {


    public static void main(String[] args) {
       int[] arrays = {2, 5, 1, 3, 4};


        /*//使用临时变量，让两个数互换
        int temp;

        //第一位和第二位比
        if (arrays[0] > arrays[1]) {
            //交换
            temp = arrays[0];
            arrays[0] = arrays[1];
            arrays[1] = temp;
        }

        //第二位和第三位比
        if (arrays[1] > arrays[2]) {
            temp = arrays[1];
            arrays[1] = arrays[2];
            arrays[2] = temp;
        }

        //第三位和第四位比
        if (arrays[2] > arrays[3]) {
            temp = arrays[2];
            arrays[2] = arrays[3];
            arrays[3] = temp;
        }

        //第四位和第五位比
        if (arrays[3] > arrays[4]) {
            temp = arrays[3];
            arrays[3] = arrays[4];
            arrays[4] = temp;
        }
        System.out.println(arrays);

        //第一趟排序完成----------------------------

        //第一位和第二位比
        if (arrays[0] > arrays[1]) {
            //交换
            temp = arrays[0];
            arrays[0] = arrays[1];
            arrays[1] = temp;
        }

        //第二位和第三位比
        if (arrays[1] > arrays[2]) {
            temp = arrays[1];
            arrays[1] = arrays[2];
            arrays[2] = temp;
        }

        //第三位和第四位比
        if (arrays[2] > arrays[3]) {
            temp = arrays[2];
            arrays[2] = arrays[3];
            arrays[3] = temp;
        }

        //第四位不需要和第五位比了，因为在第一趟排序结束后，第五位是最大的了。

        System.out.println(arrays);
*/



        //装载临时变量
        int temp;

        //记录是否发生了置换， 0 表示没有发生置换、 1 表示发生了置换
        int isChange;



        //记录执行了多少趟
        int num = 0;


        //外层循环是排序的趟数
        for (int i = 0; i < arrays.length -1 ; i++) {

            //每比较一趟就重新初始化为0
            isChange = 0;

            //内层循环是当前趟数需要比较的次数
            for (int j = 0; j < arrays.length - i - 1; j++) {

                //前一位与后一位与前一位比较，如果前一位比后一位要大，那么交换
                if (arrays[j] > arrays[j + 1]) {
                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;


                    //如果进到这里面了，说明发生置换了
                    isChange = 1;

                }
            }
            //如果比较完一趟没有发生置换，那么说明已经排好序了，不需要再执行下去了
            if (isChange == 0) {
                break;
            }
            num++;

        }

        System.out.println(num);
        System.out.println(Arrays.toString(arrays));

    }
}


