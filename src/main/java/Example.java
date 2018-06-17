import com.google.common.eventbus.EventBus;

public class Example {
    public static void main(String args[]){
        EventSubscriber subscriber = new EventSubscriber();
        EventBus eventBus = new EventBus();
        EventPoster poster = new EventPoster(eventBus);

        eventBus.register(subscriber);

        poster.listenForChangesAndSendEvents();
    }
}
