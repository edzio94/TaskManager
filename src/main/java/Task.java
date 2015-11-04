/**
 * Created by lukasz on 04.11.15.
 */
public class Task {

    public String ID;
    public int priority;

    public Boolean done;
    public Boolean inProgress;

    public Task(String ID,int priority)
    {
        this.ID = ID;
        this.done = false;
        this.inProgress = false;
        this.priority = priority;
    }
}
