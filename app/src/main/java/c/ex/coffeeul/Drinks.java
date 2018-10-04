package c.ex.coffeeul;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

public class Drinks {


    private String name;
    private String desc;
    private int imageID;


    public static  final  Drinks[] drinks={

            new Drinks("Latte","Professionaalide poolt tehtud mõnus hea Latte",R.drawable.o),
            new Drinks("Cappuccino","Professionaalide poolt tehtud mõnus hea Cappuccino",R.drawable.u),
            new Drinks("Expresso","Professionaalide poolt tehtud mõnus hea Expresso",R.drawable.n)




    };
    private Drinks(String name,String des,int imageID){


        this.name=name;
        this.desc=desc;
        this.imageID=imageID;
    }

    public String getDesc() {
        return desc;
    }
    public String getName()
    {
        return name;
    }

    public int getImageID()
    {
        return imageID;
    }




    public String toSting()
    {
        return this.name;
    }

}
