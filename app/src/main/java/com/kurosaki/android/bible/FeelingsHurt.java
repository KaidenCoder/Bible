package com.kurosaki.android.bible;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FeelingsHurt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verse_list);
        final ArrayList<Verse> verse = new ArrayList<Verse>();
        verse.add(new Verse("Proverbs 28:26","Whoever trusts in his " +
                "own mind is a fool, but he who walks in wisdom will be delivered.","",""));
        verse.add(new Verse("James 1:20","For the anger of man does " +
                "not produce the righteousness of God.","",""));
        verse.add(new Verse("Ephesians 4:32","Be kind to one another, " +
                "tenderhearted, forgiving one another, as God in Christ forgave you.","",""));
        verse.add(new Verse("1 Corinthians 14:33","For God is not a God of " +
                "confusion but of peace. As in all the churches of the saints","",""));
        verse.add(new Verse("Isaiah 55:9","For as the heavens are higher than the earth, " +
                "so are my ways higher than your ways and my thoughts than your thoughts.","",""));
        verse.add(new Verse("Proverbs 16:32","Whoever is slow to anger is better than the mighty, " +
                "and he who rules his spirit than he who takes a city.","",""));
        verse.add(new Verse("1 John 2:15-17","Do not love the world or the things in the world. " +
                "If anyone loves the world, the love of the Father is not in him. For all that is in the world—the desires " +
                "of the flesh and the desires of the eyes and pride in possessions—is not from the Father but is from the world. " +
                "And the world is passing away along with its desires, but whoever does the will of God abides forever.","",""));
        verse.add(new Verse("1 John 4:20","If anyone says, “I love God,” and hates his brother, " +
                "he is a liar; for he who does not love his brother whom he has seen cannot love God whom he has not seen.","",""));
        verse.add(new Verse("James 4:6","But he gives more grace. Therefore it says, “God opposes " +
                "the proud, but gives grace to the humble.”","",""));
        verse.add(new Verse("Romans 10:17","So faith comes from hearing," +
                " and hearing through the word of Christ. ","",""));
        VerseAdapter adapter = new VerseAdapter(this, verse);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
