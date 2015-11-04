/**
 * Created by lukasz on 04.11.15.
 */
public class Task {

    public String ID;

    public Boolean done;
    public Boolean inProgress;

    public Task(String ID)
    {
        this.ID = ID;
        this.done = false;
        this.inProgress = false;
    }
}
