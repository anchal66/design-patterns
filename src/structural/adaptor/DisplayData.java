package structural.adaptor;

import java.util.Date;

public class DisplayData {
    private float index;
    private String data;

    public DisplayData(float index, String data) {
        this.index = index;
        this.data = data;
    }

    public float getIndex() {
        return index;
    }

    public void setIndex(float index) {
        this.index = index;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DisplayData{" +
                "index=" + index +
                ", data='" + data + '\'' +
                '}';
    }
}
