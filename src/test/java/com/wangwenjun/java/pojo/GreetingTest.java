package com.wangwenjun.java.pojo;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class GreetingTest
{

    private Greeting greeting;

    @Before
    public void setUp()
    {
        this.greeting = new Greeting(1, "Hello");
    }

    @Test
    public void testNotNull()
    {
        assertThat(greeting, notNullValue());
    }

    @Test
    public void testGetId()
    {
        assertThat(1, equalTo(this.greeting.getId()));
    }

    @Test
    public void testGetContent()
    {
        assertThat("Hello", equalTo(this.greeting.getContent()));
    }

    @Test
    public void simpleTest()
    {
        assertThat(true, equalTo(true));
    }

    @Test
    public void mockTest()
    {
        assertThat(true, equalTo(true));
    }
}