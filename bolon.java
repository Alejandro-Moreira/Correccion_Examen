public class bolon extends seco_pollo{
    private double numIngre;

    public bolon(String nomplato, String ciuOrigen, double anioOrigen, String ingrePrin, double numIngre) {
        super(nomplato, ciuOrigen, anioOrigen, ingrePrin);
        this.numIngre = numIngre;
    }

    public double getNumIngre() {
        return numIngre;
    }

    public void setNumIngre(double numIngre) {
        this.numIngre = numIngre;
    }
}
