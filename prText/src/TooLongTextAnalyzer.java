public class TooLongTextAnalyzer implements TextAnalyzer {

    private final int maxLength;
    private Label label = Label.OK;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    public Label processText(String text) {
        if (text.length() > this.maxLength) {
            label = Label.TOO_LONG;
            return Label.TOO_LONG;
        }
        return Label.OK;
    }

    public Label getLabel() {
        return label;
    }

}
