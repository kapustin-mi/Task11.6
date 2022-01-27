package cs.vsu.ru.kapustin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ConsoleMain {

    public static class CmdParams {
        public String inputFile;
        public String outputFile;
        public boolean error;
        public boolean help;
    }

    public static CmdParams parseArgs(String[] args) {
        ConsoleMain.CmdParams params = new CmdParams();

        if (args.length > 0) {
            if (args[0].equals("--help")) {
                params.help = true;
                return params;
            }

            params.inputFile = args[0];
            if (args.length > 1) {
                params.outputFile = args[1];
                return params;
            }
        } else {
            params.help = true;
            params.error = true;
        }

        return params;
    }

    public static void main(String[] args) throws FileNotFoundException {
        CmdParams params = parseArgs(args);

        if (params.help) {
            printHelp(params);
        } else {
            File inputFile = new File(params.inputFile);
            if (!inputFile.exists()) {
                printError(0, params);
            }

            String text = Utils.readTextFromFile(inputFile);
            if (text.equals("")) {
                printError(1, params);
            }

            Highlighter highlighter = new Highlighter();
            String newText = highlighter.highlightText(text);

            printNewText(newText, params);
        }
    }

    private static void printHelp(CmdParams params) {
        PrintStream out = params.error ? System.err : System.out;
        out.println("Usage:");
        out.println("  <cmd> args <input-file> (<output-file>)");
        out.println("  <cmd> --help");
    }

    private static void printError(int errorCode, CmdParams params) {
        if (errorCode == 0) {
            System.err.println("The file " + params.inputFile + " specified cannot be found!");
        } else {
            System.err.println("Data entered incorrectly.");
            System.err.print("The file " + params.inputFile + " must contain text.");
        }
    }

    private static void printNewText(String text, CmdParams params) throws FileNotFoundException {
        PrintStream out = (params.outputFile != null) ? new PrintStream(params.outputFile) : System.out;
        out.println(text);
        out.close();
    }
}
