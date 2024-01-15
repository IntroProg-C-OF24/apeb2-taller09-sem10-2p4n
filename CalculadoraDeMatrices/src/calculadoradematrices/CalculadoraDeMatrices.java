package calculadoradematrices;
public class CalculadoraDeMatrices {
    public static void main(String[] args) {
        int limF = 3, limC = 3;
        int matriz1[][] = new int [limF][limC];
        int matriz2[][] = new int [limF][limC];
        int matriz3[][] = new int [limF][limC];
        int matriz4[][] = new int [limF][limC];
        generarMatriz(matriz1, limF, limC);
        generarMatriz(matriz2, limF, limC);
        System.out.println("Matriz 1");
        System.out.println(devolverMatriz(matriz1, limF, limC));
        System.out.println("Matriz 2");
        System.out.println(devolverMatriz(matriz2, limF, limC));
        sumaMatrices(matriz1, matriz2, matriz3, limF, limC);
        System.out.println("Suma de matrices");
        System.out.println(devolverMatriz(matriz3, limF, limC));
        restaMatrices(matriz1, matriz2, matriz4, limF, limC);
        System.out.println("Resta de matrices");
        System.out.println(devolverMatriz(matriz4, limF, limC));
    }
    public static void generarMatriz(int matriz[][], int limF, int limC){
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                matriz[i][j] = (int)(Math.random()*(9-0+1)+0);
            }
        }
    }
    
    public static String devolverMatriz(int matriz[][], int limF, int limC){
        String cadena = "";
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                cadena += String.format("%d\t", matriz[i][j]); // "%d(char)9"
            }
            cadena += "\n";
        }
        return cadena;
    }
    public static void sumaMatrices (int matriz1[][], int matriz2[][],int matriz3[][], int limF, int limC){
           for (int i = 0; i < limF; i++) {
               for (int j = 0; j < limC; j++) {
                   matriz3[i][j] = matriz1[i][j]+ matriz2[i][j];
               }
        }
    }
        public static void restaMatrices (int matriz1[][], int matriz2[][],int matriz4[][], int limF, int limC){
           for (int i = 0; i < limF; i++) {
               for (int j = 0; j < limC; j++) {
                   matriz4[i][j] = matriz1[i][j] - matriz2[i][j];
               }
        }
    }
}
