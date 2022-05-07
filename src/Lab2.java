public class Lab2 {
    String evenOrOdd(int x) {
        if (x % 2 == 0) {
            return "Even";
        }
        else {
            return "Odd";
        }
    }

    String maxmin(int[] a) {
        int max = 0;
        int min = a[0];
        for(int i = 0; i<a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        return max + " and " + min;
    }
}
