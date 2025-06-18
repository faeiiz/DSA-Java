
public class shuffleArray {

    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7, 10, 20};
        int n = 4;

        int ans[] = new int[nums.length];

        int i = 0;
        int j = n;
        int k = 0;

        while (j < nums.length) {
            ans[k] = nums[i];
            i++;
            k++;

            ans[k] = nums[j];
            j++;
            k++;
        }
        for (int z = 0; z < ans.length; z++) {
            System.out.println(ans[z]);

        }
    }
}
