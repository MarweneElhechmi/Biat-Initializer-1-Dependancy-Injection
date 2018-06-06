package tn.biat.service;

import java.util.List;

import tn.biat.domain.Compte;

public interface ICompteService {

	List<Compte> findAll();

	void add(Compte cmp);

}