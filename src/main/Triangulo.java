package main;

public class Triangulo {
    private int a;
    private int b;
    private int c;

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean ehValido() {
        boolean ladoA = a + b > c;
        boolean ladoB = a + c > b;
        boolean ladoC = b + c > a;

        return ladoA && ladoB && ladoC;
    }

    public TipoTriangulo tipo() {
        TipoTriangulo resultado;

        if (a == b && b == c) {
            resultado = TipoTriangulo.EQUILATERO;
        } else if (a == b || a == c || b == c) {
            resultado = TipoTriangulo.ISOCELES;
        } else {
            resultado = TipoTriangulo.ESCALENO;
        }

        return resultado;
    }


}
