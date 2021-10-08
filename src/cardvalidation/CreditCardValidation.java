package cardvalidation;

public class CreditCardValidation {

    public int sumOfDoubleEvenPlace(long userInput)
    {
        validateLengthOfcardNumber(userInput);
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
        String userInputString = String.valueOf(userInput);
        int sum =0;
        for (int index = userInputString.length() - 1; index >= 0 ; index -= 2) {
                int intUserInput = Integer.parseInt(String.valueOf(userInputString.charAt(index)));
                sum += intUserInput;
                System.out.println(sum);
            }
            return sum;
    }
    public int sumOfDoubleEvenAndOddPlaceNumber(long userInput)
    {
        int total = sumOfDoubleEvenPlace(userInput) + sumOfOddPlace(userInput);
        System.out.println(total);
        return total;
    }

    public boolean isValid(long userInput)
    {
         return (sumOfDoubleEvenAndOddPlaceNumber(userInput) % 10 == 0);
    }

    public void validateLengthOfcardNumber(long userInput)
    {
        String userInputString = String.valueOf(userInput);
        if (userInputString.length() > 16 || userInputString.length() < 13) throw new IllegalArgumentException("Card number is incorrect");
    }

    public int getSize(long userInput) {
        String userInputString = String.valueOf(userInput);
        return userInputString.length();
    }
//    public static CreditCardType getCreditCardType(long cardNumber) {
//        CreditCardType creditCardType;
//        String cardNumberString = String.valueOf(cardNumber);
//        String cardNumberPrefix = String.valueOf(cardNumberString.charAt(0));
//        switch (cardNumberPrefix) {
//            case "3":
//                if (String.valueOf(cardNumberString.charAt(1)).equals("7"))
//                    creditCardType = CreditCardType.AMERICA_EXPRESS_CARD;
//                break;
//            case "4":
//                creditCardType = CreditCardType.VISA_CARDS;
//                break;
//            case "5":
//                creditCardType = CreditCardType.MASTER_CARDS;
//                break;
//            case "6":
//                creditCardType = CreditCardType.DISCOVER_CARDS;
//        }
//        return creditCardType;
//    }
}
