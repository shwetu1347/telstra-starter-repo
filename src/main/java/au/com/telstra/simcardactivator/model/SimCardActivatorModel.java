package au.com.telstra.simcardactivator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SimCardActivatorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iccid;

    public SimCardActivatorModel(Long iccid) {
        this.iccid = iccid;
    }

    public Long getIccid() {
        return iccid;
    }

    public void setIccid(Long iccid) {
        this.iccid = iccid;
    }

  
	private String customerEmail;

}