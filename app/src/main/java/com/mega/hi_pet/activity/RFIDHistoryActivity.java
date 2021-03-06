package com.mega.hi_pet.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.mega.hi_pet.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RFIDHistoryActivity extends AppCompatActivity {

    @BindView(R.id.rvHistory)
    RecyclerView rvHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rfidhistory);
        ButterKnife.bind(this);
    }
}
