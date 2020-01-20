/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manja
 */
public class Fleet {
    private List<Airplane> lstAirplane;
    

    public Fleet(){
        this.lstAirplane = new ArrayList();
    }
    public List<Airplane> getLstAirplane() {
        return lstAirplane;
    }

    public void setLstAirplane(List<Airplane> lstAirplane) {
        this.lstAirplane = lstAirplane;
    }
    public Airplane addAirplane(String AirplaneType, String Model)
    {
        Airplane a = new Airplane();
        a.setAirplaneType(AirplaneType);
        a.setModel(Model);
        
        lstAirplane.add(a);
        return a;
    }
}
