package figuras;

public class Rectangulo {

    double base;
    double altura;

    Rectangulo(){         //constructor para que funcione en prueba.

    }

    Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    Rectangulo(double base){        //para hacer cuadrado
        this.base = base;
        this.altura = base;
    }

    Rectangulo(double base, double altura) throws Exception {        //aviso de dimensiones no validas
        if(base <= 0 || altura <= 0){
            throw new Exception("dimensiones no validas");
        }
        this.base = base;
        this.altura = altura;
    }

    double calcularArea(){
        return base*altura;
    }

    double calcularPerimetro(){
        return (base+altura)*2;
    }


}
