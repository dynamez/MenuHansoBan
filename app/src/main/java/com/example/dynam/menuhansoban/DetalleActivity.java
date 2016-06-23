package com.example.dynam.menuhansoban;

import android.os.Bundle;

/**
 * Created by dynam on 11-11-2015.
 */
public class DetalleActivity extends BaseActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle parameters = getIntent().getExtras();
        super.onCreate(savedInstanceState);
        setContentView(parameters.getInt("imagen"));
    }

}
