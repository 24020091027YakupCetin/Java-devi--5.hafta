package GeometricObject;

public class GeometricObject {

    private String renk = "mavi";
    private boolean filled = false;

    // Parametresiz Kurucu Metot (Alt sınıfların türetilmesi için gerekli)
    public GeometricObject() {
    }

    // Parametreli Kurucu Metot
    public GeometricObject(String renk, boolean filled) {
        this.renk = renk;
        this.filled = filled;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Renk: " + renk + ", Dolu mu: " + filled;
    }
}