public class Main {
    public static void main(String[] args) {
        method(20, -20);
        method(18, -10);
        method(10, 36);
        method(45, 41);
        method(21, -3);
    }

    public static void method(int age, int temperature) {

        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30)
            System.out.println("You can go for a walk");

        else if
        (age < 20 && temperature >= 0 && temperature <= 28)

            System.out.println("You can go for a walk");

        else if (age > 45 && temperature >= -10 && temperature <= 25)
            System.out.println("You can go for a walk");
        else
            System.out.println("Stay at home");


    }
}



