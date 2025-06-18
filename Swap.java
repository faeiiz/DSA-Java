
// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
// import java.util.Scanner;

class Swap {

    public static void main(String[] args) {

        //     Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        // System.out.println("Enter username");
        // String userName = myObj.nextLine();  // Read user input
        // System.out.println("Username is: " + userName);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Number A:");
        // int a = sc.nextInt();
        // System.out.println("Enter Number B:");
        // int b = sc.nextInt();
        // System.out.println("Value of Number A is " + a + " and Number B is " + b);
        // // Swap only if a is bigger than b
        // if (a < b) {
        //     System.out.println("Valid");
        // } else {
        //     System.out.println("Invalid");
        //     // Swap without temp Var
        //     // a = a + b;
        //     // b = a - b;
        //     // a = a - b;
        //     // Swap with Temp
        //     int temp;
        //     temp = a;
        //     a = b;
        //     b = temp;
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {4, 5, 6};
        // int[] arr4 = new int[6];

        List<Integer> NewList = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            NewList.add(arr2[i]);
            NewList.add(arr3[i]);
        }
        System.out.println(NewList);

        // System.out.println("Value of Number A is " + a + " and Number B is " + b);
    }

}
// }
