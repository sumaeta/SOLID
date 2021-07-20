package LSP.problem;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Quadrado();

        retangulo.setLargura(10);
        retangulo.setAltura(5);

        System.out.println("Area: " + retangulo.getArea());

    }

}
