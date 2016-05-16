package com.example.administrator.ku.util;

/**
 * Created by Administrator on 2016/5/15.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
