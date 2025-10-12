public class ToDoItem {

    private String task;
    private String descriptionTask;
    private boolean completionTask;
    private int priorityLevel;


    public ToDoItem(String task, String descriptionTask, boolean completionTask, int priorityLevel) {
        this.task = task;
        this.descriptionTask = descriptionTask;
        this.completionTask = completionTask;
        this.priorityLevel = priorityLevel;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public boolean isCompletionTask() {
        return completionTask;
    }

    public void setCompletionTask(boolean completionTask) {
        this.completionTask = completionTask;
    }

    public String getDescriptionTask() {
        return descriptionTask;
    }

    public void setDescriptionTask(String descriptionTask) {
        this.descriptionTask = descriptionTask;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
