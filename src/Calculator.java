public class Calculator {
    //Instance variables
    private String name = "Fred";
    private final int calculateRunningTotal;

    //Calculator constructor
    public Calculator(double num1, double num2) {
        calculateRunningTotal = 0;
    }

    public String getUserName() {
        return name;
    }

    public void setUserName(String name) {
        this.name = name;
    }

    private int calculateRunningTotal() {
        return (int)(Math.random() * 10);
    }

    public int getCalculateRunningTotal() {
        return calculateRunningTotal;
    }

    /**
     * Generates a random number from 1 to a range
     * @param range maximum number included
     * @return the random int
     */
    public int getRandInt(int range) {
        return (int) (Math.random() * range + 1);
    }

    //This method gets the current status of RunningTotal
    //and returns the String, while storing
    //the userName and RunningTotal in the String.
    public String getCurrentStatus() {
        return "Current Status: " + getUserName() + " running total is = " + calculateRunningTotal();
    }

    //This method checks if the value of RunningTotal
    // is even or odd
    public void checkIsEven(int checkNum) {
        if(checkNum % 2 == 0 && checkNum > 10) {
            System.out.println(getCalculateRunningTotal() + " is even");
        } else if (checkNum % 2 == 0) {
            System.out.println("Is even");
            if (checkNum == 10) {
                System.out.println("is even but under 10");
            }
        } else {
            System.out.println("is odd");
        }
    }

    //This method created for adding two numbers
    public double getAddTwoNumbers(double num1, double num2) {
        double answer;
        answer = num1 + num2;
        //return value
        return answer;
    }

    //This method created for multiplying two numbers
    public double getMultiplyTwoNumbers(double num1, double num2) {
        double answer;
        answer = num1 * num2;
        //returns value
        return answer;
    }

    //This method created for dividing two numbers
    public double getDivideTwoNumbers(double num1, double num2) {
        double answer;
        answer = num1 / num2;
        //returns value
        return answer;
    }

    //This method created for subtracting two numbers
    public double getSubtractTwoNumbers(double num1, double num2) {
        double answer;
        answer = num1 - num2;
        //returns value
        return answer;
    }
}
