package day05AritmeticOperators;

public class EmployeeInfo2 {

    public static void main(String[] args) {

        String FirstName = "John", LastName = "Daniel", CompanyName = "CapitalOne", JobTitle = "SDET";
        int age = 35;
        double salary = 120_000.5;
        char gender = 'M';
        boolean isFullTime = true;
        boolean isMarried = false;
        String fullName = FirstName + " " + LastName;

        System.out.println("Employee's full name is: " + FirstName + " " + LastName);
        System.out.println(fullName + "'s ' gender is: " + gender);
        System.out.println(FirstName + " " + LastName + " is " + age + " years old");
        System.out.println(FirstName + " " + LastName + "'s ' company's name is: " + CompanyName);
        System.out.println(FirstName + " " + LastName + "'s ' Job Title is: " + JobTitle);
        System.out.println(FirstName + " " + LastName + " is a full-time employee: " + isFullTime);
        System.out.println(FirstName + " " + LastName + " is married: " + isMarried);
        System.out.println(FirstName + " " + LastName + "'s Annual Salary is: $" + salary);


    }
    }
