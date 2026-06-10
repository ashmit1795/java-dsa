class program3 {
    public static void main(String[] args) {
        String s1 = "Ashmit";
        String s2 = "Ashmit";
        System.out.println(s1 == s2); // true
        String s3 = new String("Ashmit");
        System.out.println(s1 == s3); // false
        System.out.println(s2 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s2.equals(s3)); // true
        System.out.println(equals(s1, s2)); // true
        System.out.println(equals(s1, s3)); // true
        String s4 = "Ashmita";
        System.out.println(equals(s1, s4)); // false
        String s5 = "Ashmti";
        System.out.println(equals(s1, s5)); // false
    }
    
    static boolean equals(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }
}
