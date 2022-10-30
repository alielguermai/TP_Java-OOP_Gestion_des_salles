package ma.projet.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Salle {
    private static int id=0;
    private String code,libelle;
    public static List<Integer> ids=new ArrayList<>(List.of(0));
    private int idActuelle;
    public Salle(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
        id++;
        ids.add(id);
        idActuelle=id;
    }

    public void setIdActuelle(int idActuelle) {
        this.idActuelle = idActuelle;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Salle.id = id;
    }

    public int getIdActuelle() {
        return idActuelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Salle{" +
                "code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salle salle = (Salle) o;
        return idActuelle == salle.idActuelle && code.equals(salle.code) && libelle.equals(salle.libelle);
    }

}