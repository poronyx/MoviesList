package sg.edu.rp.c346.movieslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvMovies;
    ArrayList<MovieDetails> toDoList;
    CustomAdapter caMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovies = (ListView)findViewById(R.id.listViewMovie);

        toDoList = new ArrayList<MovieDetails>();

        caMovies = new CustomAdapter(this, R.layout.moviesdetails_row, toDoList);

        lvMovies.setAdapter(caMovies);

        MovieDetails item1 = new MovieDetails("War for the Planet of the Apes"," A 2017 sequel of the Planet of the Apes science fiction franchise by French author Pierre Boulle's."); //Create a ToDoItem object named item1
        toDoList.add(item1);  //Add the ToDoItem object to the toDoList ArrayList

        MovieDetails item2 = new MovieDetails("King Kong","Movie about a giant ape, created by American filmmaker  Merian C. Cooper that first appear in 1930s.");
        toDoList.add(item2);

    }
}
