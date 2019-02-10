package top.gtf35.beautifyutils.api.tencent.entity.search;

import com.google.gson.annotations.SerializedName;

public class Action {
    private int alert;

    private int icons;

    private int msg;

    @SerializedName("switch")
    private int mSwitch;

    public void setAlert(int alert){
        this.alert = alert;
    }
    public int getAlert(){
        return this.alert;
    }
    public void setIcons(int icons){
        this.icons = icons;
    }
    public int getIcons(){
        return this.icons;
    }
    public void setMsg(int msg){
        this.msg = msg;
    }
    public int getMsg(){
        return this.msg;
    }
    public void setSwitch(int mSwitch){
        this.mSwitch = mSwitch;
    }
    public int getSwitch(){
        return this.mSwitch;
    }

}