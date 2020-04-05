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
    private String zip_code;

    public int getId(){ return address_id; }

    public String getStreet(){ return shipping_address; }

    public void setStreet(String sa){ this.shipping_address = sa; }

    public String getCity() { return city; }

    public void setCity(String c) { this.city = c; }

    public String getState() { return state; }

    public void setState(String st) { this.state = st; }

    public CharSequence getZipcode() { return zip_code; }

    public void setZipcode(CharSequence zc) { this.zip_code = (String) zc; }

    public String toString(){
        return shipping_address + " " + city + ", " + state + " " + zip_code;
    }
}
