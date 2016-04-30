package com.example.android.verdadoreto;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.net.URI;
import java.util.Random;

public class Main2Activity extends ActionBarActivity {
    private Preguntas pr = new Preguntas();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.asercade:
                Intent i = new Intent(this, tercerActivity.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    public String prAle() {
        Random r = new Random();
        String cad="";
        int ax = r.nextInt(15);
        cad = pr.res(ax);
        return cad;
    }


    public void verdad(View v) {
        String otro = prAle();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, otro);
        intent.putExtra(Intent.EXTRA_STREAM, Uri.parse(otro));
        startActivity(intent);
        //intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        //intent.setType("text");
        //intent.putExtra(Intent.EXTRA_SUBJECT, "Orden de Just Java para: ");
        //intent.putExtra(Intent.EXTRA_TEXT, otro);
        //startActivity(intent);
    }
    public void reto(View v) {
        String otro = prAle();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, otro);
        intent.putExtra(Intent.EXTRA_STREAM, Uri.parse(otro));
        //Intent intent = new Intent(Intent.ACTION_SENDTO);
        //intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        //intent.putExtra(Intent.EXTRA_SUBJECT, "Orden de Just Java para: ");
        //intent.putExtra(Intent.EXTRA_TEXT, otro);
        startActivity(intent);


    }
}

