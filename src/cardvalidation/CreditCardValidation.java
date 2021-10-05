package cardvalidation;

public class CreditCardValidation {
    public static long userInput;
    public int sumOfDoubleEvenPlace(long userInput)
    {
        String stringOfUserInput = String.valueOf(userInput);

        int sum = 0;
        for (int index = stringOfUserInput.length() - 2; index >= 0 ; index -= 2) {
            int intOfUserInput = Integer.parseInt(String.valueOf(stringOfUserInput.charAt(index)));
            sum += getDigit(intOfUserInput);
            System.out.println(sum);
        }
        return sum;

    }

    public int getDigit(int number)
    {
        int digit;
        int doubleNumber = number * 2;
        if (doubleNumber < 10) {
            digit = doubleNumber;
        } else {
            String temp = String.valueOf(doubleNumber);
            digit = Character.getNumericValue(temp.charAt(0)) + Character.getNumericValue(temp.charAt(1));
        }
        return digit;
    }

    public int sumOfOddPlace(long userInput) {
        String stringUserInput = String.valueOf(userInput);
        int sum =0;
        for (int index = stringUserInput.length() - 1; index >= 0 ; index -= 2) {
                int intUserInput = Integer.parseInt(String.valueOf(stringUserInput.charAt(index)));
                sum += intUserInput;
                System.out.println(sum);
            }
            return sum;
    }
//    public void sumOfDoubleEvenAndOddPlaceNumber()
//    {
//        int total = sumOfDoubleEvenPlace() + sumOfOddPlace(userInput);
//        System.out.println(total);
//    }
}
