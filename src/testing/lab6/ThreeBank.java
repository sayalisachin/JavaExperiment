public class ThreeBank {
    int getRateOfInterest(){return 0;}
    
}
class SBI extends ThreeBank{
    int getRateOfInterest(){return 8;}
}
class ICICI extends ThreeBank{
    int getRateOfInterest(){return 7;}
}
class AXIS extends ThreeBank{
    int getRateOfInterest(){return 9;}
}
class TestBank{
    public static void main(String[] args) {
        ThreeBank b;
        b=new SBI();
        System.out.println("SBI Rate Of Interest: "+b.getRateOfInterest());
        b=new ICICI();
        System.out.println("ICICI Rate Of Interest: "+b.getRateOfInterest());
        b=new AXIS();
        System.out.println("AXIS Rate Of Interest: "+b.getRateOfInterest());
    }
}