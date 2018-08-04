package com.kurosaki.android.bible;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Anxiety extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verse_list);

        final ArrayList<Verse> verse = new ArrayList<Verse>();
        verse.add(new Verse("1 Peter 5:7","Casting all your anxieties on him, because he cares for you.",
                "Explaination","Christians are to cast all of their discontent, discouragement, " +
                "despair and suffering on the Lord, and trust Him for knowing what He's doing with their lives. Along with " +
                "submission and humility, trust in God is the third attitude necessary for victorious Christian living."));
        verse.add(new Verse("Philippians 4:6-7 ","1.\tDo not be anxious about anything, but in everything by prayer and supplication " +
                "with thanksgiving let your requests be made known to God. And the peace of God, which surpasses all understanding, " +
                "will guard your hearts and your minds in Christ Jesus.","",""));
        verse.add(new Verse("Matthew 6:25-34","Therefore I tell you, do not be anxious about your life, what you will eat or what you will drink, nor about your body, " +
                "what you will put on. Is not life more than food, and the body more than clothing? Look at the birds of the air: " +
                "they neither sow nor reap nor gather into barns, and yet your heavenly Father feeds them. Are you not of more value than they? " +
                "And which of you by being anxious can add a single hour to his span of life? And why are you anxious about clothing? Consider the lilies of the field, how they grow: they neither toil nor spin, yet I tell you, even Solomon in all his glory was not arrayed like one of these. ..., ","",""));
        verse.add(new Verse("1 Peter 5:6-7","Humble yourselves, therefore, under the mighty hand of God so that at " +
                "the proper time he may exalt you, casting all your anxieties on him, because he cares for you.","",""));
        verse.add(new Verse("Philippians 4:13","I can do all things through him who strengthens me.","",""));
        verse.add(new Verse("Matthew 6:34","Therefore do not be anxious about tomorrow, for tomorrow will be anxious for itself. " +
                "Sufficient for the day is its own trouble.","",""));
        verse.add(new Verse("Proverbs 3:5-6 ","Trust in the Lord with all your heart, and do not lean on your own understanding. " +
                "In all your ways acknowledge him, and he will make straight your paths.","",""));
        verse.add(new Verse(" Colossians 3:15","And let the peace of Christ rule in your hearts, to " +
                "which indeed you were called in one body. And be thankful.","",""));
        verse.add(new Verse("Hebrews 11:1","Now faith is the assurance of things hoped for, " +
                "the conviction of things not seen.","",""));
        verse.add(new Verse("Psalm 94:19","When the cares of my heart are many, your consolations cheer my soul.","",""));

        VerseAdapter adapter = new VerseAdapter(this, verse);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
