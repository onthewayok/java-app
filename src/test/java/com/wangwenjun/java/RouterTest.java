package com.wangwenjun.java;

import org.junit.After;
import org.junit.Before;

import static spark.Spark.awaitInitialization;
import static spark.Spark.stop;

public class RouterTest
{
    @Before
    public void setUp() throws Exception
    {
        Routers.establishRoutes();
        awaitInitialization();
    }

    @After
    public void tearDown() throws Exception
    {
        stop();
    }
}
