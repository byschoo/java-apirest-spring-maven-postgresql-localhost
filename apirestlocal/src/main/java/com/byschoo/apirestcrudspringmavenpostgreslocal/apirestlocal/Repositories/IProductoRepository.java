package com.byschoo.apirestcrudspringmavenpostgreslocal.apirestlocal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.byschoo.apirestcrudspringmavenpostgreslocal.apirestlocal.Entities.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Long>{

}
