package lesson5.solid;

public class Request {
    private int code;
    private String message;

    public Request(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
