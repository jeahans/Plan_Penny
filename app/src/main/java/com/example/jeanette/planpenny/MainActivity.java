package com.example.jeanette.planpenny;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jeanette.planpenny.Fragments.CalendarFragment;
import com.example.jeanette.planpenny.Fragments.CategoriesFragment;
import com.example.jeanette.planpenny.Fragments.ClipBoardFragment;
import com.example.jeanette.planpenny.Fragments.ProjectsFragment;
import com.example.jeanette.planpenny.Fragments.TasksFragment;


public class MainActivity extends Activity implements View.OnClickListener {
    Button buttonTasks,buttonProjects, buttonCalendar, buttonClipBoard, buttonCategories;
    TextView textMainTitle;
    View insertFrag;

    //Import fonts from fonts
//    public Typeface RegularFont = Typeface.createFromAsset(getAssets(), "fonts/latoregular.ttf");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTasks = (Button) findViewById(R.id.buttonTasks);
        //buttonTasks.setHighlightColor(Integer.parseInt("@Color/MainColor"));
        buttonProjects = (Button) findViewById(R.id.buttonProjects);
        buttonCalendar = (Button) findViewById(R.id.buttonCalendar);
        buttonClipBoard = (Button) findViewById(R.id.buttonClipBoard);
        buttonCategories = (Button) findViewById(R.id.buttonCategories);

        textMainTitle = (TextView) findViewById(R.id.textMainTitle);
        insertFrag = findViewById(R.id.insertFrag);

        /*buttonTasks.setTypeface(RegularFont);
        buttonProjects.setTypeface(RegularFont);
        buttonProjects.setTypeface(RegularFont);
        buttonCalendar.setTypeface(RegularFont);
        buttonClipBoard.setTypeface(RegularFont);
        buttonCategories.setTypeface(RegularFont);
        */

        //onclick listeners
        buttonTasks.setOnClickListener(this);
        buttonProjects.setOnClickListener(this);
        buttonCalendar.setOnClickListener(this);

        buttonClipBoard.setOnClickListener(this);
        buttonCategories.setOnClickListener(this);

        getFragmentManager().beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.insertFrag, new TasksFragment())
                .addToBackStack(null)
                .commit();

        textMainTitle.setText(R.string.title_activity_tasks);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);


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
    public void onClick(View v){
        if (v==buttonTasks){
            getFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.insertFrag, new TasksFragment())
                    .addToBackStack(null)
                    .commit();
            buttonTasks.setBackgroundColor(getResources().getColor(R.color.SecondaryColor));
            buttonTasks.setTextColor(getResources().getColor(R.color.MainColor));
            buttonProjects.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonProjects.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonCalendar.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonCategories.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonClipBoard.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonClipBoard.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonCategories.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonCategories.setTextColor(getResources().getColor(R.color.SecondaryColor));
            textMainTitle.setText(R.string.title_activity_tasks);


        }else if (v==buttonProjects) {
            getFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.insertFrag, new ProjectsFragment())
                    .addToBackStack(null)
                    .commit();
            buttonTasks.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonTasks.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonProjects.setBackgroundColor(getResources().getColor(R.color.SecondaryColor));
            buttonProjects.setTextColor(getResources().getColor(R.color.MainColor));
            buttonCalendar.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonCalendar.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonClipBoard.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonClipBoard.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonCategories.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonCategories.setTextColor(getResources().getColor(R.color.SecondaryColor));

            textMainTitle.setText(R.string.title_activity_projects);

        }else if(v==buttonCalendar){




            getFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.insertFrag, new CalendarFragment())
                    .addToBackStack(null)
                    .commit();

            buttonTasks.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonTasks.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonProjects.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonProjects.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonCalendar.setBackgroundColor(getResources().getColor(R.color.SecondaryColor));
            buttonCalendar.setTextColor(getResources().getColor(R.color.MainColor));
            buttonClipBoard.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonClipBoard.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonCategories.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonCategories.setTextColor(getResources().getColor(R.color.SecondaryColor));

            textMainTitle.setText(R.string.title_activity_calendar);

        }else if(v==buttonClipBoard){
            getFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.insertFrag, new ClipBoardFragment())
                    .addToBackStack(null)
                    .commit();

            buttonTasks.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonTasks.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonProjects.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonProjects.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonCalendar.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonCalendar.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonClipBoard.setBackgroundColor(getResources().getColor(R.color.SecondaryColor));
            buttonClipBoard.setTextColor(getResources().getColor(R.color.MainColor));
            buttonCategories.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonCategories.setTextColor(getResources().getColor(R.color.SecondaryColor));

            textMainTitle.setText(R.string.title_activity_clip_board);
        }else if(v==buttonCategories){
            getFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.insertFrag, new CategoriesFragment())
                    .addToBackStack(null)
                    .commit();

            buttonTasks.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonTasks.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonProjects.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonProjects.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonCalendar.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonCalendar.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonClipBoard.setBackgroundColor(getResources().getColor(R.color.MainColor));
            buttonClipBoard.setTextColor(getResources().getColor(R.color.SecondaryColor));
            buttonCategories.setBackgroundColor(getResources().getColor(R.color.SecondaryColor));
            buttonCategories.setTextColor(getResources().getColor(R.color.MainColor));


            textMainTitle.setText(R.string.title_activity_categories);
        }

    }
}
