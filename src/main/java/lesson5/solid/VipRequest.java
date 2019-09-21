package lesson5.solid;

import java.time.LocalDateTime;

public class VipRequest extends Request {

    private final LocalDateTime time;

    public VipRequest(int code, String message, LocalDateTime time) {

        super(code, message);
        this.time = time;
    }
}
