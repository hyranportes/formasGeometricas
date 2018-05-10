package formaGeometrica;

public class Quadrado implements FormaGeometrica {

    private float lado;
    private float base;
    private float altura;

    public float calcularArea() {
        float area = base*altura;
        return area;
    }

    public float calcularPerimetro() {
        float perimetro = lado*4;
        return perimetro;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
