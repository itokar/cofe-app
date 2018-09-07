package com.example.j.javajust1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int Quntaty = 0;
    int NumberOfCoffe = 10;

    //*** THIS MATHORD FOR THE TEXT QUNTYTY //

    public void  display(int number){
        TextView quntyy = (TextView)findViewById(R.id.quantity);
        quntyy.setText(number);

    }
   // ** THE MATHORD FOR THE TEXT PRICE //
    public void displayPrice(int number){
        TextView textprice = (TextView)findViewById(R.id.price_text_view);
        textprice.setText(NumberFormat.getCurrencyInstance().format(number));

    }

    ///** THE MATHOSD FOR THE TEXT PRICE STRING //

      public void displaymassage (String massage ){
         TextView massage1 = (TextView)findViewById(R.id.price_text_view);


      }

    public void orderview(View view) {
        String massage12 = "Total:" + "$" + (NumberOfCoffe * Quntaty );
        massage12 = massage12 + "\nThank you ";
        display(Quntaty);
         displaymassage(massage12);
    }

    public void increment12(View view) {

        display(Quntaty);
        Quntaty = Quntaty + 1;


    }

    public void decremeant12(View view) {
        display(Quntaty);
        Quntaty = Quntaty - 1;
    }
}
