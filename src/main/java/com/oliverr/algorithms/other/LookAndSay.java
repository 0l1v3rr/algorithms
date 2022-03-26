package com.oliverr.algorithms.other;

public class LookAndSay {
    
    public String lookAndSay(String number) {
        StringBuilder sb = new StringBuilder();

        int firstCharacterPos = 0;
        for(int i = 0; i < number.length(); i++) {
            if(number.charAt(i) != number.charAt(firstCharacterPos)) {
                String digits = number.substring(firstCharacterPos, i);
                sb.append(digits.length()).append(number.charAt(firstCharacterPos));
                firstCharacterPos = 1;
            }
        }
        sb.append(number.substring(firstCharacterPos, number.length()).length()).append(number.charAt(firstCharacterPos));

        return sb.toString();
    }

}
