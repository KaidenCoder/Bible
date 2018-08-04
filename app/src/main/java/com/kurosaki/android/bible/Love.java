package com.kurosaki.android.bible;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Love extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verse_list);

        final ArrayList<Verse> verse = new ArrayList<Verse>();
        verse.add(new Verse("Romans 5:8 ","But God demonstrates" +
                " his own love for us in this: While we were still sinners, Christ " +
                "died for us.","",""));
        verse.add(new Verse("Psalm 86:15","But you, O Lord, are a " +
                "compassionate and gracious God, slow to anger, abounding in love and " +
                "faithfulness.","",""));
        verse.add(new Verse("1 Corinthians 16:14","Let all that you do be done in love.","",""));
        verse.add(new Verse("John 13:34-35","So now I am giving you a " +
                "new commandment: Love each other.  Just as I have loved you, you should " +
                "love each other.  Your love for one another will prove to the world that" +
                " you are my disciples.","",""));
        verse.add(new Verse("1 John 4:18-19","There is no fear in love. " +
                "But perfect love drives out fear, because fear has to do with punishment.  " +
                "The one who fears is not made perfect in love.  We love because He first " +
                "loved us.","",""));
        verse.add(new Verse("1 Corinthians 13:13","So now faith, hope, and love " +
                "abide, these three; but the greatest of these is love.","",""));
        verse.add(new Verse("John 14:15","If you love me, you will obey what I command.","",""));
        verse.add(new Verse("1 Corinthians 13:4-7","Love is patient, love is kind. It does not envy, it does not boast," +
                " it is not proud.  It is not rude, it is not self-seeking, it is not easily angered, it keeps no record of wrongs.  " +
                "Love does not delight in evil but rejoices with the truth.  It always protects, always trusts, always hopes, always perseveres.  " +
                "Love never fails…","",""));
        verse.add(new Verse("Joshua 22:5","But be very careful…to love the Lord your God, to walk in all his ways, to obey his commands, " +
                "to hold fast to him and to serve him with all your heart and all your soul.","",""));
        verse.add(new Verse("1 Timothy 1:7","For God did not give us a spirit of timidity, " +
                "but a spirit of power, of love, and of self-discipline.","",""));

        VerseAdapter adapter = new VerseAdapter(this, verse);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
