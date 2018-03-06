package com.amritha.acadgild.android_session6_assignment1;

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


/**
 * Created by Amritha on 3/6/18.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginScreenTest {

    //During Test,calling ActivityTestRule.getActivity()

    @Rule
    public ActivityTestRule<MainActivity> mLoginActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void clickLoginButton_showsSuccessScreenAfterLogin() {

        //checking with dummy email and password

        String Email = "username@email.com";
        String Password = "password";

        //type in email
        onView(withId(R.id.email)).perform(typeText(Email), closeSoftKeyboard());

        //type in password
        onView(withId(R.id.password)).perform(typeText(Password), closeSoftKeyboard());

        //click on login button
        onView(withId(R.id.button_login)).perform(click());

    }

}
