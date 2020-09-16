public class IntString {
    public static void main(String[] args) {
        int n = 2345;

        while (n > 9) {
//            System.out.println(n % 10);
            n /= 10;
        }

        System.out.println(n);




//        String s10 = Integer.toString(10);
//        System.out.println(s10);
//
//        int value = Integer.parseInt("124");
//        System.out.println(value);
//
//        String s = "Satish Babu has a dog";
//        String[] words = s.split("\\s");
//        for (String word : words) {
//            System.out.println(word);
//        }
    }
}
