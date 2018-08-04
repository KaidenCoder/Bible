package com.kurosaki.android.bible;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Hope extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verse_list);

        final ArrayList<Verse> verse = new ArrayList<Verse>();
        verse.add(new Verse("Jeremiah 29:11 ","For I know the plans I have for you, declares the Lord, " +
                "plans for welfare and not for evil, to give you a future and a hope. ","",""));
        verse.add(new Verse(" Jeremiah 29:11","For I know the plans I have for you, declares the Lord, " +
                "plans for welfare and not for evil, to give you a future and a hope.","",""));
        verse.add(new Verse("Romans 15:13","May the God of hope fill you with all joy and peace in believing," +
                " so that by the power of the Holy Spirit you may abound in hope.","",""));
        verse.add(new Verse("Romans 12:12","Rejoice in hope, be patient in tribulation, be constant in prayer.","",""));
        verse.add(new Verse("Romans 5:2-5 ","Through him we have also obtained access by faith into this grace " +
                "in which we stand, and we rejoice in hope of the glory of God. More than that, we rejoice in our sufferings, knowing " +
                "that suffering produces endurance, and endurance produces character, and character produces hope, and hope does not put us " +
                "to shame, because God's love has been poured into our hearts through the Holy Spirit who has been given to us.","",""));
        verse.add(new Verse("Isaiah 40:31","But they who wait for the Lord shall renew their strength; they shall mount up with wings" +
                " like eagles; they shall run and not be weary; they shall walk and not faint.","",""));
        verse.add(new Verse("Hebrews 11:1","Now faith is the assurance of things hoped for, the conviction of things not seen.","",""));
        verse.add(new Verse("Proverbs 24:14","Know that wisdom is such to your soul; if you find it, there will be " +
                "a future, and your hope will not be cut off.","",""));
        verse.add(new Verse("Romans 8:25 ","But if we hope for what we do not see, we wait for it with patience.","",""));
        verse.add(new Verse("2 Corinthians 4:16-18 ","So we do not lose heart. Though our outer self is wasting away, " +
                "our inner self is being renewed day by day. For this light momentary affliction is preparing for us an eternal weight of " +
                "glory beyond all comparison, as we look not to the things that are seen but to the things that are unseen. For the things that " +
                "are seen are transient, but the things that are unseen are eternal.","",""));
        verse.add(new Verse("Hebrews 10:23","Let us hold fast the confession of our hope without wavering, for he who promised is faithful.","",""));

        VerseAdapter adapter = new VerseAdapter(this, verse);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
