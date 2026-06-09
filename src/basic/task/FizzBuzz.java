public class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Unindra ");
            } else if (i % 3 == 0) {
                System.out.print("Tiga ");
            } else if (i % 5 == 0) {
                System.out.print("Lima ");
            } else {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 100);
    }
}
