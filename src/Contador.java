import java.util.Random;
class Contador {
    int cantidad;
    Contador() {
        Random r = new Random();
        this.cantidad = r.nextInt(11) + 1;
    }
    void incrementar() {
        cantidad++;
    }
    void decrementar() {
        cantidad--;
    }
}