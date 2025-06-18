
public class waterBottles {

    public static void main(String[] args) {
        int fullbottles = 9;
        int exch = 3;
        int emptybottles = 0;
        int drank = 0;

        while (fullbottles != 0) {
            if (fullbottles > 0) {
                emptybottles = fullbottles;
                drank += fullbottles;
                fullbottles = 0;
                if (emptybottles >= 3) {
                    fullbottles = emptybottles / exch;
                    emptybottles = 0;
                }
            }

        }
        System.out.println(fullbottles);
        System.out.println(emptybottles);
        System.out.println(drank);
    }
}

//Tic Tac Toe 1275
// class shuffle {
//     public static void main(String[] args) {
//         int[][] tic = new int[3][3];
//         // X==1
//         // O==o
//         //A plays first
//         int[][] moves = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
//         for (int i = 0; i < moves.length; i++) {
//             if (i % 2 == 0) {
//                 tic[moves[i][0]][moves[i][1]] = 1;
//             }
//             if (i % 2 == 1) {
//                 tic[moves[i][0]][moves[i][1]] = 0;
//             }
//             // System.out.println();
//         }
//         for (int i = 0; i < tic.length; i++) {
//             for (int j = 0; j < tic[0].length; j++) {
//                 System.out.print(tic[i][j]);
//             }
//             System.out.println();
//         }
//         // [[0,0],[2,0],[1,1],[2,1],[2,2]]
//     }
// }

