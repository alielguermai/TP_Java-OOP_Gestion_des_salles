package ma.projet.dao;

import ma.projet.beans.Salle;

import java.util.List;

public interface IDao {
    static boolean create(Salle o) {
        return false;
    }

    static boolean delete(Salle o) {
        return false;
    }

    static boolean update(Salle o) {
        return false;
    }

    static Salle findById(int id) {
        return null;
    }

    static List<Salle> findAll() {
        return null;
    }
}
