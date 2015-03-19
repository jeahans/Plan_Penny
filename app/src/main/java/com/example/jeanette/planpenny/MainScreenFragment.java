package com.example.jeanette.planpenny;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MainScreenFragment extends Fragment implements View.OnClickListener {

    Context context;
    Button buttonTasks,buttonProjects, buttonCalendar, buttonClipBoard, buttonCategories;
    TextView textMainTitle;
    public Typeface RegularFont = Typeface.createFromAsset(context.getAssets(), "fonts/latoregular.ttf");
    public Typeface LightFont = Typeface.createFromAsset(context.getAssets(),"fonts/latolight.ttf");
    public MainScreenFragment(){
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View frag =  inflater.inflate(R.layout.fragment_main_screen, container, false);

        textMainTitle = (TextView) frag.findViewById(R.id.textMainTitle);

        textMainTitle.setTypeface(RegularFont);
        getFragmentManager().beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.insertFrag, new TasksFragment())
                .addToBackStack(null)
                .commit();


        buttonTasks = (Button) frag.findViewById(R.id.buttonTasks);
        buttonTasks.setHighlightColor(Integer.parseInt("@Color/MainColor"));
        buttonProjects = (Button) frag.findViewById(R.id.buttonProjects);
        buttonCalendar = (Button) frag.findViewById(R.id.buttonCalendar);
        buttonClipBoard = (Button) frag.findViewById(R.id.buttonClipBoard);
        buttonCategories = (Button) frag.findViewById(R.id.buttonCategories);

        buttonTasks.setTypeface(RegularFont);
        buttonProjects.setTypeface(RegularFont);
        buttonProjects.setTypeface(RegularFont);
        buttonCalendar.setTypeface(RegularFont);
        buttonClipBoard.setTypeface(RegularFont);
        buttonCategories.setTypeface(RegularFont);

        //onclick listeners
        buttonTasks.setOnClickListener(this);
        buttonProjects.setOnClickListener(this);
        buttonCalendar.setOnClickListener(this);

        buttonClipBoard.setOnClickListener(this);
        buttonCategories.setOnClickListener(this);

        return frag;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public void onClick(View v){
        if (v==buttonTasks){
            getFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.insertFrag, new TasksFragment())
                    .addToBackStack(null)
                    .commit();

        }else if (v==buttonProjects) {
            getFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.insertFrag, new ProjectsFragment())
                    .addToBackStack(null)
                    .commit();

        }else if(v==buttonCalendar){
                getFragmentManager().beginTransaction()
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .replace(R.id.insertFrag, new CalendarFragtment())
                        .addToBackStack(null)
                        .commit();

        }else if(v==buttonClipBoard){
            getFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.insertFrag, new ClipBoardFragment())
                    .addToBackStack(null)
                    .commit();
        }else if(v==buttonCategories){
            getFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.insertFrag, new CategoriesFragment())
                    .addToBackStack(null)
                    .commit();
        }

    }




}
