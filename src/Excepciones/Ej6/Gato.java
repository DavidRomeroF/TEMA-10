package Excepciones.Ej6;

public class Gato {
    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {
        this.nombre = validarNombre(nombre);
        this.edad = validarEdad(edad);
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) throws Exception{
        this.nombre = validarNombre(nombre);
    }

    public void setEdad(int edad) throws Exception{
        this.edad = validarEdad(edad);
    }

    public void imprime() {
        System.out.printf("%s tiene %d años\n",getNombre(),getEdad());
    }

    public static String validarNombre(String nombre) throws Exception{
        if (nombre.length()<3)
            throw new Exception("ERROR. Nombre debe tener al menos 3 caracteres");
        else
            return nombre;
    }
    public static int validarEdad(int edad) throws Exception{
        if (edad<1)
            throw new Exception("ERROR. La edad debe de ser positiva");
        else
            return edad;
    }
}
