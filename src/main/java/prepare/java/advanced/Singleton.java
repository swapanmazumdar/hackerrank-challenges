package prepare.java.advanced;

public class SingletonPattern {
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
