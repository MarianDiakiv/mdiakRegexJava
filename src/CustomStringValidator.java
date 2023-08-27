
public class CustomStringValidator {
    private String pattern;

    public CustomStringValidator(String pattern) {

        this.pattern = pattern;
    }

    public CustomStringValidator() {

    }

    public boolean isValid(String str) {

        return str.matches(pattern);

    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}
