//The main class
public class Main {
    //The main method
    public static void main(String[] args) {
        //local variable in the method
        System.out.println("Fred's random numbers are: ");
        double num1 = (Math.random() * 10);
        double num2 = (Math.random() * 10);
        System.out.println("num1 = " + num1 + " num2 = " + num2);
        //A new instance of the calculator class
        Calculator calculator = new Calculator(num1, num2);
        System.out.println(calculator.getRandInt(10));
        /* Use the method getUsername in the calculator class
           Store the value the method returns the local variable
           userName
         */
        String name = calculator.getUserName();
        calculator.setUserName(name);
        double answer = calculator.getAddTwoNumbers(num1, num2);
        System.out.println(calculator.getUserName() + " total random is: " + answer);

        calculator.setUserName("Flynn's");
        System.out.println(calculator.getUserName() + " random numbers are: ");
        num1 = (Math.random() * 10);
        num2 = (Math.random() * 10);
        System.out.println("num1 = " + num1 + " num2 = " + num2);
        //Gets the multiplication of num1 and num2
        answer = calculator.getMultiplyTwoNumbers(num1, num2);
        System.out.println("Flynn's multiplied random is: " +  answer);

        calculator.setUserName("Sarah's");
        System.out.println(calculator.getUserName() + " random numbers are: ");
        //Math.random() generates random double's for num1 and num2
        num1 = (Math.random() * 10);
        num2 = (Math.random() * 10);
        System.out.println("num1 = " + num1 + " num2 = " + num2);
        answer = calculator.getDivideTwoNumbers(num1, num2);
        System.out.println("Sarah's divided random is: " +  answer);

        calculator.setUserName("Dave's");
        System.out.println(calculator.getUserName() + " random numbers are: ");
        num1 = (Math.random() * 10);
        num2 = (Math.random() * 10);
        System.out.println("num1 = " + num1 + " num2 = " + num2);
        answer = calculator.getSubtractTwoNumbers(num1, num2);
        System.out.println("Dave's subtracted random is: " +  answer);

        calculator.checkIsEven(calculator.getCalculateRunningTotal());

        System.out.println(calculator.getCurrentStatus());

    }
    }

