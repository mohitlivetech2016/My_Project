package com.my_company.my_project.framework.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.my_company.my_project.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();

        if(id==R.id.id_icon_contact){

            return true;
        }
        if(id==R.id.id_icon_edit){

            return true;
        }
        if(id==R.id.id_icon_mail){

            return true;
        }
        if(id==R.id.id_icon_share){

            return true;
        }
        if(id==R.id.id_icon_upload){

            return true;
        }


        return super.onOptionsItemSelected(item);

    }
}
