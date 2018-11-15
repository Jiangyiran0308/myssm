package com.jyr.model.Message;

/**
 * @Author: Jiang
 * @Date: Created in 9:06  2018\11\15 0015
 * @Description:
 * @Modified By:
 */
public class SimpleMessage {
    MessageCode code ;
    private Object data ;
    private String level ;
    private String message ;
    private boolean showFlag ;

    private SimpleMessage(MessageCode code,MessageLevel level , Object data ,String message ,boolean showMessageFlag){
        this.code = code ;
        this.data = data ;
        this.level = level.getValue();
        if(message.equals("")){
            this.message = code.getName();
        }else
            this.message = message ;
        this.showFlag = showMessageFlag ;
    }

    private SimpleMessage(MessageCode code,MessageLevel level ,String message,boolean showMessageFlag){
        this.code = code ;
        this.level = level.getValue();
        if(message.equals("")){
            this.message = code.getName();
        }else
            this.message = message ;
        this.showFlag = showMessageFlag ;
    }

//    成功消息  弹框
    public static SimpleMessage success(String message){
        return new SimpleMessage(MessageCode.SUCCESS,MessageLevel.SUCCESS, message, true);
    }
//    普通消息 弹框
    public static SimpleMessage info(String message){
        return new SimpleMessage(MessageCode.SUCCESS, MessageLevel.INFO,message,true);
    }
//    普通数据 不弹框
    public static SimpleMessage info(Object data){
        return new SimpleMessage(MessageCode.SUCCESS,MessageLevel.INFO,data,"",false);
    }
//    普通数据 弹框
    public static SimpleMessage info(String message, Object data){
        return new SimpleMessage(MessageCode.SUCCESS,MessageLevel.INFO,data,message,true);
    }

    public static SimpleMessage warn(String message){
        return new SimpleMessage(MessageCode.NORMAL_ERROR, MessageLevel.WARN,message,true);
    }

    public static SimpleMessage warn(Object data){
        return new SimpleMessage(MessageCode.NORMAL_ERROR,MessageLevel.WARN,data,"",false);
    }

    public static SimpleMessage warn(String message, Object data){
        return new SimpleMessage(MessageCode.NORMAL_ERROR,MessageLevel.WARN,data,message,true);
    }

    public static SimpleMessage error(String message){
        return new SimpleMessage(MessageCode.SYS_ERROR, MessageLevel.ERROR,message,true);
    }

    public static SimpleMessage error(Object data){
        return new SimpleMessage(MessageCode.SYS_ERROR,MessageLevel.ERROR,data,"",false);
    }

    public static SimpleMessage error(String message, Object data){
        return new SimpleMessage(MessageCode.SYS_ERROR,MessageLevel.ERROR,data,message,true);
    }

    public String getLevel() {
        return this.level;
    }

    public boolean isshowFlag() {
        return this.showFlag;
    }

    public Object getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public MessageCode getCode() {
        return this.code;
    }
}
