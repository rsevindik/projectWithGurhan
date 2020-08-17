package Day10_IfStatements;

public class Character_Identify {
    public static void main(String[] args) {

        char character = '@';

        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
        System.out.println(isAlphabetic);

        boolean isDigit = character >= 48 && character <= 57;

        boolean specialChar = isAlphabetic == false && isDigit == false;
        //                  = !isAlphabetic && ! isDigit

        String alphabet = " ";

        if(isAlphabetic == true){
        //    System.out.println(character + " is an Alphabetic character");
            alphabet = character + " is an Alphabetic character";

        }else{
        //    System.out.println(character + " is NOT an Alphabetic character");
            alphabet = character + " is NOT an Alphabetic character";
        }
        System.out.println(alphabet);

        String digit = " ";
        if(isDigit == true){
            digit = character+ " is a digit";
        }else{
            digit = character+ " is NOT a digit";
        }

        System.out.println(digit);

        String specialCharacter = " ";
        if(specialChar == true){
            specialCharacter = character+ " is a special character";
        }else{
            specialCharacter = character+ " is NOT a special character";
        }

        System.out.println(specialCharacter);

    }
}
