package memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> ledTVList = new ArrayList<>();
    public void addMemento(Memento m){
        ledTVList.add(m);
        System.out.println("LEDTV :" + ledTVList);
    }
    public Memento getMemento(int index){
        return ledTVList.get(index);
    }
}

