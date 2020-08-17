package Day11_NestedIf_Ternary;

public class Nested_If_Practice1 {
    public static void main(String[] args) {
        double salary = 12000;
        double JobHistory = 15;
        String eligibility = " ";

        if(salary >= 30000){
            if(JobHistory >= 2){
                eligibility = "You are Qualify";
            }else{
                eligibility = "You must have been on this job at least 2 years";
            }
        }else{
            eligibility = "You must have at least $30 K ";
        }
        System.out.println(eligibility);

        String eligibility2 = (salary >= 30000? (JobHistory >=2? "You are qualify":
                "You must have been on this job at least 2 years"):"You must have at least $30 K ");
        System.out.println(eligibility2);



    }
}
