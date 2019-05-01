package edunova;

// domaća zadaća:

import edunova.controller.ObradaOperater;
import edunova.model.Operater;
import edunova.pomocno.BCrypt;
import edunova.pomocno.EdunovaException;
import edunova.view.SplashScreen;
import java.util.logging.Level;
import java.util.logging.Logger;

//upogoniti Hibernate prateći https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-maven-example/
public class Start {

    public static void main(String[] args) {
        
     
        new SplashScreen().setVisible(true);
//      Operater o = new Operater();
//      o.setEmail("tjakopec@gmail.com");
//      o.setLozinka(BCrypt.hashpw("t", BCrypt.gensalt()));
//        System.out.println(o.getLozinka());
//      o.setIme("Tomislav");
//      o.setPrezime("Jakopec");
//      
//        ObradaOperater oo = new ObradaOperater();
//        try {
//            oo.spremi(o);
//        } catch (EdunovaException ex) {
//           ex.printStackTrace();
//        }
//        
        
        
    }
    
}
