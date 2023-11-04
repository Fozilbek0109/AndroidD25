package uz.coder.androidd258;

public class SecondModel {
    private String img;
    private String sname;
    private String malum;
    private String catigory;
    private String count;

    public SecondModel(String img, String sname, String malum, String catigory, String count) {
        this.img = img;
        this.sname = sname;
        this.malum = malum;
        this.catigory = catigory;
        this.count = count;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getMalum() {
        return malum;
    }

    public void setMalum(String malum) {
        this.malum = malum;
    }

    public String getCatigory() {
        return catigory;
    }

    public void setCatigory(String catigory) {
        this.catigory = catigory;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
