class program4 {
    public static void main(String[] args) {
        String str = "SaaS";
        System.out.println(revreseString(str));
    }
    
    static String revreseString(String str) {
        
        String newStr = "";
        for (int j = str.length() - 1; j >= 0; j--) {
            newStr += str.charAt(j);
        }
        return newStr;
    }
}
