package com.emploi;

import com.emploi.entities.Roles;
import com.emploi.repositories.EntrepriseRepository;
import com.emploi.repositories.RolesRepository;
import com.emploi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EmploiApplication implements CommandLineRunner {

    @Autowired
    private RolesRepository rolesRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EntrepriseRepository entrepriseRepository;
    public static void main(String[] args) {
        SpringApplication.run(EmploiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Role1
        Roles r1 = new Roles();
        r1.setNom("ROLE_ENTREPRISE");
       // rolesRepository.save(r1);
        //Role2
        Roles r2 = new Roles();
        r2.setNom("ROLE_DEMANDEUR_EMPLOI");
        //rolesRepository.save(r2);

       /* List<Roles> rolesL1 = new ArrayList<>();
        rolesL1.add(r1);
        rolesL1.add(r2);*/

        List<Roles> rolesL2 = new ArrayList<>();
        //rolesL2.add(r1);

      /*  User u = new User();
        u.setEmail("diallo@gmail.com");
        //crypt password
        String password = "passer123";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPasswordEncoder = passwordEncoder.encode(password);
        u.setPassword(hashedPasswordEncoder);
        u.setEtat(1);
        u.setRoles(rolesL2);
        userRepository.save(u);*/

       /* Entreprise e = new Entreprise();
        e.setEmail("diallo@gmail.com");
        //crypt password
        String password = "passer123";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPasswordEncoder = passwordEncoder.encode(password);
        e.setPassword(hashedPasswordEncoder);
        e.setEtat(1);
        e.setRoles(rolesL2);
        e.setNomRec("diallo");
        e.setPrenomRec("ibrahim");
        e.setNomEnt("DialloBuilding");
        e.setSectActivite("Immobilier");
        e.setRegion("New York");
        e.setTelephone("78-522-27-23");*/
        //entrepriseRepository.save(e);
    }
}

//user seck
//password: seck1234
