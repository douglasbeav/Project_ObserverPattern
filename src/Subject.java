import java.util.*;

public class Subject {

    private ArrayList<Observer> observers;

    public Subject() {
        observers = new ArrayList<Observer>();
    }

    public void attach(Observer o) {
        if (!observers.contains(o)) observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyObs() {
        Iterator i = observers.iterator();
        while (i.hasNext()) {
            Observer o = (Observer) i.next();
            o.update(this);
        }
    }


}