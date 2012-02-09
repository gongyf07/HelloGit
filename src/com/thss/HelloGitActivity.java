package com.thss;

import android.app.Activity;
import android.os.Bundle;
/**
 * 
 * @author sjf
 *
 */
public class HelloGitActivity extends Activity {
    
	int test;
	int newww;//int hahaha should be conflict
	int hha2;
	
	String a = "this line should be merged";
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}