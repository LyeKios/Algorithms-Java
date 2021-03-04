package sort;

/**
 * Created by ozc on 2018/3/26.
 *
 * @author ozc
 * @version 1.0
 */
public class ShellSort {


    public static void main(String[] args) {


        int[] arrays = {6,  4321, 432, 344, 55 };


        shellSort(arrays);
        System.out.println("公众号：Java3y" + arrays);

    }

    /**
     * 希尔排序
     *
     * @param arrays
     */
    public static void shellSort(int[] arrays) {


        //增量每次都/2
        for (int step = arrays.length / 2; step > 0; step /= 2) {

            //从增量那组开始进行插入排序，直至完毕
            for (int i = step; i < arrays.length; i++) {

                int j = i;
                int temp = arrays[j];

                // j - step 就是代表与它同组隔壁的元素
                while (j - step >= 0 && arrays[j - step] > temp) {
                    arrays[j] = arrays[j - step];
                    j = j - step;
                }
                arrays[j] = temp;
            }
        }


    }
}
