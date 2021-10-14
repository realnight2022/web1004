package beans;

public class Counter 
{
    private int counter = 0;
    public void setCounter(int value) 
    {
        this.counter = value;
    }
    public int getCounter() 
    {
        return this.counter;
    }
    public Counter() 
    {
    	counter=5;
    }
}
