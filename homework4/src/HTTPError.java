public enum HTTPError {
    BAD_REQUEST(400, "Bad Request"),
    UNATHORIZED(401, "Unathorized"),
    Payment_Required(402,"Payment Required"),
    FORBIDDEN(403,"Forbidden"),
    NOTFOUND(404, "Not Found"),
    METHODNATALLOWED(405, "Method Not Allowed"),
    NOTACCEPTABLE(406, "Not Acceptable"),
    PROXYAUTHENTICATIONREQUIRED(407, "Proxy Authentication Required"),
    REQUESTTIMEOUT(408, "Request Timeout"),
    CONFLICT(409, "Conflict"),
    GONE(410, "Gone"),
    LENGTHREQUIRED(411, "Length Required"),
    PRECONDITIONFAILED(412, "Precondition Failed"),
    REQUESTENTTOOLARGE(413, "Request Entity Too Large"),
    REQUESTURITOOLONG(414, "Request-URI Too Long"),
    UNSUPPMEDIATYPE(415, "Unsupported Media Type"),
    REQUESTRANGENOTSATIS(416, "Requested Range Not Satisfiable"),
    EXPECTATIONFAIL(417, "Expectation Failed"),
    AUTHTIMEOUT(419, "Authentication Timeout"),
    METHODFAIL(420, "Method Failure"),
    UNPROCESSABLEENTI(422, "Unprocessable Entity"),
    LOCKED(423, "Locked"),
    FAILDEPENDENCY(424, "Failed Dependency"),
    UPGREQUIRED(426, "Upgrade Required"),
    PRECONDITIONREQ(428, "Precondition Required"),
    TOOMANYREQ(429, "Too Many Requests"),
    REQHEADFIELDSTOOLARGE(431, "Request Header Fields Too Large");


    private final int code;
    private final String description;

    HTTPError(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getNumber() {
        return code;
    }


    public static String task3(int numb) {
        for (HTTPError code : values()) {
            if (code.getNumber() == numb) {
                return code.description;
            }
        }
        return null;
    }
}
