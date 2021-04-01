package com.Ecommerce.Ecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecommerce.Ecommerce.Model.Loja;



@Repository
public interface LojaRepository extends JpaRepository<Loja, Long>{
    public List <Loja> findAllByNomeContainingIgnoreCase(String nome);

}
