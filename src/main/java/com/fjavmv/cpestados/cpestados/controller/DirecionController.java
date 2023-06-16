package com.fjavmv.cpestados.cpestados.controller;

import com.fjavmv.cpestados.cpestados.model.CodigoPostal;
import com.fjavmv.cpestados.cpestados.interfaces.ICodigoPostal;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/code")
public class DirecionController {
    private final ICodigoPostal iCodigoPostal;

    public DirecionController(@Autowired ICodigoPostal iCodigoPostal) { this.iCodigoPostal = iCodigoPostal;}

    @GetMapping("/list")
    public List<Map<String, Object>> list() {
        return iCodigoPostal.listar();
    }

    @PostMapping(value = "/add")
    //consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
    public String add(@RequestBody CodigoPostal codigoPostal) {
        Integer id = iCodigoPostal.add(codigoPostal);
        if (id == 0) {
            return "NO FUE POSIBLE REALIZAR EL REGISTRO";
        } else {
            return "SE HA REALIZADO EL REALIZADO CORRECTAMENTE";
        }
    }

    @PostMapping(value = "/edit")
    public String edit(@RequestBody CodigoPostal codigoPostal){
        Integer id = iCodigoPostal.edit(codigoPostal);
        if (id == 0) {
            return "NO FUE POSIBLE REALIZAR EL REGISTRO";
        } else {
            return "SE HA REALIZADO EL REALIZADO CORRECTAMENTE";
        }
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        Integer fila = iCodigoPostal.delete(id);
        if (fila == 0) {
            return "EL REGISTRO NO PUDO SER ELIMINADO";
        } else {
            return "ELEMENTO ELIMINADO CORRECTAMENTE";
        }
    }

}
