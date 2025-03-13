package Excepciones.Ej6;

public class Main {
    public static void main(String[] args) {
        try {
            Gato g1 = new Gato("Blanca",4);
            g1.imprime();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            Gato g2 = new Gato("Paula",-2);
            g2.imprime();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            Gato g3 = new Gato("Pa",2);
            g3.imprime();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
