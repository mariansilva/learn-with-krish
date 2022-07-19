package singleton;

public class Test {
    public static void main(String args[]){
        SpellChecker.getInstance().CheckObject();
        SpellChecker.getInstance().CheckObject();
        SpellChecker.getInstance().CheckObject();
    }
}
