package tn.biat.service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import tn.biat.domain.Compte;

@Service
public class CompteService implements ICompteService {

	private static List<Compte>comptes = Arrays.asList(
			new Compte("C100","Marwene",new BigDecimal("100")),
			new Compte("C100","Marwene",new BigDecimal("100")),
			new Compte("C100","Marwene",new BigDecimal("100")) 
			);
	
	/* (non-Javadoc)
	 * @see tn.biat.service.ICompteService#findAll()
	 */
	@Override
	public List<Compte> findAll(){
		return comptes;
	}
	
	/* (non-Javadoc)
	 * @see tn.biat.service.ICompteService#add(tn.biat.domain.Compte)
	 */
	@Override
	public void add(Compte cmp) {
		{comptes.add(cmp);}
	}
}
