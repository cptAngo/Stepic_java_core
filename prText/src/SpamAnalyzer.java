public class SpamAnalyzer extends KeywordAnalyzer {

    private final String[] keywords;
    private Label label = Label.OK;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords.clone();
    }

    public Label processText(String text) {
        for (String keyword : this.keywords) {
            if (text.contains(keyword)){
                label = Label.SPAM;
                return Label.SPAM;
            }
        }
        return Label.OK;
    }

    public String[] getKeywords() {
        return this.keywords;
    }

    public Label getLabel() {
        return label;
    }
}
