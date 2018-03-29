package ro.trimec.victorhantelmann.droid_indianaccounting_vk;

/**
 * Created by VK on 7/16/2017.
 */

public class SomeTable_A_Line {
    private int id;
    private String col_1_value;
    private int col_2_value;
    private double col_3_value;

    public SomeTable_A_Line() {
        this.id = -1;
        this.col_1_value = "";
        this.col_2_value = 0;
        this.col_3_value = (float) 0.0; // SQLite sees double type limited at the resolution of float type
    }

    public SomeTable_A_Line(int inId, String inCol_1_value, int inCol_2_value, double inCol_3_value) {
        this.id = inId;
        this.col_1_value = inCol_1_value;
        this.col_2_value = inCol_2_value;
        this.col_3_value = (float) inCol_3_value; // SQLite sees double type limited at the resolution of float type
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCol_1_value() {
        return col_1_value;
    }

    public void setCol_1_value(String col_1_value) {
        this.col_1_value = col_1_value;
    }

    public int getCol_2_value() {
        return col_2_value;
    }

    public void setCol_2_value(int col_2_value) {
        this.col_2_value = col_2_value;
    }

    public double getCol_3_value() {
        return col_3_value;
    }

    public void setCol_3_value(double col_3_value) {
        this.col_3_value = col_3_value;
    }
}
