package com.maggioni;

import javax.ejb.Remote;

@Remote
public interface InfoInterface {
    
    public String getInfo();
}
