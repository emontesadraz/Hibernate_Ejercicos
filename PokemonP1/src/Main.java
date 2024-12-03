import hibernate.PokedexServices;

public class Main {
    public static void main(String[] args) {
        PokedexServices pokedexServices = new PokedexServices();
/*
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Charmander", 8.5, "Lagartija de fuego"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Bulbasaur", 6.9, "Rana planta"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Squirtle", 9.0, "Tortuga de agua"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Jigglypuff", 5.5, "Bola de algodón"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Meowth", 4.2, "Gato de la fortuna"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Psyduck", 7.3, "Pato psíquico"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Snorlax", 460.0, "Duerme mucho"));
        pokedexServices.crearPokemonEnPokedex(new Pokedex("Mewtwo", 122.0, "Clon de Mew"));


 */
        pokedexServices.listarPokemon();

        pokedexServices.eliminarPokemon(1);
        pokedexServices.eliminarPokemon(2);
        pokedexServices.eliminarPokemon(3);
        pokedexServices.eliminarPokemon(4);
        pokedexServices.eliminarPokemon(5);
        pokedexServices.eliminarPokemon(6);
        pokedexServices.eliminarPokemon(7);
        pokedexServices.eliminarPokemon(8);
        pokedexServices.eliminarPokemon(9);
        pokedexServices.eliminarPokemon(10);

        pokedexServices.borrarTabla();

    }
}