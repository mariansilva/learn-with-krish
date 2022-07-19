package factory.phone;

public class OperatingSystemFactory {
    public OS getInstance(String s){
        if(s.equals("Android"))
            return new Android();
        else if(s.equals("IOS"))
            return new IOS();
        else
            return new Windows();
    }
}
