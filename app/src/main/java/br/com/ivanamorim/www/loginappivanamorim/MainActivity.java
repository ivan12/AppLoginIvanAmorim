package br.com.ivanamorim.www.loginappivanamorim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ivan on 26/02/2016.
 */

public class MainActivity extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle instancia) {
        super.onCreate(instancia);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onButtonClick(View v)
    {
        if(v.getId() == R.id.Blogin)
        {
            EditText editTxtUser = (EditText)findViewById(R.id.TFusername);
            String str = editTxtUser.getText().toString();

            EditText editTxtPass = (EditText)findViewById(R.id.TFpassword);
            String pass = editTxtPass.getText().toString();

            String passwd = helper.searchPass(str);
            if(pass.equals(passwd))
            {
                Intent i = new Intent(MainActivity.this, Display.class);
                i.putExtra("Username",str);
                startActivity(i);
            }
            else
            {
                Toast temp = Toast.makeText(MainActivity.this , "Username ou password incorretos!" , Toast.LENGTH_SHORT);
                temp.show();
            }

        }
        if(v.getId() == R.id.Bsignup)
        {
            Intent i = new Intent(MainActivity.this, SignUp.class);
            startActivity(i);

        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
