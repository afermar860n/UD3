package EjercicioDni;
import java.util.Scanner;

public class PrincipalPersona {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca nombre: ");
        String nombre = s.nextLine();

        System.out.println("Introduzca edad: ");
        int edad = s.nextInt();

        System.out.println("Introduze sexo(H/M): ");
        char sexo = s.next().charAt(0);

        System.out.println("Introduzca peso(kg): ");
        double peso = s.nextDouble();

        System.out.println("Introduzca altura: ");
        double altura = s.nextDouble();

        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);

        Persona p2 = new Persona ("Luis Garcia", 17, 'H');

        Persona p3 = new Persona();
        p3.setNombre("Antonio Molina");
        p3.setSexo('H');
        p3.setEdad(55);
        p3.setAltura(1.80);
        p3.setPeso(135.0);

        p1.generarDNI();
        p2.generarDNI();
        p3.generarDNI();

        System.out.println(p1.comprobarSexo('H'));
        System.out.println(p2.comprobarSexo('H'));
        System.out.println(p3.comprobarSexo('M'));

        comprobarIMC(p1);
        comprobarIMC(p2);
        comprobarIMC(p3);

        private void comprobarIMC(Persona persona){
            int imc = persona.calcularIMC();
            if(imc == 0){
                System.out.println();
            }else if(imc == )

        }



    }
}
