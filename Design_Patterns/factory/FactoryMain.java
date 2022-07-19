package factory;

import factory.phone.Android;
import factory.phone.OS;
import factory.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String args[]){
        OperatingSystemFactory o = new OperatingSystemFactory();
        OS obj= o.getInstance("Android");
        obj.specification();
    }
}
