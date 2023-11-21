package ConditionStatements.Task3;

public enum HTTPError {

    ERROR400("Bad request"),
    ERROR401("Unauthorized"),
    ERROR404("Not Found"),
    ERROR505("HTTP Version is not supported");
    private final String description;


    HTTPError(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
