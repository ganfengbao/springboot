package com.junbao.springboot.pojo;

public class Number {
    private Integer id;

    private String number;

    private String prenumber;

    public Number() {
    }

    public Number(String number, String prenumber) {
        this.number = number;
        this.prenumber = prenumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getPrenumber() {
        return prenumber;
    }

    public void setPrenumber(String prenumber) {
        this.prenumber = prenumber == null ? null : prenumber.trim();
    }
}