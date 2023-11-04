package uz.coder.androidd258;

public class KinoModel {
    private String img;
    private String name;
    private String cat;
    private String count;
    private String malumot;

    public KinoModel(String img, String name, String cat, String count,String malumot) {
        this.img = img;
        this.name = name;
        this.cat = cat;
        this.count = count;
        this.malumot = malumot;
    }

    public String getMalumot() {
        return malumot;
    }

    public void setMalumot(String malumot) {
        this.malumot = malumot;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
