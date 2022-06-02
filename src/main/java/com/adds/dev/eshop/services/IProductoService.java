package com.adds.dev.eshop.services;

import com.adds.dev.eshop.domain.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> getProductList();
    Producto getProductById(Long id);
    Producto createProduct(Producto producto);
}
