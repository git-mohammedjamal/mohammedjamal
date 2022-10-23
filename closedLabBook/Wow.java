package closedLab;

public class Wow{
    public static void main(String[] args) {
        derived obj=new derived();
        obj.used();
    }
}

/*protected*/ 
class base{
    String Method(){
        return "Wow";
    }
}

class derived{
    public void used(){
        base z=new base();
        System.out.println("Base says,"+z.Method());
    }
}
