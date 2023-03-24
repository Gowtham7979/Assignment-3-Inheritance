public class Nurse extends HospitalEmployee 
{
    private int numOfPatients;

    public Nurse(String name, int number, int numOfPatients) 
    {
        super(name, number);
        this.numOfPatients = numOfPatients;
    }

    public int getNumOfPatients() 
    {
        return numOfPatients;
    }

    public void setNumOfPatients(int numOfPatients) 
    {
        this.numOfPatients = numOfPatients;
    }

   
    public String toString() 
    {
        return "name is " + name +  " , id is " + number++ +" , numOfPatients are " + numOfPatients + " for sonny";
    }
    public void work() 
    {
        System.out.println(name + " works for the hospital. " + name + " is a nurse with "  +numOfPatients + " patients"  );
            
    }
}

