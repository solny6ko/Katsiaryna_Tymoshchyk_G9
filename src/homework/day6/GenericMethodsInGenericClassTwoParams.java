package homework.day6;

public class GenericMethodsInGenericClassTwoParams<X, Y> {
    private X a;
    private Y b;

    public String genericMethodGenArgs(X a, Y b) {
        this.a = a;
        this.b = b;
        System.out.printf("I received 2 arguments of type: %s class, %s clas", a.getClass().getSimpleName(), b.getClass().getSimpleName()).println();
        return "I received 2 arguments of type: " + a.getClass().getSimpleName() + " class, " + b.getClass().getSimpleName() + " clas";
    }

    public String genericMethodGenArgs(X a) {
        this.a = a;
        System.out.printf("I received 1 argument of type: %s class", a.getClass().getSimpleName()).println();
        return "I received 1 argument of type: " + a.getClass().getSimpleName() + " clas";

    }

    public void genericMethodHalfGenArgs(X a, Y b, String e) {
        this.a = a;
        this.b = b;
        System.out.printf("I got an object of %s class and %s class and string with %s characters", a.getClass().getSimpleName(), b.getClass().getSimpleName(), e.length()).println();

    }

    public void genericMethodHalfGenArgs(X a, String e) {
        this.a = a;
        System.out.printf("I got an object of %s class and string with %s characters", a.getClass().getSimpleName(), e.length()).println();

    }


}
