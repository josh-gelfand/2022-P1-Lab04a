// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double p  = 250000;
        double r = 4.85;
        double ny   = 30;
        double decimalRate = r/100;
        double monthlyRate = decimalRate /12;
        double numMonths = (ny *12);


        double numerator = (monthlyRate * (Math.pow (monthlyRate + 1, numMonths)));

        double denominator = (Math.pow (monthlyRate + 1, numMonths) - 1);

        double monthlyPayment = (numerator/denominator) * p;
        double totalPayment = monthlyPayment * numMonths;
        double totalInt = (totalPayment -p);


        System.out.println((numerator / denominator) * p);
        System.out.println("Principle:            $"+ p);
        System.out.println("annualRate:          " + r + "%");
        System.out.println("number of years:    " + ny);
        System.out.println("Monthly Payment:    $" + monthlyPayment);
        System.out.println("Total Payment:      $" + totalPayment);
        System.out.println("Total Interest:     $" + totalInt);











        System.out.println();
    }
}

