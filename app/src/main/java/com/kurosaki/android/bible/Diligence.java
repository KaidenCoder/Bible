package com.kurosaki.android.bible;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Diligence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verse_list);

        final ArrayList<Verse> verse = new ArrayList<Verse>();
        verse.add(new Verse("Galatians 6:9","And let us not grow weary of doing good, for" +
                " in due season we will reap, if we do not give up.","",""));
        verse.add(new Verse("Proverbs 13:4","The soul of the sluggard craves and gets nothing, " +
                "while the soul of the diligent is richly supplied.","",""));
        verse.add(new Verse("Proverbs 10:4","A slack hand causes poverty, " +
                "but the hand of the diligent makes rich.","",""));
        verse.add(new Verse("1 Corinthians 15:58","Therefore, my beloved brothers, " +
                "be steadfast, immovable, always abounding in the work of the Lord, knowing that in " +
                "the Lord your labor is not in vain.","",""));
        verse.add(new Verse("Proverbs 12:24","The hand of the diligent will rule, " +
                "while the slothful will be put to forced labor.","",""));
        verse.add(new Verse("James 1:12","Blessed is the man who remains steadfast " +
                "under trial, for when he has stood the test he will receive the crown of life, which " +
                "God has promised to those who love him.","",""));
        verse.add(new Verse("Proverbs 6:6-8","Go to the ant, O sluggard; consider her ways, " +
                "and be wise. Without having any chief, officer, or ruler, she prepares her bread in summer " +
                "and gathers her food in harvest.","",""));
        verse.add(new Verse("Hebrews 6:10-12","For God is not unjust so as to overlook " +
                "your work and the love that you have shown for his name in serving the saints, as you still do. " +
                "And we desire each one of you to show the same earnestness to have the full assurance of hope until " +
                "the end, so that you may not be sluggish, but imitators of those who through faith and patience inherit the promises.","",""));
        verse.add(new Verse("Proverbs 12:11","Whoever works his land will have plenty of bread, but he who follows worthless pursuits lacks sense.","",""));
        verse.add(new Verse("Hebrews 11:6","And without faith it is impossible to please him, for " +
                "whoever would draw near to God must believe that he exists and that he rewards those who seek him.","",""));

        VerseAdapter adapter = new VerseAdapter(this, verse);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
