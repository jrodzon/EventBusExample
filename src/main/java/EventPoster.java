import com.google.common.eventbus.EventBus;

import java.util.Scanner;

public class EventPoster {
    private EventBus eventBus;

    public EventPoster(EventBus eventBus){
        this.eventBus = eventBus;
    }

    public void listenForChangesAndSendEvents(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("For quit press q:");
            String line = input.next();
            if(line.equals("q")){
                return;
            }
            else{
                sendEvent();
            }
        }
    }

    private void sendEvent(){
        EventSubscriber.Event command = new EventSubscriber.Event();
        eventBus.post(command);
    }

}
