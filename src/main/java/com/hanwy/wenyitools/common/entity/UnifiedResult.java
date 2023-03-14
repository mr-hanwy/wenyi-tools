package com.hanwy.wenyitools.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 统一返回结果对象
 *
 * @author hanwy
 * @date 2023/3/9
 */
@Data
public class UnifiedResult implements Serializable {
    private static final long serialVersionUID = 837923105540872729L;

    /**
     * 结果码，默认：200-成功、500-失败、400-参数有误
     */
    private long code;

    /**
     * 提示消息
     */
    private String msg;

    /**
     * 返回数据
     */
    private Object data;

    public UnifiedResult() {
        this.code = 200;
        this.msg = "操作成功！";
    }

    /**
     * 操作成功，无返回数据
     *
     * @return 统一返回结果对象 {@link UnifiedResult}
     */
    public static UnifiedResult successful() {
        return successful(null);
    }

    /**
     * 操作成功，并返回数据
     *
     * @param data 返回数据对象
     *
     * @return 统一返回结果对象 {@link UnifiedResult}
     */
    private static UnifiedResult successful(Object data) {
        UnifiedResult result = new UnifiedResult();
        result.setData(data);
        return result;
    }

    /**
     * 操作失败
     *
     * @return 统一返回结果对象 {@link UnifiedResult}
     */
    private static UnifiedResult failed() {
        return failed("操作失败！");
    }

    /**
     * 操作失败，并自定义提示消息
     *
     * @param msg 提示消息
     *
     * @return 统一返回结果对象 {@link UnifiedResult}
     */
    private static UnifiedResult failed(String msg) {
        UnifiedResult result = new UnifiedResult();
        result.setCode(500);
        result.setMsg(msg);
        return result;
    }
}