package prepare.java.advanced;

public class SingletonSolution {
    public String str;

    private SingletonSolution singleton;

    private SingletonSolution(){
        if(singleton != null) {
            singleton = new SingletonSolution();
        }
    }

    public static SingletonSolution getSingleInstance() {
        return new SingletonSolution();
    }
}
