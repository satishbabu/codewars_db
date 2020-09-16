public class EnglishBeggar {

    public static int[] beggars(int[] alms, int numberOfBeggars) {
        int[] results = new int[numberOfBeggars];
        for (int i = 0; i < numberOfBeggars; i++) {
            results[i] = beggarShare(alms, i, numberOfBeggars);
        }
        return results;
    }

    public static int beggarShare(int[] alms, int rollNumber, int numberOfBeggars) {
        int sum = 0;
        for (int i = rollNumber; i < alms.length; i+=numberOfBeggars) {
            sum += alms[i];
        }
        return sum;
    }
}
