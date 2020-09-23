import java.util.Random;

/*
**Get a randomNum in range [int a, int b]
* params: int a ; int b;
* return: a random number;
* eg: randomInt(10, 20) = 14
 */
public class RandomInt {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Get a Random in range(" + a + ","+ b + "):" + randomInt(a, b));

    }

    public static int randomInt(int min, int max) {
        return new Random().nextInt(max)%(max - min) + min;
    }
}
