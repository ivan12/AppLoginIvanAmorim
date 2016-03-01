package br.com.ivanamorim.www.loginappivanamorim;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ivan on 26/02/2016.
 */
public class SignUp extends Activity {

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void onSignUpClick(View v)
    {
        if(v.getId()== R.id.Bsignupbutton)
        {
            EditText uname = (EditText)findViewById(R.id.TFuname);
            EditText pass1 = (EditText)findViewById(R.id.TFpass1);
            EditText pass2 = (EditText)findViewById(R.id.TFpass2);

            String unamestr = uname.getText().toString();
            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();

            if(!pass1str.equals(pass2str))
            {
                Toast pass = Toast.makeText(SignUp.this , "Senhas diferentes!!" , Toast.LENGTH_SHORT);
                pass.show();
            }
            else
            {
                Usuario c = new Usuario();
                c.setUname(unamestr);
                c.setPass(pass1str);

                helper.insertContact(c);
            }

        }

    }


}
