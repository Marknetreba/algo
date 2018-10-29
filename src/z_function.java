public class z_function {

    public static void main(String[] args) {
       int[] ar = z_trivial("aaa");
       for (int i: ar) {
           System.out.println(i);
       }
    }

    public static int[] z_trivial(String s) {

        int n = s.length();
        int[] z = new int[n];
        int R = 0;
        int L = 0;

        for(int i = 1; i < n; i++) {
            z[i] = 0;
            if (R > i) {
                z[i] = Math.min(R - i, z[i - L]);
            }
            while (i + z[i] < n && s.charAt(i+z[i]) == s.charAt(z[i])) {
                z[i]++;
            }
            if (i + z[i] > R) {
                L = i;
                R = i + z[i];
            }
        }

        z[0] = n;

        return z;
    }
}
