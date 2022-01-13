package com.ericpalmer.myandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {
    private CheckBox city,united,chelsea,liverpool;
    private RadioGroup rgmaritalStatus;
    private ProgressBar loadingBar;
    private MaterialCardView materialCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        city=findViewById(R.id.checkboxCity);
        united=findViewById(R.id.checkboxUnited);
        chelsea=findViewById(R.id.checkboxChelsea);
        liverpool=findViewById(R.id.checkboxLiverpool);
        rgmaritalStatus=findViewById(R.id.rgMaritalStatus);
        loadingBar=findViewById(R.id.progress_horizontal);
        materialCardView=findViewById(R.id.cardviewLogin);

       city();
       united();
       chelsea();
       liverpool();
       maritalStatus();
       progressBar();
       CardView();
    }

    private void CardView() {
        materialCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),mpesapage.class));
            }
        });

    }

    private void progressBar() {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++){
                    loadingBar.incrementProgressBy(5);
                    SystemClock.sleep(500);//use systemclock instead of thread to avoid the try and catch block
                }
            }
        });
        thread.start();
        loadingBar.getProgress();
    }

    private void maritalStatus() {
        rgmaritalStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbMarried:
                        Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbSingle:
                        Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbInaRelationship:
                        Toast.makeText(MainActivity.this, "In a relationship", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });
    }

    private void liverpool() {
        liverpool.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Liverpool", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Support Liverpool", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void chelsea() {
        chelsea.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Chelsea", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Support Chelsea", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void united() {
        united.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Man United", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Support United", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void city() {
        city.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Man City", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Support Man City", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}