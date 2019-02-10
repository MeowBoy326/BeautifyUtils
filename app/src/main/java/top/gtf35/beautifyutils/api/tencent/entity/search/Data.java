package top.gtf35.beautifyutils.api.tencent.entity.search;
import java.util.List;
public class Data {
    private String keyword;

    private int priority;

    private List<String> qc ;

    private Semantic semantic;

    private Song song;

    private int tab;

    private List<String> taglist ;

    private int totaltime;

    private Zhida zhida;

    public void setKeyword(String keyword){
        this.keyword = keyword;
    }
    public String getKeyword(){
        return this.keyword;
    }
    public void setPriority(int priority){
        this.priority = priority;
    }
    public int getPriority(){
        return this.priority;
    }
    public void setQc(List<String> qc){
        this.qc = qc;
    }
    public List<String> getQc(){
        return this.qc;
    }
    public void setSemantic(Semantic semantic){
        this.semantic = semantic;
    }
    public Semantic getSemantic(){
        return this.semantic;
    }
    public void setSong(Song song){
        this.song = song;
    }
    public Song getSong(){
        return this.song;
    }
    public void setTab(int tab){
        this.tab = tab;
    }
    public int getTab(){
        return this.tab;
    }
    public void setTaglist(List<String> taglist){
        this.taglist = taglist;
    }
    public List<String> getTaglist(){
        return this.taglist;
    }
    public void setTotaltime(int totaltime){
        this.totaltime = totaltime;
    }
    public int getTotaltime(){
        return this.totaltime;
    }
    public void setZhida(Zhida zhida){
        this.zhida = zhida;
    }
    public Zhida getZhida(){
        return this.zhida;
    }

}