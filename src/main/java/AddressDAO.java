/**
 * @author Clara Carleton
 */

import java.util.List;

public interface AddressDAO {

    Address getAddress(int address_id);

    void saveAddress(Address address);

    void deleteAddress(int address_id);

    List<Address> listAddresses();
}
