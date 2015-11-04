import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 04.11.15.
 */
public class DataHandler {
    private List<AbstractCategories> Categories;

    public DataHandler()
    {
        Categories = new ArrayList<>();
        Categories.add(new TodayCategory());
        Categories.add(new TomorrowCategory());
        Categories.add(new WeekendCategory());
        Categories.add(new NextWeekCategory());


    }

    public List<AbstractCategories> getCategories() {
        return Categories;
    }

    public void setCategories(List<AbstractCategories> categories) {
        Categories = categories;
    }

    public void addCategory (AbstractCategories category)
    {
        this.Categories.add(category);
    }
}
