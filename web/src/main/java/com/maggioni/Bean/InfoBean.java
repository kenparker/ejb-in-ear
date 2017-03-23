package com.maggioni.Bean;

import com.maggioni.InfoCreator;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("infobean")
@SessionScoped
public class InfoBean implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @EJB
    private InfoCreator infoCreator;
    
    public String getInfo() {
        return infoCreator.getInfo();
    }
    
}
