package practice.pokemonType;

public class Pokemon {
    private Type type1;
    private Type type2;

    public Pokemon() {
        this.type1 = Type.NO_TYPE;
        this.type2 = Type.NO_TYPE;
    }

    public Pokemon(Type type) {
        this.type1 = type;
        this.type2 = Type.NO_TYPE;
    }

    public Pokemon(Type type1, Type type2) {
        this.type1 = type1;
        this.type2 = type2;
    }

    public Pokemon(Type[] type) {
        this.type1 = type[0];
        if (type.length > 1) {
            this.type2 = type[1];
        } else {
            this.type2 = Type.NO_TYPE;
        }
    }

    public Type getType1() {
        return type1;
    }

    public Type getType2() {
        return type2;
    }

    public Type[] getTypes() {
        Type[] types = {type1, type2};
        return types;
    }

    public void setType1(Type type) {
        this.type1 = type;
    }

    public void setType2(Type type) {
        this.type2 = type;
    }

    public void setTypes(Type[] type) {
        this.type1 = type[0];
        if (type.length > 1) {
            this.type2 = type[1];
        }
    }
}
