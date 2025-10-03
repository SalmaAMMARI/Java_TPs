public class TeenNumberChecker {

    //Method 1
    public static boolean checkTeen(int a , int b , int c){
        return ((13<=a && a<=19) || (13<=b && b<=19) ||(13<=c && c<=19)  );
    }

    //Method2
    public static boolean isTeen(int a){
        return (13<=a && a<=19);
    }

    //Tests
    public static void main(String[] arg){
        //Test Method 1
        System.out.println("---------------Test Method1-----------");
        System.out.println( TeenNumberChecker.checkTeen(9,99,19));
        System.out.println( TeenNumberChecker.checkTeen(23,15,42));
        System.out.println( TeenNumberChecker.checkTeen(22,23,34));
        System.out.println("---------------Test Method2-----------");
        System.out.println(TeenNumberChecker.isTeen(9));
        System.out.println(TeenNumberChecker.isTeen(13));
    }
}
