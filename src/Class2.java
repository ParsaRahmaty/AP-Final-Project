/**
 * Created by 9731021 on 6/19/2019.
 */
public class Class2 {
    private boolean sheriff;

    Class2(int minOfTheMovie){
        sheriff = false;
        if (minOfTheMovie >= 45)
            sheriff = true;
    }

    public void setSheriff(boolean sheriff) {
        this.sheriff = sheriff;
    }

    public boolean getSheriff(){
        return sheriff;
    }

}
