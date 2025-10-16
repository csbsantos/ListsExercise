import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ToDoList  {

    private int taskComparator;
    Queue <ToDoItem> toDoList1= new PriorityQueue<ToDoItem>( new taskComparator());
    ToDoItem toDoItem= new ToDoItem("do homework", "do all the exercises", false, 2 );
    Iterator <ToDoItem> iterator1= toDoList1.iterator();

    public ToDoList(int taskComparator, Queue<ToDoItem> toDoList1, ToDoItem toDoItem) {
        this.taskComparator = taskComparator;
        this.toDoList1 = toDoList1;
        this.toDoItem = toDoItem;
    }

    public ToDoList() {

    }

    public void addTask (ToDoItem toDoItem){
        if (!toDoList1.contains(toDoItem)) {
            toDoList1.add(toDoItem);
        }else{
            throw new RuntimeException("This task already exists in your list. Please, add a different one");

        }
    }
    public String removeTask (ToDoItem toDoItem){
        if (!toDoList1.contains(toDoItem)){
            System.out.println("Sorry, but you can't remove something that doesn't exist. Please, review your task and try again");
        }else{
            toDoList1.remove(toDoItem);
        }
        return "";
    }
    public ToDoItem getNextTask () {
        toDoList1.poll();
        return toDoItem;
    }

   public void getAllTasks (){
       for (ToDoItem temp: toDoList1){
           System.out.println(temp);
       }
          }
//        for (ToDoItem temp: toDoList1){
//            System.out.println(temp);


    public ToDoItem getIncompleteTasks() {
        for (ToDoItem temp2 : toDoList1) {
            if (!temp2.isCompletionTask()) {
                System.out.println(temp2);
            }
        }

        return null;
    }
        public ToDoItem getCompleteTasks(){
            for (ToDoItem temp3: toDoList1){
                if (temp3.isCompletionTask()){
                    System.out.println(temp3);
                }
            }
            return null;
        }
        public void markTaskComplete () {
            for (ToDoItem temp4 : toDoList1) {
                if (!temp4.isCompletionTask()) {
                    temp4.setCompletionTask(true);
                }
            }
            return;
        }
        public void markTaskIncomplete(){
            for (ToDoItem temp5: toDoList1){
                if (temp5.isCompletionTask()){
                    temp5.setCompletionTask(false);
                }
            }
            return;
            }
            public int getListSize (){
        return toDoList1.size();
            }

    @Override
    public String toString() {
        return "ToDoList{" +
                "taskComparator=" + taskComparator +
                ", toDoList1=" + toDoList1 +
                ", toDoItem=" + toDoItem +
                ", iterator1=" + iterator1 +
                '}';
    }
}
