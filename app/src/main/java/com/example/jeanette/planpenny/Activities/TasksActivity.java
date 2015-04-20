package com.example.jeanette.planpenny.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jeanette.planpenny.R;


public class TasksActivity extends Activity implements View.OnClickListener {

    Button buttonTasks,buttonProjects, buttonCalendar, buttonClipBoard, buttonCategories;
    TextView textMainTitle;
    //Import fonts from fonts
   // public Typeface RegularFont = Typeface.createFromAsset(getAssets(), "fonts/latoregular.ttf");
    //public Typeface LightFont = Typeface.createFromAsset(getAssets(),"fonts/latolight.ttf");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
        buttonTasks = (Button) findViewById(R.id.buttonTasks);
        buttonProjects = (Button) findViewById(R.id.buttonProjects);
        buttonCalendar = (Button) findViewById(R.id.buttonCalendar);
        buttonClipBoard = (Button) findViewById(R.id.buttonClipBoard);
        buttonCategories = (Button) findViewById(R.id.buttonCategories);
        textMainTitle = (TextView) findViewById(R.id.textMainTitle);

       // buttonTasks.setTypeface(RegularFont);
       // buttonProjects.setTypeface(RegularFont);
        //buttonProjects.setTypeface(RegularFont);
        //buttonCalendar.setTypeface(RegularFont);
        //buttonClipBoard.setTypeface(RegularFont);
        //buttonCategories.setTypeface(RegularFont);
        //textMainTitle.setTypeface(LightFont);

        //onclick listeners
        buttonTasks.setOnClickListener(this);
        buttonProjects.setOnClickListener(this);
        buttonCalendar.setOnClickListener(this);
        buttonClipBoard.setOnClickListener(this);
        buttonCategories.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v==buttonTasks){
            startActivity(new Intent(this, TasksActivity.class));
            System.out.println("Task button pressed");

        }else if (v==buttonProjects) {
            startActivity(new Intent(this, ProjectActivity.class));
            System.out.println("Projects button pressed");

        }else if(v==buttonCalendar){
            startActivity(new Intent(this, CalendarActivity.class));
            System.out.println("Calendar button pressed");


        }else if(v==buttonClipBoard){
            startActivity(new Intent(this, ClipBoardActivity.class));
            System.out.println("Clip Board button pressed");

        }else if(v==buttonCategories){
            startActivity(new Intent(this, CategoriesActivity.class));
            System.out.println("Categories button pressed");

        }
    }
}
