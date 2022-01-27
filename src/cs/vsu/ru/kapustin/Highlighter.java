package cs.vsu.ru.kapustin;

public class Highlighter {

    public String highlightText(String text) {
       StringBuilder sb = new StringBuilder(text);
       int numberOfOpenBrackets = 0, startIndex = 0, lastIndex;

       for (int i = 0; i < sb.length(); i++) {
           if (sb.charAt(i) == '(') {
               if (numberOfOpenBrackets == 0) {
                   startIndex = i;
               }

               numberOfOpenBrackets++;
           }

           if (sb.charAt(i) == ')') {
               if (numberOfOpenBrackets == 1) {
                   lastIndex = i;

                   sb.replace(startIndex - 1, lastIndex + 1, "");
                   return highlightText(sb.toString());
               }

               numberOfOpenBrackets--;
           }
       }

       return sb.toString();
    }
}
