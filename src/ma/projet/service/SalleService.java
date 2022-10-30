package ma.projet.service;

import ma.projet.beans.Salle;
import ma.projet.dao.IDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ma.projet.beans.Salle.ids;

public class SalleService implements IDao {
    static Scanner sc = new Scanner(System.in);
    static List<Salle> listSalle =new ArrayList<Salle>();

    public static boolean create(Salle o) {
        try {
            listSalle.add(o);
            System.out.println("La salle a ete ajoute avec success !");
            return true;
        }
        catch (Exception e){
            System.out.println("Une erreur est commite !");
            return false;
        }
    }

    public static boolean delete(Salle o) {
        if (listSalle.isEmpty()){
            System.out.println("Il n'y a aucune salle !");
            return false;
        }
        for (Salle s:listSalle){
            if(s.equals(o)){
                listSalle.remove(s);
                System.out.println("La salle a ete supprime avec success !");
                return true;
            }
        }
        System.out.println("Cette salle n'existe pas !");
        return false;
    }

    public static boolean update(Salle o) {
        if (listSalle.isEmpty()){
            System.out.println("Il n'y a aucune salle !");
            return false;
        }
        else {
            int id = 0;
            for (Salle s : listSalle) {
                if (s.equals(o)) {
                    System.out.println("Modification :");
                    System.out.print("Entrer le code :");
                    String code = sc.next();
                    System.out.print("Entrer libelle :");
                    String lib = sc.next();
                    System.out.print("Entrer id :");
                    try {
                        id = sc.nextInt();
                        while (ids.contains(id)) {
                            System.out.print("Cette id existe deja ! ressayer :");
                            id = sc.nextInt();
                        }
                    } catch (Exception e) {
                        System.out.print("Erreur !id doit etre un nombre :");
                        sc.next();
                    }
                    s.setCode(code);
                    s.setLibelle(lib);
                    s.setIdActuelle(id);
                    System.out.println("La salle a ete modifie avec success !");
                    return true;
                }
            }
            System.out.println("Cette salle n'existe pas !");
            return false;
        }
    }


    public static Salle findById(int id) {
        if (listSalle.isEmpty()){
            System.out.println("Il n'y a aucune salle !");
            return null;
        }
        else {
            if (ids.contains(id)) {
                for (Salle s : listSalle) {
                    if (s.getIdActuelle() == id) {
                        return s;
                    }
                }
            }
            else {
                System.out.println("Cette id n'existe pas !");
                return null;
            }
        }
        return null;
    }

    public static List<Salle> findAll() {
        return listSalle;
    }
}
