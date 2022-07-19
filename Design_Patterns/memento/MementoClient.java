package memento;

public class MementoClient {
    public static void main(String args[]){
        Originator originator = new Originator();
        originator.setLedTV(new LedTV("40 inch",60000,false ));

        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(originator.createMemento());

        originator.setLedTV(new LedTV("46 inch",80000,true));
        caretaker.addMemento(originator.createMemento());

        originator.setLedTV(new LedTV("50 inch",100000,true));
        System.out.println("\n Originator current state : "+ originator);

        System.out.println("\n Originator restoring to 42 inches LEDTV: ");

        originator.setMemento(caretaker.getMemento(0));

        System.out.println("\n Originator current state : "+ originator);

    }
}
