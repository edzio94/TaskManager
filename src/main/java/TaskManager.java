/**
 * Created by lukasz on 04.11.15.
 */
public class TaskManager {
    DataHandler data;


    public TaskManager()
    {
        data = new DataHandler();
        showMenu();
        /*
            getCategories:
            0 - Today
            1 - Tomorrow
            2 - Weekend
            3 - Next Week
         */
        

        data.getCategories().get(0).addTask("Repair Car");
        data.getCategories().get(3).addTask("Move");
        data.getCategories().get(0).setAsDone(0);
        data.getCategories().get(0).readTasks();
    }


    public void showCategories()
    {
        for(AbstractCategories category : data.getCategories())
        {

        }
    }


    public void showMenu()
    {
        System.out.println("1. Add task to Category");
        System.out.println("2. Show Category");
        System.out.println("3. Change 'done' status");
        System.out.println("4. Change 'In Progress' status");

    }



}
