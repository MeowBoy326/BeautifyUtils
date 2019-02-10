package top.gtf35.beautifyutils.api.tencent.entity.search;
public class Volume {
    private double gain;

    private double lra;

    private double peak;

    public void setGain(double gain){
        this.gain = gain;
    }
    public double getGain(){
        return this.gain;
    }
    public void setLra(double lra){
        this.lra = lra;
    }
    public double getLra(){
        return this.lra;
    }
    public void setPeak(double peak){
        this.peak = peak;
    }
    public double getPeak(){
        return this.peak;
    }

}