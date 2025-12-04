package com.example.project;

public class StringLoops {

   public StringLoops() { }

   // WARM UP
    // using a for loop remove all 'a' characters from input string
    public String removeA(String str) {
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a') {
                result += str.charAt(i);
            }
        }
        return result;
    }

    // WARM UP
    // using a while loop remove all 'a' characters from input string
    public String removeA2(String str) {
        String result = "";
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) != 'a') {
                result += str.charAt(i);
            }
            i++;
        }
        return result;
    }

    // WARM UP
    // Reverse a string by counting down from the end to the start
    public String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // WARM UP
    // Reverse a string by counting up from the start to the end
    public String reverseString2(String str) {
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            reversed = str.charAt(i) + reversed;
        }
        return reversed;
    }

    // using a for loop
    public String replaceCharacterV1(String searchChar, String origStr, String replaceChar) {
        String result = "";
        for (int i = 0; i < origStr.length(); i++) {
            if (String.valueOf(origStr.charAt(i)).equals(searchChar)) {
                result += replaceChar;
            } else {
                result += origStr.charAt(i);
            }
        }
        return result;
    }

    // using a while loop
    public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
        String result = "";
        int i = 0;
        while (i < origStr.length()) {
            if (String.valueOf(origStr.charAt(i)).equals(searchChar)) {
                result += replaceChar;
            } else {
                result += origStr.charAt(i);
            }
            i++;
        }
        return result;
    }

    public int countString(String searchString, String origString) {
        int count = 0;
        int lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = origString.indexOf(searchString, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += searchString.length();
            }
        }
        return count;
    }

    public String removeString(String searchString, String origString) {
        String result = origString;
        int index = result.indexOf(searchString);
        while (index != -1) {
            result = result.substring(0, index) + result.substring(index + searchString.length());
            index = result.indexOf(searchString);
        }
        return result;
    }

    public void commaSeparated(int fromNum, int toNum) {
        String result = "";
        for (int i = fromNum; i <= toNum; i++) {
            result += i;
            if (i < toNum) {
                result += ",";
            }
        }
        System.out.println(result);
    }

    public boolean isPalindrome(String myString) {
        String cleanedString = "";
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleanedString += Character.toLowerCase(c);
            }
        }

        String reversedCleanedString = "";
        for (int i = cleanedString.length() - 1; i >= 0; i--) {
            reversedCleanedString += cleanedString.charAt(i);
        }

        return cleanedString.equals(reversedCleanedString);
    }

    public void multiPrint(String toPrint, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(toPrint);
        }
    }
}