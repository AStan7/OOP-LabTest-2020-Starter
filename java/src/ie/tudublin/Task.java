package ie.tudublin;

import processing.data.TableRow;

public class Task {

    public int start;
    public int end;
    
    public Task(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    public Task(TableRow tr)
    {
        this(tr.getInt("start"), tr.getInt("end"));
    }

    public String toString()
    {
        return this.start + ", " + this.end;
    }

}