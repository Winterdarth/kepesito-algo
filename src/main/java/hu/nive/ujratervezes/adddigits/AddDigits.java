package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input.isEmpty() || input == null) {
            return -1;
        }

        int sum = 0;
        for(int i = 0; i < input.length() ; i++){
            if( Character.isDigit(input.charAt(i)) ){
                sum = sum + Character.getNumericValue(input.charAt(i));
            }
        }
        return sum;
    }
}
