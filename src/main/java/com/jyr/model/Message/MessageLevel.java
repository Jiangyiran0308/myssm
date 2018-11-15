package com.jyr.model.Message;

/**
 * @Author: Jiang
 * @Date: Created in 9:14  2018\11\15 0015
 * @Description:
 * @Modified By:
 */
public enum MessageLevel {
    SUCCESS("成功消息", "success"),
    INFO("普通消息", "info"),
    WARN("警告消息", "warning"),
    ERROR("失败消息", "error");

    private String name;
    private String value;

    private MessageLevel(String name, String value) {
        this.name = name;
        this.value = value;
    }
    public String getName() {
        return this.name;
    }
    public String getValue() {
        return this.value;
    }
}
