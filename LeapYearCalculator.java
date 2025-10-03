public class LeapYearCalculator {

    public static boolean isLeapYear(int year){
        if (year<1 || year >9999){
            return false;


        }else{
            if (year%4==0 && year%100!=0){
                return true;
            }else if (year%100==0){
                if (year%400==0){
                    return true;
                }else{
                    return false;

                }
            }else{
                return false;
            }

        }
    }
    public static void main(String[] arg){

        //Test
        System.out.println(LeapYearCalculator.isLeapYear(-1600));
        System.out.println(LeapYearCalculator.isLeapYear(1600));
        System.out.println(LeapYearCalculator.isLeapYear(2017));
        System.out.println(LeapYearCalculator.isLeapYear(2000));
    }
}
