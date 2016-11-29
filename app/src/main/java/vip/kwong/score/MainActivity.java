package vip.kwong.score;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView scoreA;
    TextView scoreB;
    int numA=0;
    int numB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusA (View view){
        scoreA=(TextView)findViewById(R.id.scoreA_tv);
        numA=numA+1;
        scoreA.setText(""+numA);

    }

    public void rest (View view){
        scoreA=(TextView)findViewById(R.id.scoreA_tv);
        numA=0;
        scoreA.setText(""+numA);
        scoreB=(TextView)findViewById(R.id.scoreB_tv);
        numB=0;
        scoreB.setText(""+numB);
    }

    public void plusB (View view){
        scoreB=(TextView)findViewById(R.id.scoreB_tv);
        numB=numB+1;
        scoreB.setText(""+numB);
    }

    public void restB (View view){

    }




}
