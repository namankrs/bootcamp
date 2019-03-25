package activitylog;

import java.util.ArrayList;
import java.util.List;

public class ActivityLogWithoutTimeStamp implements ActivityLog {
    private List<Log> logs;

    public ActivityLogWithoutTimeStamp() {
        this.logs = new ArrayList<>();
    }

    @Override
    public List<Log> add(String log) {
        this.logs.add(new UntimedLog(log));
        return this.logs;
    }
}
