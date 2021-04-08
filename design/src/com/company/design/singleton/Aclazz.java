package com.company.design.singleton;

public class Aclazz {

    private SoketClient soketClient;

    public Aclazz() {
        this.soketClient = SoketClient.getInstance();
        //this.soketClient = new SoketClient();
    }

    public SoketClient getSoketClient() {
        return this.soketClient;
    }
}
