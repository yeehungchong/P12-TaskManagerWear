package com.yeehungchong.p13_taskmanagerwear;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.RemoteInput;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ReplyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reply);


        CharSequence reply = null;
        Intent intent = getIntent();
        Bundle remoteInput = RemoteInput.getResultsFromIntent(intent);
        if (remoteInput != null){
            reply = remoteInput.getCharSequence("status");
        }

        if(reply != null){
            DBHelper dbHelper = new DBHelper(ReplyActivity.this);
            int id = intent.getIntExtra("id", 0);
            dbHelper.deleteTask(id);
            dbHelper.close();
            Toast.makeText(ReplyActivity.this, "Task Deleted",
                    Toast.LENGTH_SHORT).show();
            Intent lvIntent = new Intent(ReplyActivity.this, MainActivity.class);
            startActivity(lvIntent);
        }

    }//end of onCreate
}//end of class