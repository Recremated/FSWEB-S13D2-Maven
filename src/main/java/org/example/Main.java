package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        String original = Integer.toString(Math.abs(number)).trim();
        String reversed = "";
            for(int i = original.length()-1 ; i >= 0 ; i--){
                reversed += original.charAt(i);
            }
            return original.equals(reversed);
    }

    public static boolean isPerfectNumber(int number){
        int factors = 0;
        if (number <= 0){
            return false;
        } else {
            for(int i = 1; i <= number/2; i++){
                if(number%i == 0){
                    factors += i;
                }
            }
            if(factors == number){
                return true;
            } else {
                return false;
            }
        }
    }

    public static String numberToWords(int number){
        String original = Integer.toString(number);
        String converted = "";
        String[] numbers = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if(number < 0 || original.charAt(0) == '0'){
            return "Invalid Value";
        } else {
            for(int i = 0; i < original.length();i++){
                converted = converted + numbers[Character.getNumericValue(original.charAt(i))] + " ";
        }
            return converted.trim();
        }
    }
}
