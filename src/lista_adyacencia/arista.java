package lista_adyacencia;

public class arista {
    private char dest;
    private int peso;

    public arista(char dest, int peso) {
        this.dest = dest;
        this.peso = peso;
    }

    public char getDest() {
        return dest;
    }

    public void setDest(char dest) {
        this.dest = dest;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
