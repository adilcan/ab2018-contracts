package tr.org.lkd.ab2018.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.org.lkd.ab2018.model.Contract;
import tr.org.lkd.ab2018.repository.ContractRepository;

/**
 * Created on January, 2018
 *
 * @author adilcan
 */
@RestController
@RequestMapping("/contracts")
public class ContractController {

	@Autowired
	private ContractRepository contractRepository;

	@GetMapping("")
	public Iterable<Contract> index() {

		return contractRepository.findAll();

	}

}
