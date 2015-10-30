package com.example.lucas.helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import java.lang.reflect.Array;
//import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    //private Button createName, sayHello;
    private EditText userNameInput;
    private EditText userAgeInput;
    public Boolean checked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //createName = (Button) findViewById(R.id.buttonSubmit);
        //sayHello = (Button) findViewById(R.id.clickMe);
        userNameInput = (EditText) findViewById(R.id.editText);
        userAgeInput = (EditText) findViewById(R.id.ageInput);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void whenClicked(View view) {
        if (checked == true){

        }
        String usersName = String.valueOf(userNameInput.getText());
        Integer usersAge = Integer.valueOf(String.valueOf(userAgeInput.getText()));
        Integer length = usersName.length();
        Character last = usersName.charAt(length - 1);
        char[] consonants = {'a', 'e', 'i', 'o', 'u'};
        String proword;
        boolean contains = false;

        for (char c  : consonants){
            if (c == last){
                contains = true;
                break;
            }
        }
        if (contains) {
            usersName = usersName + "zzle";
        }
        else if (last == 'y'){
            usersName = usersName + "azzle";
        }
        else{
            usersName = usersName + "azzizzle";
        }
        if (usersAge < 16){
            proword = "yung";
        }
        else if ((15 < usersAge) && (usersAge < 32)) {
            proword = "ma homie";
        }
        else if((31 < usersAge) && (usersAge < 59)){
            proword = "mista";
        }
        else {
            proword = "sir";
        }
        String response = "Wassup " + proword + " " + usersName;
        Toast.makeText(this,response, Toast.LENGTH_LONG).show();
    }


    public void clickMe(View view) {
        Toast.makeText(this,"hello", Toast.LENGTH_SHORT).show();
    }

    public void checkMe(View view) {
        checked = true;
    }
}
