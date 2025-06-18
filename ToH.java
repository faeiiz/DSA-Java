
public class ToH {

    public static void hanoi(int n, String s, String h, String d) {

        if (n == 1) {
            System.out.println("Transer Disk number : " + n + " From " + s + " to " + d);
            return;
        }
        hanoi(n - 1, s, d, h);
        System.out.println("Transer Disk number : " + n + " From " + s + " to " + d);
        hanoi(n - 1, h, s, d);

    }

    public static void main(String[] args) {
        int n = 4;
        hanoi(n, "STower", "HTower", "DTower");
    }
}
