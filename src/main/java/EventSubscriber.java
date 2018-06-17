import com.google.common.eventbus.Subscribe;

public class EventSubscriber {
    private int numberOfEventsDetected = 0;

    public EventSubscriber(){}

    public static class Event {
        public void execute(EventSubscriber subscriber){ subscriber.addDetectedEvent();
        }
    }

    public void addDetectedEvent() {
        this.numberOfEventsDetected++;
        System.out.println("Number of commands detected: " + numberOfEventsDetected);
    }

    @Subscribe
    public void receiveEvent(Event c){
        c.execute(this);
    }
}
