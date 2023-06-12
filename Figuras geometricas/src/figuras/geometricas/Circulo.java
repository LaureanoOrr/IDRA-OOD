package figuras.geometricas;

public class Circulo extends Figuras2D {

    protected float radio;
    protected final float pi = 3.14f;

    protected float getRadio() {
        return this.radio;
    }

    protected void setRadio(float radio) {
        this.radio = radio;
    }

    @Override //OVERRIDE PARA UTILIZAR DE MANERA "DINAMICA" PARA CADA CLASE HIJA.
    public float calcularArea() {
        float area;
        area = pi * (radio * radio);
        return area;
    }

    @Override //OVERRIDE PARA UTILIZAR DE MANERA "DINAMICA" PARA CADA CLASE HIJA.
    public float calcularPerimetro() {
        float perimetro;
        perimetro = 2 * pi * radio;
        return perimetro;
    }

}
