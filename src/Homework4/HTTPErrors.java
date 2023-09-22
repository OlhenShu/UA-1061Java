package Homework4;

import java.util.Scanner;

public class HTTPErrors {
    public enum HTTPError {
        ERROR_400("Bad Request"),
        ERROR_401("Unauthorized"),
        ERROR_403("Forbidden"),
        ERROR_404("Not Found"),
        ERROR_500("Internal Server Error"),
        ERROR_502("Bad Gateway"),
        ERROR_503("Service Unavailable"),
        ERROR_504("Gateway Timeout"),
        ERROR_505("HTTP Version Not Supported");

        private final String name;

        HTTPError(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the HTTP error code (e.g., 400, 401, 402, etc.): ");
        int errorCode = scanner.nextInt();
        scanner.nextLine();

        HTTPError error = null;

        switch (errorCode) {
            case 400:
                error = HTTPError.ERROR_400;
                break;
            case 401:
                error = HTTPError.ERROR_401;
                break;
            case 403:
                error = HTTPError.ERROR_403;
                break;
            case 404:
                error = HTTPError.ERROR_404;
                break;
            case 500:
                error = HTTPError.ERROR_500;
                break;
            case 502:
                error = HTTPError.ERROR_502;
                break;
            case 503:
                error = HTTPError.ERROR_503;
                break;
            case 504:
                error = HTTPError.ERROR_504;
                break;
            case 505:
                error = HTTPError.ERROR_505;
                break;
            default:
                System.out.println("Unknown HTTP error code.");
                return;
        }

        System.out.println("HTTP error name: " + error.getName());
    }
}