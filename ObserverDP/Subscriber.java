package javaapplication3.ObserverDP;

public class Subscriber {

    private String subscriberName;
    private Channel channel;

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public void update(){
        System.out.println("Hey " + subscriberName +
                ", new video uploaded on " +
                channel.getName() +
                " : " +
                channel.getVideoTitle());
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}