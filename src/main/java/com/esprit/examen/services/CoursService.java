package com.esprit.examen.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger; 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.examen.entities.Cours;
import com.esprit.examen.entities.Session;
import com.esprit.examen.repositories.CoursRepository;
import com.esprit.examen.repositories.SessionRepository;


@Service
public class CoursService implements ICoursService {
	
	private static final Logger l = LogManager.getLogger(CoursService.class);
	

	@Autowired
	CoursRepository coursRepository;
	@Override
	public Long addCours(Cours cours) {
		try {
			cours.setTypeCours(null);
			coursRepository.save(cours);
			}catch(Exception  e) {
				l.error(e);
			}
		
		return cours.getId();
	}

	@Override
	public Long modifierCours(Cours cours) {
		coursRepository.save(cours);
		return cours.getId();
		}

	@Override
	public void supprimerCours(Long coursId) {
		coursRepository.deleteById(coursId);
		try {
			coursRepository.deleteById(coursId);
		}catch(Exception  e) {
			l.error("*******************************************************test ***************************************************************: " + e);
		}finally {
			
			l.error("*******************************************************test ***************************************************************: ");

		}
		
	}

	@Override
	public List<Cours> getCours() {
		
		List<Cours> cours =   coursRepository.findAll();
		return cours;
	}
	
	@Override
	public Optional<Cours> retrieveCour(Long coursId) {
		Optional<Cours> cour = coursRepository.findById(coursId);
		return cour;
	}
	
	@Override
	public void affecterCoursASession(Long coursId, Long sessionId)
	{
		/*todo*/
        
	}

}
