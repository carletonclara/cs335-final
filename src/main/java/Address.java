/**
 * @author Clara Carleton
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @Column
    private int address_id;

    @Column
    private String shipping_address;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String zipcode;

    public int getId(){ return address_id; }

    public String getStreet(){ return shipping_address; }

    public String getCity() { return city; }

    public String getState() { return state; }

    public CharSequence getZipcode() { return zipcode; }

    public String toString(){
        return shipping_address + " " + city + ", " + state + " " + zipcode;
    }
}
