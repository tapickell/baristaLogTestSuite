package me.toddpickell.baristalogtest;

import com.jayway.android.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;
import me.toddpickell.baristalog.MainActivity;
import cucumber.annotation.*;
import cucumber.annotation.en.*;

//import org.junit.Assert.assertEquals;

public class baristalogstepdefs extends
ActivityInstrumentationTestCase2<MainActivity> {
	
	private Solo solo;
	
	public baristalogstepdefs() {
		super(MainActivity.class);
	}

	@Before
	public void setUp() {
		solo = new Solo(getInstrumentation(), getActivity());
	}
}
