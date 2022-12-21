package ru.agcon.new_labs.laba13.zadanie6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String stFileName = scanner.nextLine();
        ArrayList<String> alWords = new ArrayList();
        BufferedReader reader = new BufferedReader(new FileReader(stFileName));

        while(reader.ready()) {
            String[] tmp = reader.readLine().split("\\s");
            Collections.addAll(alWords, tmp);
        }

        StringBuilder result = getLine(alWords);
        System.out.println(result.toString());
    }

    private static StringBuilder getLine(ArrayList<String> words) {
        StringBuilder stringBuilder = new StringBuilder();
        if (words.size() == 0) {
            return new StringBuilder();
        } else {
            stringBuilder.append((String)words.get(0));
            words.remove(0);

            while(words.size() > 0) {
                boolean checker = false;

                for(int i = 0; i < words.size(); ++i) {
                    String a = ((String)words.get(i)).toLowerCase();
                    String b = stringBuilder.toString().toLowerCase();
                    if (a.charAt(0) == b.charAt(stringBuilder.length() - 1)) {
                        stringBuilder.append(" ").append((String)words.get(i));
                        words.remove(i);
                        checker = true;
                    } else if (b.charAt(0) == a.charAt(a.length() - 1)) {
                        stringBuilder.insert(0, " ");
                        stringBuilder.insert(0, (String)words.get(i));
                        checker = true;
                        words.remove(i);
                    }
                }

                if (!checker) {
                    break;
                }
            }

            return stringBuilder;
        }
    }
}
