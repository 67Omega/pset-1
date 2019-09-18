/**
 * Problem Set 1.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 * 
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet1 {
    
    public static void main(String[] args) {
        
        /*
         * Exercise 1.
         * 
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */
        

	double length = 11;
        double width = 8.5;
        double inchesToMillimeters = 25.4;
        double lengthInMillimeters = (length * inchesToMillimeters);
        double widthInMillimeters = (width * inchesToMillimeters);
        double areaInSquareMillimeters = (lengthInMillimeters * widthInMillimeters);
        System.out.println();
        System.out.printf("%,.2f square millimeters.",areaInSquareMillimeters);
        System.out.println("\n");
        
        /*
         * Exercise 2.
         * 
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
        
        double inchesToCentimeters = 2.54;
        double lengthInCentimeters = (length * inchesToCentimeters);
        double widthInCentimeters = (width * inchesToCentimeters);
        double perimeterInCentimeters = (lengthInCentimeters * 2) + (widthInCentimeters * 2);
        System.out.printf("%.2f centimeters.",perimeterInCentimeters);
        System.out.println("\n");
        
        /*
         * Exercise 3.
         * 
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
        
        double lengthSquared = length * length;
        double widthSquared = width * width;
        double hypotSquared = lengthSquared + widthSquared;
        double diagonal = Math.sqrt(hypotSquared);
        System.out.printf("%.2f inches.",diagonal);
        System.out.println("\n");

        /*
         * Exercise 4.
         * 
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */
        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;
        double homeworkWeight = 0.15;
        double quizWeight = 0.35;
        double testWeight = 0.50;
        double homework1Grade = homework1 * homeworkWeight;
        double homework2Grade = homework2 * homeworkWeight;
        double homework3Grade = homework3 * homeworkWeight;
        double quiz1Grade = quiz1 * quizWeight;
        double quiz2Grade = quiz2 * quizWeight;
        double quiz3Grade = quiz3 * quizWeight;
        double test1Grade = test1 * testWeight;
        double test2Grade = test2 * testWeight;
        double test3Grade = test3 * testWeight;
        double homeworkGrade = (homework1Grade + homework2Grade + homework3Grade) / 3;
        double quizGrade = (quiz1Grade + quiz2Grade + quiz3Grade) / 3;
        double testGrade = (test1Grade + test2Grade + test3Grade) / 3;
        double finalGrade = homeworkGrade + quizGrade + testGrade;
        System.out.printf("%.2f%%.",finalGrade);
        System.out.println("\n");
        
        
        /*
         * Exercise 5.
         * 
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

        double mondayHours = 7.5;
        double tuesdayHours = 8;
        double wednesdayHours = 10.5;
        double thursdayHours = 9.5;
        double fridayHours = 6;
        double saturdayHours = 11.5;
        double sundayHours = 0;
        double hourlyWage = 12.50;
        double totalHours = mondayHours + tuesdayHours + wednesdayHours + thursdayHours + fridayHours + saturdayHours + sundayHours;
        double totalEarned = totalHours * hourlyWage;
        System.out.printf("$%.2f", totalEarned);
        System.out.println("\n");
        
        /*
         * Exercise 6.
         * 
         * What is my take-home pay each check?
         */
        
        double yearlySalary = 117000; 
        double amountPerCheck = 117000 / 24; 
        double federalTaxRate = .24; 
        double stateTaxRate = .0637; 
        double contributionRate = .07; 
        double takehome = amountPerCheck - (amountPerCheck * contributionRate); 
        double federalTax = takehome * federalTaxRate;
        double newtakehome = takehome - federalTax;
        double stateTax = newtakehome * stateTaxRate;
        double finalTakehome = newtakehome - stateTax;
        System.out.printf("$%,.2f", finalTakehome); 
        System.out.println("\n");
        
        /*
         * Exercise 7.
         * 
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
        
       int students = 273;
    	int teachers = 28;
    	double busCapacity = 54;
    	double totalAttending = students + teachers;
    	double numberOfBuses = Math.ceil(totalAttending/busCapacity);
    	double lastBus = totalAttending % busCapacity;
    	System.out.printf("%.0f buses are needed, with %.0f passengers on the last bus.\n", numberOfBuses, lastBus);
        
        /*
         * Exercise 8.
         * 
         * What is the surface area of a standard Cornhole board?
         */
        
    double length = 48;
    double width = 24;
    double holeDiameter = 6;
    double holeRadius = holeDiameter / 2;
    double basicDimensions = length * width;
    double holeArea = Math.PI * (holeRadius * holeRadius);
    double totalArea = basicDimensions - holeArea;
    System.out.printf("%.2f square inches.\n", totalArea);
        
        /*
         * Exercise 9.
         * 
         * Are the years 2020, 2100, and 2400 leap years?
         */
        
        double yearOne = 2020;
    double yearTwo = 2100;
    double yearThree = 2400;
    boolean leapTestOneYearOne = ((yearOne % 20) == 0);
    boolean leapTestTwoYearOne = ((yearOne % 100) != 0);
    boolean leapTestThreeYearOne = ((yearOne % 400) == 0);
    boolean leapTestOneYearTwo = ((yearTwo % 20) == 0);
    boolean leapTestTwoYearTwo = ((yearTwo % 100) != 0);
    boolean leapTestThreeYearTwo = ((yearTwo % 400) == 0);
    boolean leapTestOneYearThree = ((yearThree % 20) == 0);
    boolean leapTestTwoYearThree = ((yearThree % 100) != 0);
    boolean leapTestThreeYearThree = ((yearThree % 400) == 0);
    boolean isOneLeapYear = (leapTestOneYearOne == true || ((leapTestTwoYearOne == false) & (leapTestThreeYearOne == true)));
    boolean isTwoLeapYear = (leapTestOneYearTwo == true || ((leapTestTwoYearTwo == false) & (leapTestThreeYearTwo == true)));
    boolean isThreeLeapYear = (leapTestOneYearThree == true || ((leapTestTwoYearThree == false) & (leapTestThreeYearThree == true)));
    System.out.printf("%.0f is a leap year...%b.\n", yearOne, isOneLeapYear);
    System.out.printf("%.0f is a leap year...%b.\n", yearTwo, isTwoLeapYear);
    System.out.printf("%.0f is a leap year...%b.\n", yearThree, isThreeLeapYear);
        
        /*
         * Exercise 10.
         * 
         * What is the wind chill?
         */
        
        double temperature = 38;
    double windSpeed = 14;
    double windchillFirstCalc = (35.74 + (0.6215*temperature));
    double windchillSecondCalc = ((0.4275*temperature)-35.75);
    double windchillThirdCalc = Math.pow(windSpeed, 0.16);
    double windchillFourthCalc = windchillSecondCalc * windchillThirdCalc;
    double windchill = windchillFirstCalc + windchillFourthCalc;
    System.out.printf("%.1f degrees.\n", windchill);
        
    }
}