package com.example.dynam.menuhansoban;

import android.app.Application;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Tsunderella on 05-01-2016.
 */
public class MyApp extends Application{
    public ArrayList<MenuTemple> globalarray = new ArrayList<MenuTemple>();
    Integer prueba=700;
    public ListView list1;
    public CustomAdapter adapter;
    public Integer flag=1;
    public ArrayList<MenuTemple> getArray(){

        return globalarray;
    }
    public Integer getPrueba(){
        return prueba;
    }
    public void setArray (ArrayList<MenuTemple> array){

        this.globalarray=array;
    }
    public void setPrueba(Integer i){

        this.prueba=i;
    }

}