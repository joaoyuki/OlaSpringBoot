/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofra.springboot.OlaSpringBoot.dao;

import br.com.joaofra.springboot.OlaSpringBoot.entidade.Contato;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author joaoassis
 */
public interface ContatoDAO extends JpaRepository<Contato, Long>{
    //O SpringDataJPA faz toda a implementação na classe atravez do JpaRepository
}
