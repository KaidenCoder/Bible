package com.kurosaki.android.bible;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Fear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verse_list);

        final ArrayList<Verse> verse = new ArrayList<Verse>();
        verse.add(new Verse("Isaiah 41:10","Fear not, for I am with you; be not dismayed, " +
                "for I am your God; I will strengthen you, I will help you, I will uphold you with my righteous right hand. ","",
                ""));
        verse.add(new Verse("Psalm 56:3","When I am afraid, I put my trust in you.","",""));
        verse.add(new Verse("2 Timothy 1:7","For God gave us a spirit not of fear but of power and love and self-control.","",""));
        verse.add(new Verse("Deuteronomy 31:6","Be strong and courageous. Do not fear or be in dread of them, " +
                "for it is the Lord your God who goes with you. He will not leave you or forsake you.”","",""));
        verse.add(new Verse("1 Peter 5:6-7","Humble yourselves, therefore, under the mighty hand of God so that at the proper " +
                "time he may exalt you, casting all your anxieties on him, because he cares for you.","",""));
        verse.add(new Verse("Joshua 1:9","Have I not commanded you? Be strong and courageous. Do not be frightened, and do not be dismayed, for the Lord your God is with you wherever you go.","",""));
        verse.add(new Verse("John 14:27","Peace I leave with you; my peace I give to you. Not as the world gives do " +
                "I give to you. Let not your hearts be troubled, neither let them be afraid.","",""));
        verse.add(new Verse("Isaiah 35:4","Say to those who have an anxious heart, “Be strong; fear not! Behold, your God will " +
                "come with vengeance, with the recompense of God. He will come and save you.”","",""));
        verse.add(new Verse("Exodus 14:14","The Lord will fight for you, and you have only to be silent.","",""));
        verse.add(new Verse(" Psalm 23:4","Even though I walk through the valley of the shadow of death, I will fear no evil, " +
                "for you are with me; your rod and your staff, they comfort me.","",""));

        VerseAdapter adapter = new VerseAdapter(this, verse);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
