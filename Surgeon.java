public class Surgeon extends Doctor 
{
    private boolean operating;

    public Surgeon(String name, int number, String specialty, boolean operating)
    {
        super(name, number, specialty);
        this.operating = operating;
    }

    public boolean isOperating() 
    {
        return operating;
    }

    public void setOperating(boolean operating) 
    {
        this.operating = operating;
    }

        public String toString() 
    {
        return "name is " + name +  ", id is " + number +", specialty is '" + specialty + '\'' +" , operating: '" + operating +'\'';
    }
    public void work() 
    {
    	if (operating == true)
    	{
        System.out.println(name + " works for the hospital." + name + " is operating now");
    	}
    	else
    	{
    		System.out.println(name + " works for the hospital." + name + " is not operating now");
    	}
    }
}
