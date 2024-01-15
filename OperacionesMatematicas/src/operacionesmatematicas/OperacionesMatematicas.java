public class OperacionesMatematicas {
    public static void main(String[] args) {
        dibujarCorazon(15);
    }

    public static void dibujarCorazon(int tamaño) {
        for (int i = tamaño / 2; i <= tamaño; i += 2) {
            for (int j = 1; j < tamaño - i; j += 2) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("^");
            }

            for (int j = 1; j <= tamaño - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i + 1; j++) {
                System.out.print("^");
            }

            System.out.println();
        }

        for (int i = tamaño; i >= 0; i--) {
            for (int j = i; j < tamaño; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("^");
            }

            System.out.println();
        }
    }
}
