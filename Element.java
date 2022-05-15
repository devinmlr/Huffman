
public class Element
{
    public String name;
    public int num;
    
    public Element(String name)
    {
        this.name = name;
        //this.haufigkeit = haufigkeit;
    }
    
    public String getName () {
        return name;
    }
    
    public int getNum () {
        return num;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public void setNum (int num) {
        this.num = num;
    }

}
