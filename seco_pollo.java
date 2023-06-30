public class seco_pollo extends Comida_tipica{
    private String ingrePrin;

    public seco_pollo(String nomplato, String ciuOrigen, double anioOrigen, String ingrePrin) {
        super(nomplato, ciuOrigen, anioOrigen);
        this.ingrePrin = ingrePrin;
    }

    public String getIngrePrin() {
        return ingrePrin;
    }

    public void setIngrePrin(String ingrePrin) {
        this.ingrePrin = ingrePrin;
    }
}
