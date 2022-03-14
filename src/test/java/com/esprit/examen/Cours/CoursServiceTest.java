package com.esprit.examen.Cours;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.esprit.examen.entities.Cours;
import com.esprit.examen.entities.TypeCours;
import com.esprit.examen.services.CoursService;
import com.esprit.examen.services.ICoursService;

public class CoursServiceTest {
	@Autowired
	CoursService cs;
	private static final Logger l =
	LogManager.getLogger(CoursServiceTest.class);
	
	private final Cours cour = new Cours(null, "description", TypeCours.Informatique, "intitle");
	
    @Test
    public void testGetCours() {
    	//List<Cours> cours1 =  cs.getCours();
    	//int firstLength1 = cours1.size();
    	//cs.addCours(cour);
    	//List<Cours> cours2 =  cs.getCours();
    	//int firstLength2 = cours2.size();
    	//Assert.assertEquals(firstLength2,firstLength1 + 1);
    	//Long id = cour.getId();
    	//Assert.assertNotNull(id);
    	//cs.supprimerCours(id);
    }
    
    @Test
    @Transactional
    public void testSupprimerCours() {
      //  cs.addCours(cour);
      //  Long id = cour.getId();
       // Assert.assertNotNull(id);
       // List<Cours> cours1 =  cs.getCours();
       // int firstLength1 = cours1.size();
       // cs.supprimerCours(id);
        //List<Cours> cours2 =  cs.getCours();
        //int firstLength2 = cours2.size();
        //Assert.assertEquals(firstLength2,firstLength1 - 1);

    }

	
	//@Test
	//public void testRetrieveCour() {
	//Cours cour = new Cours((long)5,"description", null,"test");
	//Optional<Cours> cours = cs.retrieveCour((long)5);
	//assertEquals(cours,cours);
	//l.info("retrieveUser : "+ cours);	
//}
}
