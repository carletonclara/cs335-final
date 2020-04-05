/**
 * @author Clara Carleton
 */

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class AddressDAOImpl implements AddressDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void saveAddress(Address address) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(address);
        tx.commit();
        session.close();
    }

    public void deleteAddress(int address_id) {
        Session session = this.sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        Address address = session.get(Address.class, address_id);
        session.delete(address);
        tx.commit();

        session.close();
    }

    @SuppressWarnings("unchecked")
    public List<Address> listAddresses() {
        Session session = this.sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Address> query = builder.createQuery(Address.class);
        Root<Address> addressRoot = query.from(Address.class);
        query.select(addressRoot);
        List<Address> addresses = session.createQuery(query).getResultList();

        session.close();
        return addresses;
    }

    @SuppressWarnings("unchecked")
    public Address getAddress(int address_id) {
        Session session = this.sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Address> query = builder.createQuery(Address.class);
        Root<Address> addressRoot = query.from(Address.class);
        query.select(addressRoot).where(builder.equal(addressRoot.get("address_id"), address_id));
        // Expects a singleton.
        Address address = session.createQuery(query).getSingleResult();

        session.close();
        return address;
    }
}
