package tr.org.lkd.ab2018.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tr.org.lkd.ab2018.model.Contract;

/**
 * Created on January, 2018
 *
 * @author adilcan
 */
@Repository
public interface ContractRepository extends CrudRepository<Contract, Integer> {

}
