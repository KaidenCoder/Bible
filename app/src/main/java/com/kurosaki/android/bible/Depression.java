package com.kurosaki.android.bible;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Depression extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verse_list);

        final ArrayList<Verse> verse = new ArrayList<Verse>();
        verse.add(new Verse("Philippians 4:6-7","Do not be anxious about anything, " +
                "but in everything by prayer and supplication with thanksgiving let your requests be made known to God. " +
                "And the peace of God, which surpasses all understanding, will guard your hearts and your minds in Christ Jesus. ",
                "",""));
        verse.add(new Verse("Psalm 34:17-18","When the righteous cry for help, the Lord hears and delivers " +
                "them out of all their troubles. The Lord is near to the brokenhearted and saves the crushed in spirit.","",""));
        verse.add(new Verse("Matthew 11:28","Come to me, all who labor and are heavy laden, and I will give you rest.","",""));
        verse.add(new Verse("Isaiah 41:10","Fear not, for I am with you; be not dismayed, for I am your God; I will strengthen you," +
                " I will help you, I will uphold you with my righteous right hand.","",""));
        verse.add(new Verse("1 Peter 5:7","Casting all your anxieties on him, " +
                "because he cares for you.","",""));
        verse.add(new Verse("Jeremiah 29:11","For I know the plans I have for you, declares the Lord, plans for welfare" +
                " and not for evil, to give you a future and a hope.","",""));
        verse.add(new Verse("Proverbs 3:5-6","Trust in the Lord with all your heart, and do not lean on your own understanding. " +
                "In all your ways acknowledge him, and he will make straight your paths.","",""));
        verse.add(new Verse(" Romans 12:2","Do not be conformed to this world, but be transformed by " +
                "the renewal of your mind, that by testing you may discern what is the will of God, what is good and acceptable and perfect.","",""));
        verse.add(new Verse("Psalm 9:9"," The Lord is a stronghold for the oppressed, a stronghold in times of trouble.","",""));
        verse.add(new Verse("John 10:10","The thief comes only to steal and kill and destroy. " +
                "I came that they may have life and have it abundantly.","",""));
        verse.add(new Verse("Deuteronomy 31:8","It is the Lord who goes before you. He will be with you; " +
                "he will not leave you or forsake you. Do not fear or be dismayed.","",""));

        VerseAdapter adapter = new VerseAdapter(this, verse);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
