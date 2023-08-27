package edu04.hw3;

public enum HTTPError {
    E400(400, "Bad Request"),
    E401(401, "Unauthorized"),
    E402(402, "Payment Required"),
    E403(403, "Forbidden"),
    E404(404, "Not Found"),
    E405(405, "Method Not Allowed"),
    E406(406, "Not Acceptable"),
    E407(407, "Proxy Authentication Required"),
    E408(408, "Request Timeout"),
    E409(409, "Conflict"),
    E410(410, "Gone"),
    E411(411, "Length Required"),
    E412(412, "Precondition Failed"),
    E413(413, "Payload Too Large"),
    E414(414, "URI Too Long"),
    E415(415, "Unsupported Media Type"),
    E416(416, "Range Not Satisfiable"),
    E417(417, "Expectation Failed"),
    E418(418, "I'm a teapot"),
    E419(419, "Page Expired"),
    E420(420, "Method Failure or Enhance your calm"),
    E421(421, "Misdirected Request"),
    E422(422, "Unprocessable Entity"),
    E423(423, "Locked"),
    E424(424, "Failed Dependency"),
    E425(425, "Too Early"),
    E426(426, "Upgrade Required"),
    E428(428, "Precondition Required"),
    E429(429, "Too Many Requests"),
    E430(430, "HTTP Status Code"),
    E431(431, "Request Header Fields Too Large"),
    E440(440, "Login Time-out"),
    E444(444, "No Response"),
    E449(449, "Retry With"),
    E450(450, "Blocked by Windows Parental Controls"),
    E451(451, "Unavailable For Legal Reasons"),
    E460(460, "Client closed connection prematurely"),
    E463(463, "Too many forwarded IP addresses"),
    E464(464, "Incompatible protocol"),
    E494(494, "Request header too large"),
    E495(495, "SSL Certificate Error"),
    E496(496, "SSL Certificate Required"),
    E497(497, "HTTP Request Sent to HTTPS Port"),
    E498(498, "Invalid Token");
    private final int code;
    private final String name;

    HTTPError(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static boolean isCodeExist(String errorCode) {
        for (HTTPError code : HTTPError.values()) {
            if (code.name().equals(errorCode)) {
                return true;
            }
        }
        return false;
    }
}
