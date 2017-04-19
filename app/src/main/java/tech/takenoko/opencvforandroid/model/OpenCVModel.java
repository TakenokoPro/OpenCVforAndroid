package tech.takenoko.opencvforandroid.model;

import java.io.Serializable;

import lombok.Getter;

/**
 * Created by たけのこ on 2017/04/20.
 */
public class OpenCVModel extends baseModel implements Serializable {

    /** 閾値1 */
    @Getter
    private int threshold1 = 80;

    /** 閾値2 */
    @Getter
    private int threshold2 = 100;

    public void add(String name) {
        switch (name) {
            case "threshold1":
                threshold1++;
                break;
            case "threshold2":
                threshold2++;
                break;
            default:
                break;
        }
    }
    public void sub(String name) {
        switch (name) {
            case "threshold1":
                threshold1--;
                break;
            case "threshold2":
                threshold2--;
                break;
            default:
                break;
        }
    }
}