package top.gtf35.beautifyutils.api.tencent.entity.search;
public class Pay {
    private int pay_down;

    private int pay_month;

    private int pay_play;

    private int pay_status;

    private int price_album;

    private int price_track;

    private int time_free;

    public void setPay_down(int pay_down){
        this.pay_down = pay_down;
    }
    public int getPay_down(){
        return this.pay_down;
    }
    public void setPay_month(int pay_month){
        this.pay_month = pay_month;
    }
    public int getPay_month(){
        return this.pay_month;
    }
    public void setPay_play(int pay_play){
        this.pay_play = pay_play;
    }
    public int getPay_play(){
        return this.pay_play;
    }
    public void setPay_status(int pay_status){
        this.pay_status = pay_status;
    }
    public int getPay_status(){
        return this.pay_status;
    }
    public void setPrice_album(int price_album){
        this.price_album = price_album;
    }
    public int getPrice_album(){
        return this.price_album;
    }
    public void setPrice_track(int price_track){
        this.price_track = price_track;
    }
    public int getPrice_track(){
        return this.price_track;
    }
    public void setTime_free(int time_free){
        this.time_free = time_free;
    }
    public int getTime_free(){
        return this.time_free;
    }

}