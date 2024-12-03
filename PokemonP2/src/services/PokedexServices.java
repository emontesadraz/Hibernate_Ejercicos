package services;

import config.HibernateConfig;
import hibernate.Adestrador;
import hibernate.Pokedex;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

public class PokedexServices {

    public void crearPokemonEnPokedex(Pokedex pokedex) {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(pokedex);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<Pokedex> listarPokedex() {
        List<Pokedex> pokedexes = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            Query<Pokedex> query= session.createQuery("from Pokedex ", Pokedex.class);
            pokedexes = query.list();
            pokedexes.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error al listar los pokedex: " + e.getMessage());
        }
        return pokedexes;
    }

    public void modificarPokemonEnPokedex(int id,String nome){
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Pokedex pokedex = session.get(Pokedex.class, id);
            if (pokedex != null) {
                pokedex.setNome(nome);
                session.update(pokedex);
            } else {
                System.out.println("Pokemon no encontrado para modificar.");
            }
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Error al modificar el pokemon: " + e.getMessage());
            e.printStackTrace();

        }
    }

    public void eliminarPokemon(int id){
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Pokedex pokedex = session.get(Pokedex.class, id);
            if (pokedex != null) {
                session.delete(pokedex);
            } else {
                System.out.println("No se encontro al pokemon en la pokedex ");
            }
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Error al eliminar el pokemon en la pokedex: " + e.getMessage());
        }
    }
    public void borrarTablaPokedex() {
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
