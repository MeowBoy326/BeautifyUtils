package top.gtf35.beautifyutils.api.tencent.entity.search;
public class Album {
    private int id;

    private String mid;

    private String name;

    private String subtitle;

    private String title;

    private String title_hilight;

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
    public void setSubtitle(String subtitle){
        this.subtitle = subtitle;
    }
    public String getSubtitle(){
        return this.subtitle;
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

}