import hibernate.Adestrador;
import hibernate.Pokedex;
import hibernate.toXML.PasarAXML;
import services.AdestradorServices;
import services.PokedexServices;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PokedexServices pokedexServices = new PokedexServices();
        AdestradorServices adestradorServices = new AdestradorServices();
        PasarAXML xml = new PasarAXML();

        /*
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Torchic",0.4 ,"Pollo de fuego"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Combusken",0.9 ,"Gallina de fuego"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Blaziken",1.9 ,"Gallo de fuego"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Mudkip",0.4 ,"Salamandra de agua"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Marshtomp",0.7 ,"Salamandra de agua"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Swampert",1.5 ,"Salamandra de agua"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Treecko",0.5 ,"Lagarto de planta"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Grovyle",0.9 ,"Lagarto de planta"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Sceptile",1.7 ,"Lagarto de planta"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Lucario",1.2 ,"Perro luchador"));
        */

        adestradorServices.crearAdestrador(new Adestrador("Ash Ketchum", new Date(1996, 9, 1)));
        adestradorServices.crearAdestrador(new Adestrador("Misty", new Date(1996,9,1)));

        pokedexServices.modificarPokemonEnPokedex(1, "pikachu");
        adestradorServices.modificarAdestrador(1, "Brock", new Date(1996,9,2));

        pokedexServices.listarPokedex();
        adestradorServices.listarAdestrador();

        xml.leerDatosAdestrador(adestradorServices.listarAdestrador());
        xml.leerDatosPokedex(pokedexServices.listarPokedex());

        pokedexServices.borrarTablaPokedex();
        adestradorServices.eliminarTablaAdestrador();

        }
}