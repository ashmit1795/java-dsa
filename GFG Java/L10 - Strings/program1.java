public class program1 {
    public static void main(String[] args) {
        String x = "He is good boy and she is a good girl.";
        System.out.println(x.charAt(0));
        System.out.println(x.length());
        System.out.println(x.indexOf("a"));
        System.out.println(x.lastIndexOf("a"));
        System.out.println(x.toLowerCase());
        System.out.println(x.toUpperCase());
        System.out.println(x.contains("good")); // boolean
        // Comparison is done lexicographically.
        System.out.println("raghav".compareTo("preet")); // 2
        System.out.println("harmeet".compareTo("harsh")); // -6
        System.out.println(myCompareTo("harmeet", "harsh")); // -6
        
    }

    public static int myCompareTo(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        int minLength = Math.min(n1, n2);

        for (int i = 0; i < minLength; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                return c1 - c2;
            }
        }

        return n1 - n2;
    }
}
