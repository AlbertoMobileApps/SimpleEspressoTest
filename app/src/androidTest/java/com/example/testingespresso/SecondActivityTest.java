package com.example.testingespresso;

/**
 * Created by Albrtx on 26/11/2017.
 */

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class SecondActivityTest {

    @Rule
    // third parameter is set to false which means the activity is not started automatically
    public ActivityTestRule<SecondActivity> rule =
            new ActivityTestRule(SecondActivity.class, true, false);

    @Test
    public void demonstrateIntentPrep() {
        Intent intent = new Intent();
        intent.putExtra("EXTRA", "Test");
        rule.launchActivity(intent);
        onView(withId(R.id.resultView)).check(matches(withText("Test")));
    }
}
