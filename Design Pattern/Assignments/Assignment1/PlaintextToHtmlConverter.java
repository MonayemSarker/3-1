package workshop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PlaintextToHtmlConverter {


    class Read{
        protected String read() throws IOException {
            return new String(Files.readAllBytes(Paths.get("sample.txt")));
        }


    String source;
    List<String> result;
    List<String> convertedLine;
    String characterToConvert;

    public String toHtml(Read read) throws Exception {
        String text = read.read();
        return basicHtmlEncode(text);
    }

    private String basicHtmlEncode(String source) {
        this.source = source;
        result = new ArrayList<>();
        convertedLine = new ArrayList<>();

        charConvertion();
        addANewLine();

        String finalResult = String.join("<br />", result);
        return finalResult;
    }



    private String stashNextCharacter(int i) {
        return String.valueOf(source.charAt(i));
    }

    private void addANewLine() {
        String line = String.join("", convertedLine);
        result.add(line);
        convertedLine = new ArrayList<>();
    }

    private void charConvertion(){
        int i = 0;
        do {
            characterToConvert = stashNextCharacter(i);
            i++;
            switch (characterToConvert) {
                case "<":
                    convertedLine.add("&lt;");
                    break;
                case ">":
                    convertedLine.add("&gt;");
                    break;
                case "&":
                    convertedLine.add("&amp;");
                    break;
                case "\n":
                    addANewLine();
                    break;
                default:
                    convertedLine.add(characterToConvert);
            }
        }while (i <= this.source.length());
    }
}

}
