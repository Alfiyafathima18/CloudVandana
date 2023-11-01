package cloudvandana;

import java.util.HashMap;

public class roman {
	
	public static int romanToInteger(String roman) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(roman.charAt(i));
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            prevValue = currValue;
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "XIV"; // You can change this to any Roman numeral
        int integer = romanToInteger(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equivalent to " + integer);
    }
}


