package com.nestlabs.sdk.models;

import android.os.Build;

import com.nestlabs.sdk.BuildConfig;
import com.nestlabs.sdk.models.Utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class UtilsAndroidTest {

    @Test
    public void testIsAnyEmptyWithNoArgs_shouldReturnFalse() {
        assertFalse(Utils.isAnyEmpty());
    }

    @Test
    public void testIsAnyEmptyWithEmptyArgs_shouldReturnTrue() {
        assertTrue(Utils.isAnyEmpty("", ""));
    }

    @Test
    public void testIsAnyEmptyWithNoEmptyArgs_shouldReturnFalse() {
        assertFalse(Utils.isAnyEmpty("not-empty", "also-not-empty"));
    }
}
