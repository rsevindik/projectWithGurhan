package SelfPractices_Summer_B20;

public class warmUP_07_22_2020 {
/*
1. write a method that can retunr the full name of a person in reugral format

    ex:
    fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
2. write a return method that accepts two numbers and an operator, then returns calculation result.
			 if the oerator is invalid, return zero
			 otherwise return the result
*/
public static void main(String[] args) {
    System.out.println(fullName("cYbErTeK", "SCHOOL"));

    double result = calculation(3.0, '+', 5.5);
    System.out.println(result);


}/** end of the main method.!    */

public static String fullName(String givenFirst, String givenLast){

    String firstName = givenFirst.substring(0,1).toUpperCase()+givenFirst.substring(1).toLowerCase();
    String lastName = givenLast.substring(0,1).toUpperCase()+givenLast.substring(1).toLowerCase();

    return firstName+" "+lastName;

}

public static double calculation(double d1, char operator, double d2){

    double result;

    switch(operator){
        case '+':
           result = d1+d2;
           break;
        case '-':
            result = d1-d2;
            break;
        case '*':
            result = d1*d2;
            break;
        case '/':
            result = d1/d2;
            break;
        case '%':
            result = d1%d2;
            break;
        default:
            result = 0;
            break;

    }

        return result;

}



}/** end f the class body */
