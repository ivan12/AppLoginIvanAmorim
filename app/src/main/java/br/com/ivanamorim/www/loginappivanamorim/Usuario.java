package br.com.ivanamorim.www.loginappivanamorim;

/**
 * Created by ivan on 26/02/2016.
 */
public class Usuario {
    String uname,pass;
    int id;

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return this.id;
    }

    public void setUname(String uname)
    {
        this.uname = uname;
    }
    public String getUname()
    {
        return this.uname;
    }

    public void setPass(String pass)
    {
        this.pass = pass;
    }
    public String getPass()
    {
        return this.pass;
    }

}
