package javaapplication3.ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private String name;
    private String videoTitle;
    private List<Subscriber> subs;

    public Channel(String name) {
        this.name = name;
        this.subs = new ArrayList<>();
    }

    public void subscribe(Subscriber sub){
        subs.add(sub);
        sub.setChannel(this);
    }

    public void unsubscribe(Subscriber sub){
        subs.remove(sub);
    }

    public void notifySubscribers(){
        for(Subscriber sub : subs){
            sub.update();
        }
    }

    public void uploadVideo(String title){
        this.videoTitle = title;
        notifySubscribers();
    }

    public String getName() {
        return name;
    }

    public String getVideoTitle() {
        return videoTitle;
    }
}