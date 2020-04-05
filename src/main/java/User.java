import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.lang.String;

/**
 * @author Clara Carleton
 */

@Entity
public class User {

    @Id
    @Column
    private int user_id;

    @Column
    private String user_name;

    @Column
    private int address_id;

    @Column
    private String email;


    public String getName(){ return user_name; }

    public String getEmail(){ return email; }

    public int getAddress(){ return address_id;}

    //public String getCredit() { return c_num;}

    //public Cart getCart(){ return cart; }



}
/*
private UserDao userData = new UserDao("carletoc", "1683864");
    private String name;
    private Cart cart;
    private Address address;
    private String c_num;
    private String email;


    User(int id){
        name = userData.name(id);
        cart = new Cart();
        address = new Address(id);
        email = userData.email(id);
        c_num = userData.credit_num(id);
    }

    User(String n, Cart c, Address a, String e, String cn){
        name = n;
        cart = c;
        address = a;
        email = e;
        c_num = cn;
    }
 */