package ObserverDesignPattern;

public class Youtube {
    public static void main(String[] args) {
        Channel natGeo =new Channel();

        Subscriber s1=new Subscriber("Musta");
        Subscriber s2=new Subscriber("sakib");
        Subscriber s3=new Subscriber("hasan");
        Subscriber s4=new Subscriber("rakib");
        Subscriber s5=new Subscriber("luke");


        natGeo.subscribe(s1);
        natGeo.subscribe(s2);
        natGeo.subscribe(s3);
        natGeo.subscribe(s4);
        natGeo.subscribe(s5);

        natGeo.unSubscribe(s3);

        s1.subscribeChannel(natGeo);
        s2.subscribeChannel(natGeo);
        s3.subscribeChannel(natGeo);
        s4.subscribeChannel(natGeo);
        s5.subscribeChannel(natGeo);

        natGeo.upload("Man vs wild new episode");
    }

}
