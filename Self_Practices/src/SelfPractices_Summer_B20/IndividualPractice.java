package SelfPractices_Summer_B20;

public class IndividualPractice {
    public static void main(String[] args) {

        sum(2,4,6);
        greaterNum(10,-20);
        mathOperation(5,'*',7);
    }

    public static void sum(int num1, int num2,int num3){
        int sum = num1  + num2 +num3;
        System.out.println("sum of "+num1+", "+num2+", and "+num3+" is: "+sum);

    }
    public static void greaterNum(int firstNum, int secNum){
        if(firstNum > secNum){
            System.out.println(firstNum+" is greater than "+secNum);
        }else{
            System.out.println(secNum+" is greater than "+firstNum);
        }
    }
    public static void mathOperation (int num1, char operator, int num2){
        int result = 0;
        switch (operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            case '%':
                result = num1%num2;
                break;
            default:
                System.out.println("Invalid operator type");;
        }
        System.out.println(result);
    }
}
