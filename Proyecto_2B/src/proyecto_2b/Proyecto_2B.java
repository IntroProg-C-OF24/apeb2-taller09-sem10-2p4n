package proyecto_2b;
public class Proyecto_2B {
    public static void main(String[] args) {
        int limPostulantes = 3000, limDatos = 2;
        String matrizDatoPostulantes[][] = new String[limPostulantes][limDatos];
        generarNombPostulantes(matrizDatoPostulantes);
        generarCarrPostulantes(matrizDatoPostulantes);
        presentarData(matrizDatoPostulantes);
    }
    public static void generarNombPostulantes(String matrizDatoPostulantes[][]){
        String nomPostulantes[]={"Maria","Juan","Pedro","Dario"};
        String apePostulantes[]={"Carrion","Paz","Vazquez","Ruiz"};
        for (int i = 0; i < matrizDatoPostulantes.length; i++) {
            int indAleat_Nom = (int)(Math.random()*((nomPostulantes.length-1)-0+1)+0);
            int indAleat_Ape = (int)(Math.random()*((apePostulantes.length-1)-0+1)+0);
            matrizDatoPostulantes[i][0] = nomPostulantes[indAleat_Nom] + " " + apePostulantes[indAleat_Ape];
        }
    }
    public static void generarCarrPostulantes(String matrizDatoPostulantes[][]){
        String nomCarrera[]={"Quimica","Fisio","Medicina"};
        for (int i = 0; i < matrizDatoPostulantes.length; i++) {
            int indAleat_Carr = (int)(Math.random()*((nomCarrera.length-1)-0+1)+0);
            matrizDatoPostulantes[i][1] = nomCarrera[indAleat_Carr];
        }
    }
    public static void presentarData(String matrizDatoPostulantes[][]){
        System.out.println("NOMBRES\t\t|  CARRERAS");
        for (int i = 0; i < matrizDatoPostulantes.length; i++) 
            System.out.printf("%s\t|  %s\n",matrizDatoPostulantes[i][0],matrizDatoPostulantes[i][1]);
    }
}