package Day11_NestedIf_Ternary;

public class Nested_If_Statement {

    public static void main(String[] args) {

        int score = 0;
        String result = " ";

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else {
                result = "F";
            }

        } else {
            result = "Invalid";
        }
        System.out.println(result);

        String result2 = ((score >= 0 && score <= 100)? (score >=90 ? "A":score >= 80? "B" :
                score >= 70? "C" :score >= 60? "D" : "F") :"Invalid");
        System.out.println(result2);


        }
    }

