package enums;

public enum EmotionalCondition {
    LAUGH ("cмех"),
    SHYLY ("робкость"),
    CALM ("в спопокойном состоянии"),
    FINISHEDLAUGHING ("спокойствия после смеха"),
    EMPTYHEAD ("голова без мыслей");

    private String title;

    EmotionalCondition(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
    }


