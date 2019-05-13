package com.wangwenjun.java.pojo;

/**
 * The Greeting is a simple pojo
 */
public class Greeting
{
    /**
     * the field of id.
     */
    private int id;

    /**
     * the field of content
     */
    private String content;

    public Greeting(int id, String content)
    {
        this.id = id;
        this.content = content;
    }

    public int getId()
    {
        return id;
    }

    public String getContent()
    {
        return content;
    }
}
