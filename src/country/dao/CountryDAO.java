package country.dao;

import country.model.Country;


public interface CountryDAO {
	Country getByCode(String code);
	void save(Country country);

	void update(Country country);

	void deleteByCode(Country country);

}
