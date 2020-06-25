public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private final String[] keywords;
    private Label label = Label.OK;

    public NegativeTextAnalyzer() {
        this.keywords = new String[]{":(", "=(", ":|"};
    }

    public Label processText(String text) {
        for (String keyword : this.keywords) {
            if (text.contains(keyword)) {
                label = Label.NEGATIVE_TEXT;
                return Label.NEGATIVE_TEXT;
            }
        }
        return label.OK;
    }

    public String[] getKeywords() {
        return this.keywords;
    }

    public Label getLabel() {
        return label;
    }

}
