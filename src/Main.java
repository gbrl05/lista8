public class Main{
    public static void main(String[] args) {
        int limite = 100;

        for (int i = 2; i <= limite; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        if (numero <= 3) {
            return true;
        }

        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }

        return true;


        // usei chat gpt nessa //
    }
}
