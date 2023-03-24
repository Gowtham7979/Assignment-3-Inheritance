public class Doctor extends HospitalEmployee
{
    protected String specialty;

    public Doctor(String name, int number, String specialty)
    {
        super(name, number);
        this.specialty = specialty;
    }

    public String getSpecialty() 
    {
        return specialty;
    }

    public void setSpecialty(String specialty) 
    {
        this.specialty = specialty;
    }
    public String toString() 
    {
          return "name is " + name +  ", id is " + number +", specialty is '" + specialty + '\'';
    }
    public void work() 
    {
    	System.out.println(name + " works for the hospital. " + name + " is an " + specialty + " doctor");  	     
    }
}
