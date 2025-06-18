
import java.util.HashMap;

public class ImplementationOfHashMap {

    public static void main(String[] args) {
        HashMap< Integer, Integer> h = new HashMap<>();
        int[] nums = {2, 0, 2, 1, 1, 0};
        h.put(0, 0);
        h.put(1, 0);
        h.put(2, 0);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                h.put(0, h.get(0) + 1);
            } else if (nums[i] == 1) {
                h.put(1, h.get(1) + 1);
            } else {
                h.put(2, h.get(2) + 1);
            }
        }

        for System.out.println(h);
    }
}
