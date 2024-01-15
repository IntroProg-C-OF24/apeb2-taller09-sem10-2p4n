package sumarestamultdiv;
public class SumaRestaMultDiv {
    public static void main(String[] args) {
        int num1 = 2, num2 = 2, result1, result2, result3, result4;
        result1 = suma(num1, num2);
        result2 = resta(num1, num2);
        result3 = mult(num1, num2);
        result4 = div(num1, num2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
    public static int suma(int num1, int num2){
        return num1 + num2;
    }
    public static int resta(int num1, int num2){
    return num1 - num2;
    }
    public static int mult(int num1, int num2){
    return num1 * num2;
    }
    public static int div(int num1, int num2){
    return num1 / num2;
    }
}
