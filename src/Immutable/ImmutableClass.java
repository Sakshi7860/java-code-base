package Immutable;

public final class ImmutableClass {
    private final int id;
    private final String name;

    ImmutableClass(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
