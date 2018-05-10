package formaGeometrica;

public class Circulo implements FormaGeometrica {

    private float raio;

    public float calcularArea() {
        float area = (float)3.14 *(raio*raio); ;
        return area;
    }

    public float calcularPerimetro() {
        float perimetro = 2*(float)3.14*raio;
        return perimetro;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
