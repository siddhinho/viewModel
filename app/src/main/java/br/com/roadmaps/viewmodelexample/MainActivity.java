package br.com.roadmaps.viewmodelexample;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ScoreViewModel myViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);
        displayForTeamA(myViewModel.scoreTeamA);
        displayForTeamB(myViewModel.scoreTeamB);

    }

    public void displayForTeamA(int value){
        TextView textView = (TextView)findViewById(R.id.scoreTeamATextView);
        textView.setText("" + value);

    }

    public void displayForTeamB(int value){
        TextView textView = (TextView)findViewById(R.id.scoreTeamBTextView);
        textView.setText("" + value);
    }

    public void addOneForTeamA(View view) {
        myViewModel.scoreTeamA = myViewModel.scoreTeamA + 1;
        displayForTeamA(myViewModel.scoreTeamA);
    }

    public void addOneForTeamB(View view) {
        myViewModel.scoreTeamB = myViewModel.scoreTeamB + 1;
        displayForTeamB(myViewModel.scoreTeamB);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    
}
