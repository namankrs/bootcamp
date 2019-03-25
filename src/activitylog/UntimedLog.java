package activitylog;

class UntimedLog implements Log {
    private String description;

    UntimedLog(String description) {
        this.description = description;
    }
}
