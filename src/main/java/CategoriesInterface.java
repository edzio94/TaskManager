/**
 * Created by lukasz on 02.11.15.
 */
public interface CategoriesInterface {

    void readTasks();
    void addTask(String task);
    void removeTask(int index);
    void setInProgress(int index);
    void setAsDone(int index);
}
