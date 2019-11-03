public class Prime {
    public static void main(String[] args) {

        System.out.println("Các số nguyên tố nhỏ hơn 100:");

        for (int i = 0; i < 100; i++) {
            if (checkprime(i) == true) {
                System.out.print(i + "\n");
            }
        }

    }

    private static boolean checkprime(int n) {
        if (n < 2) {
            return false;
        } else {
            int root = (int) Math.sqrt(n);

            for (int i = 2; i <= root; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

        }
        return true;
    }
}