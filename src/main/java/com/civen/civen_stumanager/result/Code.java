package com.civen.civen_stumanager.result;

public enum Code {

    SUCCESS(20000),
    
    FAILED(60204);
    private int code;
    Code(int code){
        this.code = code;
    }
    public int getCode(){
        return this.code;
    }

}
