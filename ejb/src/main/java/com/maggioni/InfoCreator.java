package com.maggioni;

import javax.ejb.Stateful;

@Stateful 
public class InfoCreator implements InfoInterface{

    @Override
    public String getInfo() {
       return "Info";
    }
}
