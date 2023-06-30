public class Comida_tipica {
    private String ingredientes;
    private String timepo_coccion;
//Constructor
    public Comida_tipica(String ingredientes, String timepo_coccion) {
        this.ingredientes = ingredientes;
        this.timepo_coccion = timepo_coccion;
    }
    public Comida_tipica(){
    }
//Stter and getter
    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getTimepo_coccion() {
        return timepo_coccion;
    }

    public void setTimepo_coccion(String timepo_coccion) {
        this.timepo_coccion = timepo_coccion;
    }
    //metodos
    public void preparacion() {
        System.out.println("Este es el metodo preparacion que pertenece a Comida tipica");
    }
}