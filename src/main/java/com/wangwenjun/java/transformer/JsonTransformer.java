package com.wangwenjun.java.transformer;

import com.google.gson.Gson;
import spark.ResponseTransformer;

/**
 * This class is used for transform java object to json data format
 */
public class JsonTransformer implements ResponseTransformer
{
    /**
     * use google Gson
     */
    private Gson gson = new Gson();

    @Override
    public String render(Object model)
    {
        return gson.toJson(model);
    }
}
