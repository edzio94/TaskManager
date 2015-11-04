import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 02.11.15.
 */
public abstract class AbstractCategories implements CategoriesInterface{

    List<Task> tasks;

    public final String ID;

    public AbstractCategories(String CategoryID)
    {
        this.tasks = new ArrayList<>();
        this.ID = CategoryID;

    }

    @Override
    public void addTask(String taskID,int priority) {
        tasks.add(new Task(taskID,priority));
        Sort();
    }

    @Override
    public void readTasks() {
        int i = 0;

        for(Task task:tasks)
        {
            System.out.println("=============");
            System.out.println(++i+"."+task.ID);
            if (task.inProgress)
                System.out.print("In progress");
            else if(task.done)
                System.out.println("Done");
        }

    }

    @Override
    public void removeTask(int index) {

        tasks.remove(index);
    }

    @Override
    public void setAsDone(int index) {
        if(tasks.get(index).inProgress)
            tasks.get(index).inProgress = false;

        tasks.get(index).done = true;
    }

    @Override
    public void setInProgress(int index) {
        tasks.get(index).inProgress = true;
    }

    @Override
    public void Sort() {
        for (int i = 0 ; i < tasks.size();i++)
        {
            for (int j = i+1; j < tasks.size() -1; j++)
            {
                if (tasks.get(i).priority <= tasks.get(j).priority)
                {
                    Task tmp = tasks.get(i);
                    tasks.set(i, tasks.get(j));
                    tasks.set(j,tmp);
                }
            }
        }
    }
}
