package ma.projet.test;

import ma.projet.beans.Salle;
import ma.projet.service.SalleService;

import java.util.ArrayList;
import java.util.List;

import static ma.projet.service.SalleService.*;

public class test {
    public static void main(String[] args) {
        Salle s1=new Salle("a1","ab");
//        create(s1);
        Salle s2=new Salle("b2","bc");
//        create(s2);
        System.out.println(s2.getIdActuelle());
        Salle s3=new Salle("c3","cd");
//        create(s3);
        Salle s4=new Salle("d4","de");
//        create(s4);
        Salle s5=new Salle("e5","ef");
//        create(s5);
//        System.out.println(findAll());
//        delete(s5);
//        System.out.println(findAll());
//        update(s4);
//        System.out.println(findAll());
//        System.out.println(s4.getIdActuelle());

    }
}
