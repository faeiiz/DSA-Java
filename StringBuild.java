
import java.util.Scanner;

public class StringBuild {

    public static void main(String[] args) {
        int n = 5;//0101
        int pos = 2;
        int bitMask = 1 << pos; //0100
        int notbitmask = ~(bitMask);//1011

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        if (oper == 1) {
            int newnumber = bitMask | n;
            System.out.println(newnumber);
        } else {
            int newnumber = notbitmask & n;
            System.out.println(newnumber);
        }

    }
}
