package sort;

/**
 * Created by ozc on 2018/3/14.
 *
 * @author ozc
 * @version 1.0
 */
public class SelectionSort {


    public void sort() {

        int[] arrays = {2, 3, 1, 4, 3, 5, 1, 6, 1, 2, 3, 7, 2, 3};

        /*
        //假定max是最大的
        int max = 0;


        for (int i = 0; i < arrays.length ; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
            }
        }


        //使用临时变量，让两个数互换
        int temp;
        temp = arrays[11];
        arrays[11] = arrays[13];
        arrays[13] = temp;

        int max2 = 0;
        for (int i = 0; i < (arrays.length - 1); i++) {
            if (arrays[i] > max2) {
                max2 = arrays[i];
            }
        }

        temp = arrays[7];
        arrays[7] = arrays[12];
        arrays[12] = temp;
*/


        //记录当前趟数的最大值的角标
        int pos ;

        //交换的变量
        int temp;


        //外层循环控制需要排序的趟数
        for (int i = 0; i < arrays.length - 1; i++) {

            //新的趟数、将角标重新赋值为0
            pos = 0;

            //内层循环控制遍历数组的个数并得到最大数的角标
            for (int j = 0; j < arrays.length - i; j++) {

                if (arrays[j] > arrays[pos]) {
                    pos = j;
                }

            }
            //交换
            temp = arrays[pos];
            arrays[pos] = arrays[arrays.length - 1 - i];
            arrays[arrays.length - 1 - i] = temp;


        }

        System.out.println("公众号Java3y" + arrays);
    }
}
