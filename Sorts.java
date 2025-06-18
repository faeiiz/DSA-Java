
public class Sorts {

    static int printFib(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return printFib(x, n / 2) * printFib(x, n / 2);
        } else {
            return printFib(x, n / 2) * printFib(x, n / 2) * x;

        }
        // return ans;
    }

    public static void main(String[] args) {

        int x = 2;
        int n = 5;

        System.out.println(printFib(x, n));
    }
}
