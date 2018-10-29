public class z_function {

    public static int[] z_trivial(String s) {

        int n = (int) s.length();
        int[] z = new int[n];

        for (int i=1; i<n; ++i)

            while (i + z[i] < n && s.substring(s.indexOf(z[i])).equals(s.substring(s.indexOf(i + z[i]))))
                ++z[i];

        return z;
    }
}
