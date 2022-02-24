


public class NearestNumberV4 {
    public static Integer nearest(int x, int ... arr) {
        Integer min = null;
        Integer nearest = null;
        for (int i = 0, n = arr.length; i < n; i++) {
            int diff = Math.abs(arr[i] - x);
            if (min == null || diff < min) {
                min = diff;
                nearest = arr[i];
                if (diff == 0) {
                    break;
                }
            }
        }
        return nearest;
    }
}
