/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dn.ejb;

import com.dn.entity.Users;
import com.dn.service.UsersFacadeREST;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@Startup
public class ConfigBean {
    @EJB
    private UsersFacadeREST usersFacadeREST;
    
    @PersistenceContext(unitName = "chatCompletePU")
    private EntityManager em;

    @PostConstruct
    public void init() {
       
        Users dat = new Users();
        dat.setUserid("DAT");
        usersFacadeREST.create(dat);
      
        Users hai = new Users();
        hai.setUserid("HAI");
        usersFacadeREST.create(hai);
        
        Users tu = new Users();
        tu.setUserid("TU");
        usersFacadeREST.create(tu);
        
        Users tina= new Users();
        tina.setUserid("TINA");
        usersFacadeREST.create(tina);
    }
}

