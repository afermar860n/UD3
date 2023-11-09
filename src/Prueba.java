public class Prueba {
    public static void main(String[] args) throws Exception{

        Rectangulo r = new Rectangulo();
        r.base = 10;
        r.altura = 5;


        System.out.println(r);
        System.out.println("El rectángulo tiene: " +
                "base = " + r.base + " y altura = " + r.altura);

        System.out.println("El area es: " + r.calcularArea());
        System.out.println("El perimetro es: " + r.calcularPerimetro());

        Rectangulo r1 = new Rectangulo(8);

        System.out.println("El area es: " + r1.calcularArea());
        System.out.println("El perimetro es: " + r1.calcularPerimetro());

        Persona p = new Persona();
        p.nombre = "Antonio";
        p.apellidos = "Fernández";
        p.dni = "26555560N";

        p.imprimirDatos();

        Contacto c = new Contacto();

        c.nombre = "Antonio Fernandez";
        c.telefono = "677563456";


        System.out.println(c.toString());



    }

}
