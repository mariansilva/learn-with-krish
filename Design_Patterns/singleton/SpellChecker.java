package singleton;

public class SpellChecker {
    private static SpellChecker instance;
    private SpellChecker(){

    }

    public static SpellChecker getInstance(){
        if(null == instance){
            instance = new SpellChecker();
            System.out.println("Object is created"+ "\n"+ instance.toString());
            System.out.println("..........");
        }
        return instance;
    }
    public void CheckObject(){
        System.out.println(" SpellChecker object"+ "\n"+ instance.toString());
        System.out.println("..........");
    }
    }

