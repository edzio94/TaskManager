import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 02.11.15.
 */
public class SchoolCategory extends AbstractCategories {
    List<String> tasks;
    public final String ID = "SCHOOL_CATEGORY";

    public SchoolCategory(){
        tasks = new ArrayList<>();
    }
    @Override
    public void readCategories() {

        for(String task:tasks)
        {
            System.out.println(task);
        }
    }

    @Override
    public void addToCategory(String task) {
        tasks.add(task);

    }
}
