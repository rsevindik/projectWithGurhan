package day04_Variables;

public class Variables3_String {

    public static void main(String[] args) {

        String name = "Rambo";
        System.out.println("============================="); //just for separating

        String EmployeeName = "Adam";
        int EmployeeId = 987654321;   //use String if ID includes letters.!
        String JobTitle = "QA-SDET-Tester";
        double Salary = 121_033.00;
        char Gender = 'M';
        boolean isFullTime = true;

        /** Adding concatenating by System.out.println("..." + ....)
         * which will make it readable
         */
        System.out.println("Employee Name: " + EmployeeName);
        System.out.println("Employee Id: " + EmployeeId);
        System.out.println("Job Title: " + JobTitle);
        System.out.println("Salary: " + Salary+ " USD");
        System.out.println("Gender: " + Gender);
        System.out.println("Employee Status? " + isFullTime);

        System.out.println("================================");

        String FirstName = "Ramazan";
        String LastName = "Sevindik";
        int Age = 39;
        String CountryName = "Turkey";
        int SsnNumber = 123456789;
        char Sex = 'M';
        boolean EmploymentStatus = true;

        System.out.println("First Name: "+FirstName);
        System.out.println("Last Name: "+LastName);
        System.out.println("Age: "+Age);
        System.out.println("Country Name: "+ CountryName);
        System.out.println("SSN: "+SsnNumber);
        System.out.println("Sex: "+Sex);
        System.out.println("Employment Status: "+EmploymentStatus);


    }
}
