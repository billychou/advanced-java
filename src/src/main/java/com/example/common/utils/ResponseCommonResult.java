package com.example.common.utils;

import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.Response;

/**
 * 返回结果对象封装
 */
public class ResponseCommonResult<T> {
    /**
     * 是否正常
     */
    private boolean success;

    /**
     *  数据
     */
    private  T result;

    /**
     * 返回消息
     */
    private  String message;

    /**
     * handle success
     * @param <T>
     * @return
     */
    public static <T> ResponseCommonResult<T> success() {
        ResponseCommonResult<T> responseCommonResult = new ResponseCommonResult<>();
        responseCommonResult.setSuccess(true);
        return responseCommonResult;
    }

    /**
     * handler success with data
     * @param result
     * @param <T>
     * @return
     */
    public static <T> ResponseCommonResult<T> success(T result) {
        ResponseCommonResult<T> responseCommonResult = new ResponseCommonResult<>();
        responseCommonResult.setSuccess(true);
        responseCommonResult.setResult(result);
        return responseCommonResult;
    }

    /**
     * success
     * @param result
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ResponseCommonResult<T> success(T result, String message) {
        ResponseCommonResult<T> responseCommonResult = new ResponseCommonResult<>();
        responseCommonResult.setSuccess(true);
        responseCommonResult.setResult(result);
        responseCommonResult.setMessage(message);
        return responseCommonResult;
    }

    /**
     * fail
     * @return
     */
    public static <T> ResponseCommonResult<T> fail() {
        ResponseCommonResult<T> responseCommonResult = new ResponseCommonResult<>();
        responseCommonResult.setSuccess(false);
        return responseCommonResult;
    }

    /**
     *  fail message
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ResponseCommonResult<T> fail(String message) {
        ResponseCommonResult<T> responseCommonResult = new ResponseCommonResult<>();
        responseCommonResult.setSuccess(false);
        responseCommonResult.setMessage(message);
        return responseCommonResult;
    }

    /**
     * fail message
     * @param result
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ResponseCommonResult<T> fail(T result, String message) {
        ResponseCommonResult<T> responseCommonResult = new ResponseCommonResult<>();
        responseCommonResult.setSuccess(false);
        responseCommonResult.setMessage(message);
        responseCommonResult.setResult(result);
        return responseCommonResult;
    }

    /**
     * getter for success
     * @return
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * setter for success
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * setter for result
     * @return
     */
    public T getResult() {
        return result;
    }

    /**
     * getter for result
     * @param result
     */
    public void setResult(T result) {
        this.result = result;
    }

    /**
     * getter for  message
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * setter for message
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


}
