package figuras;

public class Rectangulo {

    public double base;
    public double altura;

    public Rectangulo(){         //constructor para que funcione en prueba.

    }

    Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double base){        //para hacer cuadrado
        this.base = base;
        this.altura = base;
    }

    public double calcularArea(){
        return base*altura;
    }

    public double calcularPerimetro(){
        return (base+altura)*2;
    }


}
