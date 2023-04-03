package HW2;


public class MathGames {
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.
    // Example 1: pythagorean(3,4) would return 5
public static double calculateHypotenuse(double a, double b) {
    double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    return c;
}
   

    
    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements required here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method
        // Example: grade(69.3) would return a D
    public static String calculateGrade(double grade) {
        int roundedGrade = (int) Math.ceil(grade);
        String letterGrade;
        if (roundedGrade >= 90) {
            letterGrade = "A";
        } else if (roundedGrade >= 80) {
            letterGrade = "B";
        } else if (roundedGrade >= 70) {
            letterGrade = "C";
        } else if (roundedGrade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        
        
        System.out.println("my letter grade is: " + letterGrade);
        return letterGrade;
    }
    






    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method
    //      Example: tip(100, 4, 18) would return 5.0

    
 public static int calculateTipPerPerson(double totalBill, int numberOfPeople, double tipPercentage) {
    double tipamount = totalBill * (tipPercentage / 100);
    double totalAmount = totalBill + tipamount;
    int tipPerPerson = (int) Math.ceil(totalAmount / numberOfPeople);
    return tipPerPerson;
 }


    // You can either create a tester class or put your code here
     public static void main(String[] args) {
        double totalBill = 69.73;
        int numberOfPeople = 4;
        double tipPercentage = 18;
        int tipPerPerson = calculateTipPerPerson(totalBill, numberOfPeople, tipPercentage);
        System.out.println("The tip per person is: " + tipPerPerson);
        double myGrade = 69.3;
        String letterGrade = calculateGrade(myGrade);
        double a = 6;
        double b = 8;
        double c = calculateHypotenuse(a, b);
        System.out.println(c);
        }
        
    }

