package com.ericpalmer.myandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class mpesapage extends AppCompatActivity {
    private ListView mpesaList;
    private Spinner spinnerNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpesapage);

        mpesaList=findViewById(R.id.mpesaItemsListView);
        spinnerNames=findViewById(R.id.namesSpinner);

        mpesaItemsList();
        squadNames();
    }

    private void squadNames() {
        ArrayList <String> names=new ArrayList<>();
        names.add("Eric");
        names.add("Palmer");
        names.add("Yaich");
        names.add("LordRaiden");
        names.add("SubZero");

        ArrayAdapter <String> namesAdapter=new ArrayAdapter<>(
          this,
          android.R.layout.simple_spinner_dropdown_item,
          names
        );
        spinnerNames.setAdapter(namesAdapter);
      spinnerNames.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override
          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              Toast.makeText(mpesapage.this, names.get(position) + " selected", Toast.LENGTH_SHORT).show();
              //startActivity(new Intent(getApplicationContext(),MainActivity.class));
          }

          @Override
          public void onNothingSelected(AdapterView<?> parent) {

          }
      });

    }


    private void mpesaItemsList() {
        final ArrayList <String> items=new ArrayList<>();
        items.add("Send Money");
        items.add("Withdraw Cash");
        items.add("Buy Airtime");
        items.add("Loans and Savings");
        items.add("Lipa na Mpesa");
        items.add("My Account");

        ArrayAdapter<String> itemsAdapter=new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                items
        );
        mpesaList.setAdapter(itemsAdapter);

        mpesaList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(mpesapage.this, items.get(position) + " selected", Toast.LENGTH_SHORT).show();
               if (position==0){
                   startActivity(new Intent(getApplicationContext(),Send_money.class));
                   Toast.makeText(mpesapage.this, items.get(position)+ " selected", Toast.LENGTH_SHORT).show();
               }
               else if (position==1){
                   startActivity(new Intent(getApplicationContext(),Send_money.class));
                   Toast.makeText(mpesapage.this, items.get(position)+ " selected", Toast.LENGTH_SHORT).show();
               }
               else if (position==2){
                   startActivity(new Intent(getApplicationContext(),Send_money.class));
                   Toast.makeText(mpesapage.this, items.get(position)+ " selected", Toast.LENGTH_SHORT).show();
               }
               else if (position==3){
                   startActivity(new Intent(getApplicationContext(),Send_money.class));
                   Toast.makeText(mpesapage.this, items.get(position)+ " selected", Toast.LENGTH_SHORT).show();
               }
               else if (position==4){
                   startActivity(new Intent(getApplicationContext(),Send_money.class));
                   Toast.makeText(mpesapage.this, items.get(position)+ " selected", Toast.LENGTH_SHORT).show();
               }
               else if (position==5){
                   startActivity(new Intent(getApplicationContext(),Send_money.class));
                   Toast.makeText(mpesapage.this, items.get(position)+ " selected", Toast.LENGTH_SHORT).show();
               }
               else {
                   Toast.makeText(mpesapage.this, "Invalid option", Toast.LENGTH_SHORT).show();
               }

            }
        });
    }
}