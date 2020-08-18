package com.example.common.util;

/**
 * 业务处理统一模板,统一处理参数校验和异常处理
 * @author songchuan.zhou
 * @version 0.1
 */
public class ResponseManageTemplate {
    /**
     * 处理接口
     * @param <T>
     */
    public interface ITemplateCallback<T> {
        /**
         * 参数校验
         */
        void checkParams();

        /**
         * 执行业务
         * @return
         * @throws Exception
         */
        T doInvoke() throws Exception;

        /**
         * 处理异常
         * @return
         */
        T doFailed(String errorCode, String errMsg);
    }

    public static <T> T invoke(ITemplateCallback<T> callback) {
        try {
            callback.checkParams();
            return callback.doInvoke();
        } catch (Exception e) {
            return callback.doFailed("SYSTEM_ERROR", e.getMessage());
        }
    }
}
