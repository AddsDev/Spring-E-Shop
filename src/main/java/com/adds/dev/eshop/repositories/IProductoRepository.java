package com.adds.dev.eshop.repositories;

import com.adds.dev.eshop.domain.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoRepository extends CrudRepository<Producto, Long> {

    //Producto! findByProductId(Long id);
}
