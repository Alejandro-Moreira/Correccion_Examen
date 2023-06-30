public class encocao extends bolon{
    private String tipoVerde;

    public encocao(String nomplato, String ciuOrigen, double anioOrigen, String ingrePrin, double numIngre, String tipoVerde) {
        super(nomplato, ciuOrigen, anioOrigen, ingrePrin, numIngre);
        this.tipoVerde = tipoVerde;
    }

    public String getTipoVerde() {
        return tipoVerde;
    }

    public void setTipoVerde(String tipoVerde) {
        this.tipoVerde = tipoVerde;
    }
}
