package testing.lab5;
class Box{
    double width;
    double height;
    double depth;
    Box(){
        System.out.println("Constructing Box...");
        width=10;
        height=20;
        depth=5;
    }
    double Volume(){
        return width*height*depth;
    }
}

public class BoxDemoConstructor {
    public static void main(String[] args) {
        Box mybox1=new Box();
        Box mybox2=new Box();
        double vol;
        vol=mybox1.Volume();
        vol=mybox2.Volume();
        System.out.println("volume is: "+vol);
    }
    
}
