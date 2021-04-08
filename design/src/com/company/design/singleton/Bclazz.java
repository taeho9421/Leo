package com.company.design.singleton;

public class Bclazz {

    private SoketClient soketClient;

    public Bclazz () {
        this.soketClient = SoketClient.getInstance();
        //this.soketClient = new SoketClient();
    }

    public SoketClient getSoketClient(){
        return this.soketClient;
    }
}
