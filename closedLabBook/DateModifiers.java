package closedLab;

public class DateModifiers {
	public static void main(String[] args) {
        modifiers obj=new modifiers();
        System.out.println(obj.pub);
        System.out.println(obj.priv);
        System.out.println(obj.pro);

        obj.publicmethod();
        obj.privatemethod();
        obj.protectedmethod();
    }
}

class modifiers{
    public int pub=10;
    private int priv=12;
    protected int pro=14;
    int i=16;

    public void publicmethod(){
        privatemethod();
    }
    private void privatemethod(){
        System.out.println(priv);
    }
    protected void protectedmethod(){

    }
    void method4(){

    }
}