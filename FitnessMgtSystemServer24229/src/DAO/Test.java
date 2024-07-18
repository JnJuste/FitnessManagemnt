
package DAO;

/**
 *
 * @author jeanj
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();
    }
    
}
