package au.com.telstra.simcardactivator.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import au.com.telstra.simcardactivator.model.SimCardActivatorModel;



	@Repository
	public interface SimCardActivatorRepo extends JpaRepository<SimCardActivatorModel,Long>{
	} 