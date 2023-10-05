package work04;
import java.util.Scanner;

enum HTTPError {
    HTTP_400("Bad Request"),
    HTTP_401("Unauthorized"),
    HTTP_402("Payment Required"),
    HTTP_403("Forbidden"),
    HTTP_404("Not Found");

    private final String errorName;

    private HTTPError(String errorName) {
        this.errorName = errorName;
    }

    public String getErrorName() {
        return errorName;
    }
}

public class hm43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an HTTP error code: ");
            int errorCode = scanner.nextInt();

            if (errorCode < 400 || errorCode >= 600) {
                throw new IllegalArgumentException("Invalid HTTP error code");
            }

            HTTPError error = HTTPError.values()[errorCode - 400];
            String errorName = error.getErrorName();

            System.out.println("The HTTP error " + errorCode + " corresponds to: " + errorName);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


