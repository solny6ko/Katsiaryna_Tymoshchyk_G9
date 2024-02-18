package homework.day6;

public class GenericMethodsInGenericClassT<T> {
    private T a;
    private T b;
    private T c;


    public void genericMethodOneGenArgT(T a) {
        this.a = a;
        System.out.printf("I am an object of %s class", a.getClass().getSimpleName()).println();

    }

    public String genericMethodTwoGenArgs(T b, T c) {
        this.b = b;
        this.c = c;
        System.out.printf("We are objects of %s class and %s class", b.getClass().getSimpleName(), c.getClass().getSimpleName()).println();
        return "We are objects of " + b.getClass().getSimpleName() + "class and " + c.getClass().getSimpleName() + "class";
    }

    public void genericMethodHalfGenArgs(T a, String e) {
        this.a = a;
        System.out.printf("I got an object of %s class and string with %s characters", a.getClass().getSimpleName(), e.length()).println();

    }

}
