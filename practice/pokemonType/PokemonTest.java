package practice.pokemonType;

public class PokemonTest {
    public static void main(String[] args) {
        testTypeCheck1();
        testGetType1();
        testTypeCheck3();
        testTypeCheck4();
    }

    public static void testTypeCheck1() {
        Pokemon pokemon = new Pokemon();
        pokemon.setType1(Type.GRASS);
        System.out.println(pokemon.getType1());
    }

    public static void testGetType1() {
        Pokemon pokemon = new Pokemon(Type.GRASS);

        Type result = pokemon.getType1();
        if(result != null) {
            if (result == Type.GRASS) {
                System.out.println("testTypeCheck2: Success");
            } else {
                System.out.println("testTypeCheck2: Failed");
            }
        } else {
            System.out.println("testTypeCheck2: Failed.");
        }
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
