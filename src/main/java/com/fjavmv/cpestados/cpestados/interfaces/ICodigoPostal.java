package com.fjavmv.cpestados.cpestados.interfaces;

import com.fjavmv.cpestados.cpestados.model.CodigoPostal;

import java.util.List;
import java.util.Map;

public interface ICodigoPostal {
    List<Map<String, Object>> listar();

    Integer add(CodigoPostal codigoPostal);

    Integer edit(CodigoPostal codigoPostal);

    Integer delete(Integer id);

}
