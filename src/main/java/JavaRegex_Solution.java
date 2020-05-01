public class JavaRegex_Solution {

    public static void main(String[] args) {
        System.out.println("000.12.12.034".matches(new MyRegex().pattern));
        System.out.println("121.234.12.12".matches(new MyRegex().pattern));
        System.out.println("23.45.12.56".matches(new MyRegex().pattern));
        System.out.println("000.12.234.23.23".matches(new MyRegex().pattern));
        System.out.println("666.666.23.23".matches(new MyRegex().pattern));
        System.out.println(".213.123.23.32".matches(new MyRegex().pattern));
        System.out.println("23.45.22.32.".matches(new MyRegex().pattern));
        System.out.println("I.Am.not.an.ip".matches(new MyRegex().pattern));
    }
}

class MyRegex {
    String pattern = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

    MyRegex() {
        pattern = "(" + pattern + "\\.){3}" + pattern;
    }
}