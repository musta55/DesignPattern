public class OperatingSystemFactory {
    public OS getInstance (String str){
    if(str.equals("Open"))
        return  new Andriod();
    else   if(str.equals("Closed"))
        return new IOS();
    else
        return new Windows();
    }
}
