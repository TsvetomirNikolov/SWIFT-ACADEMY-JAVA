package Task3_DataAccessLayer;

public interface AddressStorage {

    public Address getAddress(int id) throws DALException;

    public int insertAddress(Address address) throws DALException;

}
