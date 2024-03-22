package prepare.java.advanced;

public class Singleton {
    public String str;

    private Singleton singleton;

    private Singleton(){
        if(singleton != null) {
            singleton = new Singleton();
        }
    }

    public static Singleton getSingleInstance() {
        return new Singleton();
    }
}
