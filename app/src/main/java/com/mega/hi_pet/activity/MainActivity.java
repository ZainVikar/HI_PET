package com.mega.hi_pet.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mega.hi_pet.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import lecho.lib.hellocharts.view.LineChartView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.llFeed)
    LinearLayout llFeed;
    @BindView(R.id.imgIndicator)
    ImageView imgIndicator;
    @BindView(R.id.tvFeed)
    TextView tvFeed;
    @BindView(R.id.tvFeedInfo)
    TextView tvFeedInfo;
    @BindView(R.id.llIndicator)
    LinearLayout llIndicator;
    @BindView(R.id.tvIndicator)
    TextView tvIndicator;
    @BindView(R.id.chart)
    LineChartView chart;
    @BindView(R.id.tvLastUpdate)
    TextView tvLastUpdate;
    @BindView(R.id.tvDetail)
    TextView tvDetail;
    @BindView(R.id.tvSchedule)
    TextView tvSchedule;
    @BindView(R.id.tvAlarm)
    TextView tvAlarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tvDetail)
    public void detail() {
        Intent in = new Intent(MainActivity.this, RFIDHistoryActivity.class);
        startActivity(in);
    }
}
