package com.example.project;

public class StringLoops {

   public StringLoops() { }

    public String removeA(String str) {
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'A') {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public String removeA2(String str) {
        String result = "";
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'A') {
                result += str.charAt(i);
            }
            i++;
        }
        return result;
    }

    public String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public String reverseString2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }

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
        for (int i = 0; i <= origString.length() - searchString.length(); i++) {
            String sub = origString.substring(i, i + searchString.length());

            if (sub.equals(searchString)) {
                count++;
            }
        }
        return count;
    }

    public String removeString(String searchString, String origString) {
        if (searchString.isEmpty()) {
            return origString;
        }

        String result = origString;
        boolean foundMatch = true;

        while (foundMatch) {
            String temp = "";
            int i = 0;
            foundMatch = false;

            while (i < result.length()) {
                if (i + searchString.length() <= result.length() && result.substring(i, i + searchString.length()).equals(searchString)) {
                    foundMatch = true; 
                    i += searchString.length();
                } else {
                    temp += result.charAt(i);
                    i++;
                }
            }
            result = temp;
        }
        return result;
    }




    public void commaSeparated(int fromNum, int toNum) {
        int step = (fromNum <= toNum) ? 1 : -1;
        int current = fromNum;

        while (true) {
            System.out.print(current);

            if (current == toNum) {
                break; 
            }

            System.out.print(", "); 

            current += step;
        }
        System.out.println();
    }

    public boolean isPalindrome(String myString) {
        String cleanedString = "";
        for (int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            if (currentChar != ' ') {
                cleanedString += Character.toLowerCase(currentChar);
            }
        }

        int start = 0;
        int end = cleanedString.length() - 1;

        while (start < end) {
            if (cleanedString.charAt(start) != cleanedString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true; 
    }

    
    public void multiPrint(String toPrint, int num) {
        if (num <= 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < num; i++) {
            System.out.print(toPrint);
            if (i < num - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }
}