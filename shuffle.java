
import java.util.HashMap;

class shuffle {

    public static void main(String[] args) {
//Sum of SubArrray == k
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        String f = "Fa.iz";
        f.toLowerCase();
        System.out.println(f);
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);

        int ans = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (hm.containsKey(sum - k)) {
                ans += hm.get(sum - k);
            }

            if (hm.containsKey(sum)) {
                hm.put(sum, hm.get(sum) + 1);
            } else {
                hm.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}
