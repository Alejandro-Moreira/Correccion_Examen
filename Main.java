import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        try {
            ArrayList<seco_pollo>plato1= new ArrayList<seco_pollo>();
            ArrayList<bolon>plato2 = new ArrayList<bolon>();
            ArrayList<encocao>plato3 = new ArrayList<encocao>();


            plato1.add(new seco_pollo("Seco de Pollo","Quito" , 1980, "Pollo"));
            plato2.add(new bolon("Bolon", "Quito", 2000, "Chicharon",5));
            plato3.add(new encocao("Encocao", "Esmeraldas", 2001, "Verde",3,"Pinton"));


            System.out.println("\n\t ---DATOS SECO DE POLLO---");
            System.out.println("Nombre del Plato: "+ plato1.get(0).getNomplato());
            System.out.println("Ciudad Origen: "+ plato1.get(0).getCiuOrigen());
            System.out.println("Año origen: "+ plato1.get(0).getAnioOrigen());
            System.out.println("Ingrediente Principal: "+ plato1.get(0).getIngrePrin());



            System.out.println("\n\t ---DATOS BOLON---");
            System.out.println("Nombre del Plato: "+ plato2.get(0).getNomplato());
            System.out.println("Ciudad Origen: "+ plato2.get(0).getCiuOrigen());
            System.out.println("Año origen: "+ plato2.get(0).getAnioOrigen());
            System.out.println("Ingrediente Principal: "+ plato2.get(0).getIngrePrin());
            System.out.println("Numero Ingredientes: "+ plato2.get(0).getNumIngre());

            System.out.println("\n\t ---DATOS ENCOCAO---");
            System.out.println("Nombre del Plato: "+ plato3.get(0).getNomplato());
            System.out.println("Ciudad Origen: "+ plato3.get(0).getCiuOrigen());
            System.out.println("Año origen: "+ plato3.get(0).getAnioOrigen());
            System.out.println("Ingrediente Principal: "+ plato3.get(0).getIngrePrin());
            System.out.println("Numero Ingredientes: "+ plato3.get(0).getNumIngre());
            System.out.println("Tipo de Verde: "+ plato3.get(0).getTipoVerde());


        }catch (Exception ex){
            System.out.println("\n\t\tSe ha producido un error \n");
        }
    }
}