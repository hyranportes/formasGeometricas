package formaGeometrica;

public class Quadrado implements FormaGeometrica {

    private float lado;

    public float calcularArea() {
        float area = lado * lado;
        return area;
    }

    public float calcularPerimetro() {
        float perimetro = lado * 4;
        return perimetro;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}

