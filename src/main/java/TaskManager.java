import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by lukasz on 04.11.15.
 */
public class TaskManager {
    DataHandler data;


    public TaskManager()
    {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("propFile.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        data = new DataHandler();
        showMenu();
        /*
            getCategories:
            0 - Today
            1 - Tomorrow
            2 - Weekend
            3 - Next Week
         */
        
        showCategories();
        int choice;
        do {
             choice = Integer.parseInt(properties.getProperty("firstMenuOption")) -1;
            if (choice >= data.getCategories().size())
                System.out.println("Wrong number. Try again");
        }while(choice <data.getCategories().size());
        data.getCategories().get(choice)
                .addTask(properties.getProperty("firstTask"),8);
        data.getCategories().get(choice)
                .addTask(properties.getProperty("secondTask"),10);
        data.getCategories().get(3).addTask("Move",3);
        data.getCategories().get(0).setAsDone(0);


        data.getCategories().get(0).readTasks();
    }


    public void showCategories()
    {
        int i = 0;
        for (AbstractCategories cat : data.getCategories())
        {
            System.out.println(cat.ID);
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
