package com.adds.dev.eshop.controllers;

import com.adds.dev.eshop.domain.Producto;
import com.adds.dev.eshop.dto.ProductoDto;
import com.adds.dev.eshop.services.IProductoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/api/producto")
public class ProductoRestController {

    @Autowired
    private IProductoService productoService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping(path = {"","/"})
    @ResponseBody
    //@ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<List<ProductoDto>> productos(){
        List<Producto> list = productoService.getProductList();
        return ResponseEntity.ok(list.stream().map(p -> modelMapper.map(p, ProductoDto.class)).collect(Collectors.toList()));
    }
    @GetMapping(path = "/{id}")
    @ResponseBody
    //@ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ProductoDto> getProducto(@PathVariable(name = "id") Long id){
        Producto producto = productoService.getProductById(id);
        return producto != null ? ResponseEntity.ok(modelMapper.map(producto, ProductoDto.class)) : ResponseEntity.badRequest().body(null);//new ResponseEntity<>(HttpStatus.BAD_REQUEST) ;
    }
    @PostMapping
    public ResponseEntity<ProductoDto> createProducto(@RequestBody ProductoDto producto){
        Producto temp = modelMapper.map(producto, Producto.class);

        return  ResponseEntity.ok(modelMapper.map(productoService.createProduct(temp), ProductoDto.class));

    }
}
