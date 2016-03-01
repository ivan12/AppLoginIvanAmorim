package br.com.ivanamorim.www.loginappivanamorim;

/**
 * Created by ivan on 26/02/2016.
 */
public class Location {
    int id;
    int userId;
    String latitude;
    String longitude;

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return this.id;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }
    public int getUserId()

    {
        return this.userId;
    }

    public void setLatitude(String latitude)
    {
        this.latitude = latitude;
    }

    public String getLatitude()
    {
        return this.latitude;
    }

    public void setLongitude(String longitude)
    {
        this.longitude = longitude;
    }
    public String getLongitude()
    {
        return this.longitude;
    }
}
