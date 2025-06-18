
public class Patterns {

    public static void main(String[] args) {

//1.Solid Rectangle
// *****
// *****
// *****
// *****
        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
//2.Hollow Rectangle
// ******
// *    *
// *    *
// *    *
// ******
        // int n = 4;
        // int m = 5;
        // for (int i = 0; i <= n; i++) {
        //     for (int j = 0; j <= m; j++) {
        //         if (i == 0 || j == 0 || i == n || j == m) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
//3.Half Pyramid
// *
// **
// ***
// ****
// *****
        // for (int i = 0; i <= 4; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
//4.Inverted half pyramid
// *****
// ****
// ***
// **
// *
        // for (int i = 4; i >= 0; i--) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
//5.Inverted half pyramid 180
//     *
//    **
//   ***
//  ****
// *****
        // for (int i = 4; i >= 0; i--) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 4; j >= i; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
//6.number of pyramid
// 0
// 01
// 012
// 0123
// 01234
        // for (int i = 0; i <= 4; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
//7.inverted half pyramid number 
// 01234
// 0123
// 012
// 01
// 0
        // for (int i = 4; i >= 0; i--) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
//8.Floyd triangle
// 0 
// 1 2
// 3 4 5
// 6 7 8 9
// 10 11 12 13 14
// 15 16 17 18 19 20
        // int c = 0;
        // for (int i = 0; i < 6; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(c + " ");
        //         c++;
        //     }
        //     System.out.println();
        // }
// 9.Triangle
// 0
// 10
// 010
// 1010
// 01010
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         if (i % 2 == 1) {
        //             if (j % 2 == 1) {
        //                 System.out.print("0");
        //             } else {
        //                 System.out.print("1");
        //             }
        //         } else {
        //             if (j % 2 == 1) {
        //                 System.out.print("1");
        //             } else {
        //                 System.out.print("0");
        //             }
        //         }
        //     }
        //     System.out.println();
        // }
//ADVANCED PATTERNS
// 10.Buttefly Pattern
    }
}
