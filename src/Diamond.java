public class Diamond {

    public static String print(int n) {
        if (n <= 0 || (n % 2 == 0))
            return null;       // negative or even

        return top(n) + bottom(n);
    }

    public static String line(int m, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(' ');
        }
        for (int i = 0; i < n; i++) {
            sb.append('*');
        }
        return sb.toString();
    }

    public static String top(int lineCount) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= lineCount; i += 2) {
            sb.append(line((lineCount - i) / 2, i)).append('\n');
        }
        return sb.toString();
    }

    public static String bottom(int lineCount) {
        StringBuilder sb = new StringBuilder();
        for (int i = lineCount - 2; i >= 1; i -= 2) {
            sb.append(line((lineCount - i) / 2, i)).append('\n');
        }
        return sb.toString();
    }

}
