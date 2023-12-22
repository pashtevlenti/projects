package org;

public class Base64 {
    public static final String[] masterLineMas = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".split("");
    public static final String masterLine = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static void main(String[] args) {
        System.out.println(decode(encode("Hello World Informatics")));
    }

    public static String encode(String line) {
        if (line.isEmpty()) return "";
        StringBuilder lineLetters = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            String x = Integer.toBinaryString((int) line.charAt(i));
            while (x.length() != 8) x = "0" + x;
            lineLetters.append(x);
        }


        int x = (lineLetters.length() % 6 == 0) ? (lineLetters.length() / 6) : ((lineLetters.length() / 6) + 1);

        StringBuilder[] lineSetLetters = new StringBuilder[x];
        int k = -1;
        for (int j = 0; j < lineLetters.length(); j++) {
            if (j % 6 == 0) k++;
            if (lineSetLetters[k] == null) lineSetLetters[k] = new StringBuilder();
            lineSetLetters[k].append(lineLetters.charAt(j));
        }

        int count = 0;
        if (lineSetLetters[lineSetLetters.length - 1].length() == 2) count = 2;
        if (lineSetLetters[lineSetLetters.length - 1].length() == 4) count = 1;

        while (lineSetLetters[lineSetLetters.length - 1].length() != 6) {
            lineSetLetters[lineSetLetters.length - 1].append("0");
        }


        StringBuilder code = new StringBuilder();
        for (StringBuilder lineSetLetter : lineSetLetters) {
            code.append(masterLineMas[Integer.parseInt(String.valueOf(lineSetLetter), 2)]);
        }
        switch (count) {
            case 1:
                code.append("=");
                break;
            case 2:
                code.append("==");
                break;
        }
        return String.valueOf(code);
    }

    public static String decode(String line) {
        if (line.isEmpty()) return "";

        String[] lineLetters = line.split("");

        int count = 0;
        if ((lineLetters[lineLetters.length - 1].equals("=")) && (lineLetters[lineLetters.length - 2].equals("="))) count = 2;
        if ((lineLetters[lineLetters.length - 1].equals("=")) && (!lineLetters[lineLetters.length - 2].equals("="))) count = 1;
        StringBuilder lineSetNumbers = new StringBuilder();
        for (int i = 0; i < lineLetters.length - count; i++) {
            String x = Integer.toBinaryString(masterLine.indexOf(lineLetters[i]));
            while (x.length() != 6) x = "0" + x;
            lineSetNumbers.append(x);
        }
        lineSetNumbers.replace((lineSetNumbers.length() - count*2), lineSetNumbers.length(), "");

        StringBuilder[] lineSetLetters = new StringBuilder[lineSetNumbers.length()/8];

        int k = -1;
        for (int j = 0; j < lineSetNumbers.length(); j++) {
            if (j % 8 == 0) k++;
            if (lineSetLetters[k] == null) lineSetLetters[k] = new StringBuilder();
            lineSetLetters[k].append(lineSetNumbers.charAt(j));
        }

        StringBuilder encode = new StringBuilder();
        for (StringBuilder lineSetLetter : lineSetLetters) {
            encode.append((char) Integer.parseInt(String.valueOf(lineSetLetter), 2));
        }
        return String.valueOf(encode);
    }

}


