package au.com.telstra.simcardactivator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import au.com.telstra.simcardactivator.model.SimCardActivatorModel;
import au.com.telstra.simcardactivator.repo.SimCardActivatorRepo;

@Service

@EnableTransactionManagement
public class SimCardActivatorService {
	private final SimCardActivatorRepo simCardActivatorRepo;


    SimCardActivatorService(SimCardActivatorRepo simCardActivatorRepo) {
        this.simCardActivatorRepo = simCardActivatorRepo;
    }

    

	public boolean savesimDetails(SimCardActivatorModel simCardActivatorModel) {
		boolean a = false;

		if (simCardActivatorModel != null) {
			simCardActivatorRepo.save(simCardActivatorModel);
			return a;
		}
		else {
		return a;
		}
	}

}
