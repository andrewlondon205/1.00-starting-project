package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @Disabled("Don't run this test until the API is fully fixed")
    public void basicTest () {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testForWindowsOnly () {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.MAC)
    public void testForMacOnly () {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs({OS.MAC,OS.WINDOWS})
    public void testForMacAndWindowsOnly () {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    public void testForLinuxOnly () {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnJre(JRE.JAVA_18)
    public void testForJava18 () {
        // execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_13, max=JRE.JAVA_18)
    public void testOnlyForJavaRange () {
        // execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_11)
    public void testOnlyForJavaRangeMin () {
        // execute method and perform asserts
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "LUV2CODE_ENV",matches = "DEV")
    public void testOnlyForDevEnvinronment () {
        // execute method and perform asserts
    }

    @Test
    @EnabledIfSystemProperty(named = "LUV2CODE_SYS_PROP",matches = "CI_CD_DEPLOY")
    public void testOnlyForSystemProperty () {
        // execute method and perform asserts
    }

}
