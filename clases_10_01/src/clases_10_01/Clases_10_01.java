package clases_10_01;
public class Clases_10_01 {
    static int rspt;
    public static void main(String[] args) {
        int num1 = 4, num2 = 6;
        int respuestas[] = new int [1];
        System.out.println("La suma es igual a: " + funcionSumar(num1, num2));
        metodoRestar(num1, num2, respuestas);
        System.out.println("la resta es igual a: " + respuestas[0]);
        System.out.println("Num1 " + num1 + " Num2 " + num2 + " Respuesta[0] " + respuestas[0]);
    }
    public static int funcionSumar(int num1, int num2){
        return num1 + num2;
    }
    public static void metodoRestar(int num1, int num2, int respuestas[]){
        num1 = 6;
        respuestas[0] =+ num1 - num2;
        num2 = -12;
    }
}
