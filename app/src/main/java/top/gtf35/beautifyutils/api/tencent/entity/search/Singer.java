package top.gtf35.beautifyutils.api.tencent.entity.search;
public class Singer {
    private int id;

    private String mid;

    private String name;

    private String title;

    private String title_hilight;

    private int type;

    private int uin;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setMid(String mid){
        this.mid = mid;
    }
    public String getMid(){
        return this.mid;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle_hilight(String title_hilight){
        this.title_hilight = title_hilight;
    }
    public String getTitle_hilight(){
        return this.title_hilight;
    }
    public void setType(int type){
        this.type = type;
    }
    public int getType(){
        return this.type;
    }
    public void setUin(int uin){
        this.uin = uin;
    }
    public int getUin(){
        return this.uin;
    }

}