class program2 {
    public static void main(String[] args) {
        String str = "Ashmit";
        /*
            A   S   H   M   I   T
            0   1   2   3   4   5
        */
        printSubstring(str);
    }

    public static void printSubstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j =  i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j) + " ");
            }
        }
    }
}
