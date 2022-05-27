package com.example.kittycaresystem.entity;

public class Breeder {
    private String bid;
    private String password;
    private String bname;

    public Breeder(){
    }

    public Breeder(String bid, String password, String bname){
        this.bid = bid;
        this.password = password;
        this.bname = bname;
    }
    public String getBid(){return bid;}
    public void setBid(String bid){this.bid = bid;}

    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}

    public String getBname(){return bname;}
    public void setBname(String bname){this.bname = bname;}
}