package com.kurosaki.android.bible;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Friendship extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verse_list);
        final ArrayList<Verse> verse = new ArrayList<Verse>();
        verse.add(new Verse("Proverbs 18:24","A man of many companions may " +
                "come to ruin, but there is a friend who sticks closer than a brother. ","",""));
        verse.add(new Verse("Ecclesiastes 4:9-12","Two are better than one, because " +
                "they have a good reward for their toil. For if they fall, one will lift up his fellow. " +
                "But woe to him who is alone when he falls and has not another to lift him up! Again, if two " +
                "lie together, they keep warm, but how can one keep warm alone? And though a man might prevail " +
                "against one who is alone, two will withstand him—a threefold cord is not quickly broken. ","",""));
        verse.add(new Verse("John 15:13","Greater love has no one than this, " +
                "that someone lay down his life for his friends. ","",""));
        verse.add(new Verse("Proverbs 27:17","Iron sharpens iron, and one man sharpens another. ","",""));
        verse.add(new Verse("Proverbs 17:17","A friend loves at all times, and a brother is born for adversity. ","",""));
        verse.add(new Verse("1 Thessalonians 5:11","Therefore encourage one another and " +
                "build one another up, just as you are doing. ","",""));
        verse.add(new Verse("1 Corinthians 15:33","Do not be deceived: “Bad company ruins good morals.” ","",""));
        verse.add(new Verse("Job 6:14","He who withholds kindness from a friend forsakes the fear of the Almighty.","",""));
        verse.add(new Verse("John 15:12-14","This is my commandment, that you love one another as I have loved you. " +
                "Greater love has no one than this, that someone lay down his life for his friends. " +
                "You are my friends if you do what I command you.","",""));
        verse.add(new Verse("Proverbs 13:20","Whoever walks with the wise becomes wise, " +
                "but the companion of fools will suffer harm.","",""));
        VerseAdapter adapter = new VerseAdapter(this, verse);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
