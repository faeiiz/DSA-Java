
import java.util.Scanner;

public class Queue {
    //this is stack

    public static void main(String[] args) {
        // List<Integer> Q = new ArrayList<>();
        int Q[] = new int[5];
        Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Enter value");
        //     int a = sc.nextInt();
        //     Q[i] = a;
        // }
        // for (int i = 0; i < Q.length; i++) {
        //     System.out.print(Q[i]);
        // }
        int counter = 0;

        while (true) {
            System.out.println("Enter Choice");
            System.out.println("1.Add to Queue");
            System.out.println("2.Pop from Queue");
            System.out.println("3.Exit");
            int c = sc.nextInt();
            switch (c) {
                case 1: {
                    if (counter == 0) {
                        System.out.println("Enter value");
                        int a = sc.nextInt();
                        Q[counter] = a;
                        counter++;
                    } else if (Q.length > counter) {
                        System.out.println("Enter value");
                        int a = sc.nextInt();
                        Q[counter] = a;
                        counter++;
                    } else if (counter > Q.length - 1) {
                        System.out.println("Queue is full");
                    }

                    // for printing
                    for (int i = 0; i < counter; i++) {
                        System.err.println(Q[i]);
                    }
                    break;
                }
                case 2: {
                    if (counter == 0) {
                        System.out.println("Queue is empty");
                    } else if (counter > 0 && counter < Q.length) {
                        counter--;
                    }
                    for (int i = 0; i < counter; i++) {
                        System.err.println(Q[i]);
                    }
                    break;
                }
                case 3: {
                    System.exit(0);
                }
            }
        }

    }
}
