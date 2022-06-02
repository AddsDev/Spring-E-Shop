package com.adds.dev.eshop.services;

import com.adds.dev.eshop.domain.Producto;
import com.adds.dev.eshop.repositories.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductService implements IProductoService{
    @Autowired
    private IProductoRepository repository;
    @Override
    public List<Producto> getProductList() {
        return StreamSupport.stream(repository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public Producto getProductById(Long id) {
        Optional<Producto> result = repository.findById(id);
        if (result.isPresent())
            return result.get();
        else
            //throw new ResourceAccessException("No se encontro el producto");
            return null;
    }

    @Override
    public Producto createProduct(Producto producto) {

        return repository.save(producto);
    }
}
