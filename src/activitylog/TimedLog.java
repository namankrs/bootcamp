package activitylog;


class TimedLog implements Log {
    private String description;
    private String timeStamp;

    TimedLog(String description, String timeStamp) {
        this.description = description;
        this.timeStamp = timeStamp;
    }
}
