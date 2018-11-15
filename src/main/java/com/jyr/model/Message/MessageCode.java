package com.jyr.model.Message;

/**
 * @Author: Jiang
 * @Date: Created in 10:07  2018\11\15 0015
 * @Description:
 * @Modified By:
 */
public enum MessageCode {
    SUCCESS("成功", 0),
    NORMAL_ERROR("普通错误", 1),
    SYS_ERROR("系统异常", 10000),
    SERVICE_ERROR("业务异常", 20000),
    SESSION_INVALID("用户登录信息已失效，请刷新页面或重新登录", 20001),
    INVALID_DATA("非法数据", 30000),
    ACCESS_FORBIDDEN("禁止访问", 40000);

    private String name;
    private Integer value;

    private MessageCode(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public Integer getValue() {
        return this.value;
    }
}
