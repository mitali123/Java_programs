 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import Business.Airliner.Airliner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phapa
 */
public class AirlinerDirectory {
    //private String airliner;
    private List<Airliner> lstAirliner;
    
    public AirlinerDirectory(){
        this.lstAirliner= new ArrayList();
    }

//    public String getAirliner() {
//        return airliner;
//    }
//
//    public void setAirliner(String airliner) {
//        this.airliner = airliner;
//    }

    public List<Airliner> getLstAirliner() {
        return lstAirliner;
    }

    public void setLstAirliner(List<Airliner> lstAirliner) {
        this.lstAirliner = lstAirliner;
    }
    public Airliner addAirliner()
    {
        Airliner newair = new Airliner();
        lstAirliner.add(newair);
        return newair;
    }
    
    public void deleteAirliner(Airliner a)
    {
        lstAirliner.remove(a);
        
    }
}
