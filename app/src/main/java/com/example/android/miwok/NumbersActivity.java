package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        //**create a new ArrayList which takes in a Word object - this Word object is defined in the Word class*/
        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("one","lutti")) ;
        numbers.add(new Word("two", "otiiko"));
        numbers.add(new Word("three","tolookosu"));
        numbers.add(new Word("four","oyyissa"));
        numbers.add(new Word("five","masokka"));
        numbers.add(new Word("six", "temmokka"));
        numbers.add(new Word("seven","kenekaku"));
        numbers.add(new Word("eight", "kawinta"));
        numbers.add(new Word("nine","wo'e"));
        numbers.add(new Word("ten","na'aacha"));


        //** Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word. The ArrayAdapter expects as input only 1 list of strings.
        // To add as input multiple Lists of Strings we need to override the getView method.
        // To do so, we need to create a new class (WordAdapter).*/
        WordAdapter adapter = new WordAdapter(this, numbers);

        // Find the object in the view hierarchy of the Activity.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}