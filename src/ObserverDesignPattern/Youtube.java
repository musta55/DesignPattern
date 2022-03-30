package ObserverDesignPattern;

public class Youtube {
    public static void main(String[] args) {
        Channel telusko =new Channel();

        Subscriber s1=new Subscriber("Musta");
        Subscriber s2=new Subscriber("sakib");
        Subscriber s3=new Subscriber("hasan");
        Subscriber s4=new Subscriber("rakib");
        Subscriber s5=new Subscriber("luke");


        telusko.subscribe(s1);
        telusko.subscribe(s2);
        telusko.subscribe(s3);
        telusko.subscribe(s4);
        telusko.subscribe(s5);

        telusko.unSubscribe(s3);

        s1.subscribeChannel(telusko);
        s2.subscribeChannel(telusko);
        s3.subscribeChannel(telusko);
        s4.subscribeChannel(telusko);
        s5.subscribeChannel(telusko);

        telusko.upload("How to learn programming ??");
    }

}
