package practice.pokemonType;

public class PokemonTest {
    public static void main(String[] args) {
        testTypeCheck1();
        testTypeCheck2();
        testTypeCheck3();
        testTypeCheck4();
    }

    public static void testTypeCheck1() {
        Pokemon pokemon = new Pokemon();
        pokemon.setType1(Type.GRASS);
        System.out.println(pokemon.getType1());
    }

    public static void testTypeCheck2() {
        Pokemon pokemon = new Pokemon(Type.GRASS);
        System.out.println(pokemon.getType1());
    }

    public static void testTypeCheck3() {
        Pokemon pokemon = new Pokemon(Type.GRASS, Type.FIRE);
        Type[] pokemonTypes = pokemon.getTypes();
        System.out.println(pokemonTypes[0] + ", " + pokemonTypes[1]);
        System.out.println(pokemon.getType1() + ", " + pokemon.getType2());
    }

    public static void testTypeCheck4() {
        Type[] types = {Type.GRASS, Type.FIRE};
        Pokemon pokemon = new Pokemon(types);
        Type[] pokemonTypes = pokemon.getTypes();
        System.out.println(pokemonTypes[0] + ", " + pokemonTypes[1]);
        System.out.println(pokemon.getType1() + ", " + pokemon.getType2());
    }

}
