package tr.org.lkd.ab2018.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created on January, 2018
 *
 * @author adilcan
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contract {

	@Id
	private Integer id;

	private String name;

	private String surname;

	private Integer countryCode;

	private String phoneNumber;

	private String emailAddress;

}
