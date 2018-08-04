package com.kurosaki.android.bible;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hope = findViewById(R.id.hope);
        // Set a click listener on that View
        hope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hopeIntent = new Intent(MainActivity.this, Hope.class);
                // Start the new activity
                startActivity(hopeIntent);
            }
        });

        TextView love = findViewById(R.id.love);
        // Set a click listener on that View
        love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loveIntent = new Intent(MainActivity.this, Love.class);
                // Start the new activity
                startActivity(loveIntent);
            }
        });

        TextView anxiety = findViewById(R.id.anxiety);
        // Set a click listener on that View
        anxiety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent anxietyIntent = new Intent(MainActivity.this, Anxiety.class);
                // Start the new activity
                startActivity(anxietyIntent);
            }
        });

        TextView fear = findViewById(R.id.fear);
        // Set a click listener on that View
        fear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fearIntent = new Intent(MainActivity.this, Fear.class);
                // Start the new activity
                startActivity(fearIntent);
            }
        });

        TextView depression = findViewById(R.id.depression);
        // Set a click listener on that View
        depression.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent depressionIntent = new Intent(MainActivity.this, Depression.class);
                // Start the new activity
                startActivity(depressionIntent);
            }
        });

        TextView feelings = findViewById(R.id.feelings);
        // Set a click listener on that View
        feelings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent feelingsIntent = new Intent(MainActivity.this, FeelingsHurt.class);
                // Start the new activity
                startActivity(feelingsIntent);
            }
        });

        TextView friendship = findViewById(R.id.friendship);
        // Set a click listener on that View
        friendship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent friendshipIntent = new Intent(MainActivity.this, Friendship.class);
                // Start the new activity
                startActivity(friendshipIntent);
            }
        });

        TextView diligence = findViewById(R.id.diligence);
        // Set a click listener on that View
        diligence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent diligenceIntent = new Intent(MainActivity.this, Diligence.class);
                // Start the new activity
                startActivity(diligenceIntent);
            }
        });
    }
}
