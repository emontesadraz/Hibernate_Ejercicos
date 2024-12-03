package services;

import config.HibernateConfig;
import hibernate.Adestrador;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

public class AdestradorServices {

    public void crearAdestrador(Adestrador adestrador){
        try (Session session = HibernateConfig.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.save(adestrador);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public List<Adestrador> listarAdestrador() {
        List<Adestrador> adestradores = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            Query<Adestrador> query= session.createQuery("from Adestrador ", Adestrador.class);
            adestradores= query.list();
            adestradores.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error al listar los adestradores: " + e.getMessage());
        }
        return adestradores;
    }

    public void modificarAdestrador(int id, String nome, Date nacemento){
        try (Session session = HibernateConfig.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            Adestrador adestrador = session.get(Adestrador.class,id);
            if (adestrador != null){
                adestrador.setNome(nome);
                adestrador.setNacemento(nacemento);
                session.update(adestrador);
            }else {
                System.out.println("No se encontro ningun adestrador");
            }
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void eliminarAdestrador (int id){
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Adestrador adestrador = session.get(Adestrador.class,id);
            if (adestrador != null) {
                session.delete(adestrador);
            } else {
                System.out.println("No se encontro al pokemon en la pokedex ");
            }
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Error al eliminar el pokemon en la pokedex: " + e.getMessage());
        }
    }
    public void eliminarTablaAdestrador (){
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            NativeQuery<?> query = session.createNativeQuery("DELETE FROM pokedex");
            query.executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Error al borrar la tabla --> " + e.getMessage());
        }
    }
}
