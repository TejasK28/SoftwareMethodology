package StaticDynamicType;

public class H extends G{

    public int h;

    /*
     * What is instanceof?
     */
    public boolean equals(Object o)
    {
        if(o == null || !(o instanceof H))
            return false;
        return true;
    }
    
}
