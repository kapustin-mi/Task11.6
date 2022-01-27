package cs.vsu.ru.kapustin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    public static String readTextFromFile(File file) throws FileNotFoundException {
        Scanner scn = new Scanner(file);
        List<String> lines = new ArrayList<>();

        while (scn.hasNext()) {
            lines.add(scn.nextLine());
        }

        return convertLinesToText(lines);
    }

    private static String convertLinesToText(List<String> lines) {
        StringBuilder sb = new StringBuilder();

        for (String line : lines) {
            sb.append(line);
        }

        return sb.toString();
    }
}
