package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;



public class Gantt extends PApplet
{	
	public ArrayList<Task> Tasks = new ArrayList<Task>();
	

	public void settings()
	{
		size(800, 600);
	}

	public void loadTasks()
	{
		Table t = loadTable("tasks.csv", "header");
		for(TableRow row:t.rows())
		{
			Task i = new Task(row);
			Tasks.add(i);
		}
	}

	public void printTasks()
	{
		for(Task i:Tasks)
		{
			System.out.println(i);
		}
	
	}

	public void displayTasks()
	{	
		background(0,0,0);
		noFill();
		stroke(50,50,50);
		translate(100, 0);


		for(int x=0; x < 390; x = x + 13)
		{
			line(x,50,x,450);
		}
		textAlign(CENTER);

		int s = 1;
		for(int x = 0; x < 390; x = x + 13)
		{
		text(s,x,50);
		s = s + 1;
		}


		String r = "Research";
		String d = "Design";
		String p1 = "Faze 1";
		String p2 = "Phase 2";
		String p3 = "Phaze 3";
		String i = "Integrating";
		String t = "Testing";
		String e = "Evaluation";
		String re = "Release";


		text(r,-40,100);
		text(d,-40,140);
		text(p1,-40,180);
		text(p2,-40,220);
		text(p3,-40,260);
		text(i,-40,300);
		text(t,-40,340);
		text(e,-40,380);
		text(re,-40,420);
	}
	
	public void mousePressed()
	{
		println("Mouse pressed");	
	}

	public void mouseDragged()
	{
		println("Mouse dragged");
	}

	
	
	public void setup() 
	{
		loadTasks();
		printTasks();
	}
	
	public void draw()
	{			
		background(0);
	}
}
