public class Calculadora {

    public final static double PI = 3.14;

    public static double circunferencia(double raio){
        return 2 * PI * raio;
    }

    public static double volume(double raio){
        return (4 * PI * Math.pow(raio,3))/3;
    }

}
