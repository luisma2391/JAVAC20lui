package b6;

public class Circulo implements Forma  {
    private double radio:

    Circulo(double radio){
        this.radio=radio;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public void mostrar() {
        System.out.println("El radio es"+radio);

    }
}
