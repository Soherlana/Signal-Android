package org.thoughtcrime.securesms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.thoughtcrime.securesms.conversation.ConversationFragment;

import java.util.List;

public class StarredMessageActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<StarredMessage> starredMessages;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starred_message);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        starredMessages = ConversationFragment.GetListStarredMessage();

        TextAdapter textAdapter = new TextAdapter(starredMessages);
        recyclerView.setAdapter(textAdapter);

    }

}