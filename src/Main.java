public class Main {
    public static void main(String[] args) {
        System.out.println( isWeatherOkay(20, -20));
        System.out.println( isWeatherOkay(18, -10));
        System.out.println(isWeatherOkay(10, 36));
        System.out.println(isWeatherOkay(45, 41));
        System.out.println( isWeatherOkay(21, -3));
    }

    public static String isWeatherOkay (int age, int temperature) {



        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30)
            return "You can go for a walk" ;

        else if
        (age < 20 && temperature >= 0 && temperature <= 28)

            return "Stay at home" ;

        else if (age > 45 && temperature >= -10 && temperature <= 25)
            return "You can go for a walk" ;
        else
            return "Stay at home" ;

    }
}



