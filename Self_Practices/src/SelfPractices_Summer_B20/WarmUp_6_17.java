package SelfPractices_Summer_B20;

public class WarmUp_6_17 {

    public static void main(String[] args) {

        System.out.println("=============Task-1================");

        double a = 30, b = 65, c = 90;
        double sum = a + b + c;
        boolean IsATriangle = true;
        if (sum == 180) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Not a Valid Triangle");
        }

        System.out.println("================task-2===============");

        char ch1 = 'A', ch2 = 'a';

        if (ch1 == ch2) {  //boolean sameCharacters = 'A' == 'a'; if(sameCharacters)==> will give you the same result
            System.out.println("Same Characters");
        } else {
            System.out.println("Different Characters");
        }

        System.out.println("================task-3===============");

        int ModelYear = 2006;

        boolean reCall = (ModelYear >= 1995 && ModelYear <= 1998) || (ModelYear >= 2001 && ModelYear <= 2002) ||
                (ModelYear >= 2004 && ModelYear <= 2006) || (ModelYear >= 2015 && ModelYear <= 2017);

        if (reCall) {
            System.out.println("Is Eligible for Recall!");
        } else {
            System.out.println("Is NOT Eligible for Recall!");
        }

        System.out.println("================task-4===============");

        char ch = '!';
        if (ch <= 90 && ch >= 65 || ch <= 122 && ch >= 97) {
            System.out.println(ch + " is an Alphabetic Character.");
        } else {
            System.out.println(ch + " is NOT an Alphabetic Character.");
        }

        System.out.println("================task-5===============");

        char ch3 = '3';
        if (ch3 <= 57 && ch3 >= 48) {
            System.out.println(ch3 + " is a digit (Number)");
        } else {
            System.out.println(ch3 + " is NOT a digit (Number");
        }

        System.out.println("================task-6===============");

        char ch4 = '#';
        if (ch4 <= 47 && ch4 >= 33) {
            System.out.println(ch4 + " is a symbol");
        } else {
            System.out.println(ch4 + " is NOT a symbol");
        }

        System.out.println("================task-7===============");

        int StatusCode = 404;
        String OutPut = "";

        if (StatusCode == 200) {
            OutPut = "OK";
        }
        if (StatusCode == 201) {
            OutPut = "Created";
        }
        if (StatusCode == 202) {
            OutPut = "Accepted";
        }
        if (StatusCode == 301) {
            OutPut = "Moved Permanently";
        }
        if (StatusCode == 303) {
            OutPut = "See Other";
        }
        if (StatusCode == 304) {
            OutPut = "Not Modified";
        }
        if (StatusCode == 307) {
            OutPut = "Temporary Redirect";
        }
        if (StatusCode == 400) {
            OutPut = "Bad Request";
        }
        if (StatusCode == 401) {
            OutPut = "Unauthorized";
        }
        if (StatusCode == 403) {
            OutPut = "Forbidden";
        }
        if (StatusCode == 404) {
            OutPut = "Not Found";
        }
        if (StatusCode == 410) {
            OutPut = "Gone";
        }
        if (StatusCode == 500) {
            OutPut = "Internal Serves Error";
        }
        if (StatusCode == 503) {
            OutPut = "Serves Unavailable";
        }
        System.out.println(OutPut);

        System.out.println("===============task-8=============");

        int age = 170;
        String AgeGroup = " ";

        if (age < 3) {
            AgeGroup = "Baby";
        } else if (age >= 3 && age <= 5) {
            AgeGroup = "Toddler";
        } else if (age >= 6 && age <= 9) {
            AgeGroup = "Kid";
        } else if (age >= 10 && age <= 11) {
            AgeGroup = "Pre-Teen";
        } else if (age >= 13 && age <= 17) {
            AgeGroup = "Teenager";
        } else if (age >= 18 && age <= 20) {
            AgeGroup = "Young Adult";
        } else if (age >= 21 && age <= 39) {
            AgeGroup = "Adult";
        } else if (age >= 40 && age <= 49) {
            AgeGroup = "Young Middle-Aged Adult";
        } else if (age >= 50 && age <= 54) {
            AgeGroup = "Middle-Aged Adult";
        } else if (age >= 55 && age <= 64) {
            AgeGroup = "Very Young Senior Citizen";
        } else if (age >= 65 && age <= 74) {
            AgeGroup = "Young Senior Citizen";
        } else if (age >= 75 && age <= 84) {
            AgeGroup = "Senior Citizen";
        } else if (age >= 85 && age <= 150) {
            AgeGroup = "Old Senior Citizen";
        } else if (age > 150 && age < 0) {
            AgeGroup = "Old Senior Citizen";
        } else {
            System.out.println("Invalid Entry");
        }

        System.out.println(AgeGroup);

        System.out.println("===============task-9=============");
        int day = 0;

        if (day == 1) {
            System.out.println("It's a Monday!");
        } else if (day == 2) {
            System.out.println("It's a Tuesday!");
        } else if (day == 3) {
            System.out.println("It's a Wednesday!");
        } else if (day == 4) {
            System.out.println("It's a Thursday!");
        } else if (day == 5) {
            System.out.println("It's a Friday!");
        } else if (day == 6) {
            System.out.println("It's a Saturday!");
        } else if (day == 7) {
            System.out.println("It's a Sunday!");
        } else {
            System.out.println("There is no such a day!");
        }

        System.out.println("===============task-10=============");
/*
        int month = 12;
        int NumberOfDays = 0;

        if (month == 2) {
            NumOfDays = 28;
        if (month == 4 || month == 6 || month == 9 || month == 11)
                NumOfDays = 30;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                NumOfDays = 30;
        } else {
            System.out.println(NumOfDays);
        }

        System.out.println("===============task-11=============");

        int num = 0;

 */

    }
}
