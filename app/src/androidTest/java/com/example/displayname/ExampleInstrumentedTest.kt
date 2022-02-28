package com.example.displayname

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withText


import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(HomeActivity::class.java)
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.displayname", appContext.packageName)
    }
    @Test
    fun checkValuesPassedFormHomeActivityToMainActivity()
    {
        onView(withId(R.id.userName)).perform(typeText("mani"))
        onView(withId(R.id.age)).perform(typeText("88"))
        onView(withId(R.id.email)).perform(typeText("mani@gmail.com"))
        onView(withId(R.id.phoneNumber)).perform(typeText("123456"))

        onView(withId(R.id.confirm_button)).perform(click())

        onView(withId(R.id.phoneNumberCell)).check(matches(withText("123456")))
        onView(withId(R.id.ageCell)).check(matches(withText("88")))
        onView(withId(R.id.userNameCell)).check(matches(withText("mani")))
        onView(withId(R.id.emailCell)).check(matches(withText("mani@gmail.com")))

    }
}