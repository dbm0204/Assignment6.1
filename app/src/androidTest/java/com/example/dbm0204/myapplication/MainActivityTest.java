package com.example.dbm0204.myapplication;

/**
 * Created by dbm0204 on 7/18/17.
 */

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
// This method asserts the username of the login screen
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testResult() {
        onView(withId(R.id.username))
                .perform(typeText("Aakash"), closeSoftKeyboard());

        onView(withText("Test")).perform(click());

        onView(withId(R.id.tv_password))
                .check(matches(withText("Hello, Aakash!")));
    }
}
