package com.xsx.javase.bank7;

/**
 * @author xsx
 * @create 2020-06-10-11:19
 *
 * 自定义异常类
 */
public class OverdraftException extends RuntimeException{

    //序列化
    private static final long serialVersionUID = 1l;

    private double deficit;

    public double getDeficit() {
        return deficit;
    }

    public OverdraftException(String msg,double deficit) {
        super(msg);
        this.deficit = deficit;
    }
}
