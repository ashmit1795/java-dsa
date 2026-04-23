/*
HW: Print this series - 99, 95, 91, 87 ... upto all terms which are positive
*/

class program1 {

    public static void main(String[] args) {
        for (int i = 99; i > 0; i -= 4) {
            System.out.print(i + " ");
        }
    }
}