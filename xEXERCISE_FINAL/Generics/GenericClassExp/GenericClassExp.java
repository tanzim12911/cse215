package xEXERCISE_FINAL.Generics.GenericClassExp;

public class GenericClassExp<T> {
    private T name;
    private T id;

    GenericClassExp() {

    }
    GenericClassExp(T name, T id) {
        this.name = name;
        this.id = id;
    }

    public <T> T getName() {
        return (T) name;
    }
}
