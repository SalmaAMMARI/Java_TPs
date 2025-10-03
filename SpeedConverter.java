import org.w3c.dom.ls.LSOutput;

public class SpeedConverter {
    //Question1: Method 1
    public static long toMilesPerHour(double kilometers){
        if (kilometers<0){
            return -1;
        }else{
            long miles =Math.round(kilometers*0.621371);
            return miles;
        }
    }

    //Question2: Method2
    public static void prinConversion(double Kilometers){
        if( toMilesPerHour(Kilometers)<0){
            System.out.println("Invalid Value");

        }else{
            System.out.println(Kilometers+" km/h="+toMilesPerHour(Kilometers)+" i/h" );
        }
    }
    public static void main(String[] args){

        //Test for Method 1 (question1)
        System.out.println("-------------------------Test for method1 question1-------------------------------");
        System.out.println(SpeedConverter.toMilesPerHour(1.5));
        System.out.println(SpeedConverter.toMilesPerHour(10.25));
        System.out.println(SpeedConverter.toMilesPerHour(-1.5));
        //Test for Method 2
        System.out.println("-------------------------Test for method2 question2-------------------------------");
        SpeedConverter.prinConversion(1.5);
        SpeedConverter.prinConversion(-1.5);
        SpeedConverter.prinConversion(75.114);

    }
}
