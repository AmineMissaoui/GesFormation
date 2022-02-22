package com.esprit.examen.Cours;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.esprit.examen.entities.Cours;
import com.esprit.examen.services.CoursService;
import com.esprit.examen.services.ICoursService;

public class CoursServiceTest {
	@Autowired
	CoursService cs;
	private static final Logger l =
	LogManager.getLogger(CoursServiceTest.class);
	@Test
	public void testRetrieveUser() {
	//Cours cours = cs.retrieveUser("1");
	//assertNotNull(cours.getDateNaissance());
	//l.info("retrieveUser : "+ cours);
}
}
