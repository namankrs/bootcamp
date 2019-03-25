package activitylog;

import java.util.ArrayList;
import java.util.List;

public class ActivityLogWithTimeStamp implements ActivityLog {
    private List<Log> logs;

    public ActivityLogWithTimeStamp() {
        this.logs = new ArrayList<>();
    }

    @Override
    public List<Log> add(String log) {
        return this.logs;
    }
}
