package top.gtf35.beautifyutils.api.tencent.entity.search;
import java.util.ArrayList;
import java.util.List;
public class Semantic
{
    private int curnum;

    private int curpage;

    private List<String> list;

    private int totalnum;

    public void setCurnum(int curnum){
        this.curnum = curnum;
    }
    public int getCurnum(){
        return this.curnum;
    }
    public void setCurpage(int curpage){
        this.curpage = curpage;
    }
    public int getCurpage(){
        return this.curpage;
    }
    public void setList(List<String> list){
        this.list = list;
    }
    public List<String> getList(){
        return this.list;
    }
    public void setTotalnum(int totalnum){
        this.totalnum = totalnum;
    }
    public int getTotalnum(){
        return this.totalnum;
    }
}
