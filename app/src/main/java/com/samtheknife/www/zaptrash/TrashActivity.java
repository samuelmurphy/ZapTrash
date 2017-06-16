package com.samtheknife.www.zaptrash;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static com.samtheknife.www.zaptrash.R.id.parent;

public class TrashActivity extends AppCompatActivity {

        public final static String EL_MSG = "com.samtheknife.www.zaptrash.zzz_text";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trash);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FusedLocationProviderClient client = LocationS

        sendTest();
         Button but2 = (Button) findViewById(R.id.button2);
        but2.setText("FOOOO");
    }

    @Override
    public  Dialog onCreateDialog(int id) {
        return super.onCreateDialog(id);
    }

    public  void sendTest(){
        Button butt = (Button) findViewById(R.id.button2);
        butt.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        FirebaseDatabase db = FirebaseDatabase.getInstance();

                                       DatabaseReference dref =  db.getReference();
                                        dref.child("samtest5").setValue("rrrrzzzz");

                                      TextView tt= (TextView) findViewById(R.id.textView2);
                                        tt.setText("sent message to firebase xxx");
                                    }
                                }


        );

    }
    //
//        EditText editText = (EditText) findViewById(R.id.editText);
//
//        editText.setText("XXXXXXXXXXXXXXXX");
//        editText.setOnFocusChangeListener(new OnFocusChangeListener() {
//                                              @Override
//                                              public void onFocusChange(View v, boolean hasFocus) {
//                                                  editText.setText(R.string.zzz_text);
//                                              }
//                                          }
//        );



    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        final EditText editText = (EditText) findViewById(R.id.editText);

        String  message = editText.getText().toString();
        Intent intent1 = intent.putExtra(EL_MSG, message);

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_trash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
