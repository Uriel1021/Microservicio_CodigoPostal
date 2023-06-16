package com.fjavmv.cpestados.cpestados.repository;


import com.fjavmv.cpestados.cpestados.interfaces.ICodigoPostal;
import com.fjavmv.cpestados.cpestados.model.CodigoPostal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

import static com.fjavmv.cpestados.cpestados.repository.Sql.*;

@Service
public class CodigoPostalRepImpl implements ICodigoPostal {
    private final JdbcTemplate template;

    public CodigoPostalRepImpl(@Autowired JdbcTemplate template){
        this.template = template;
    }

    @Override
    public List<Map<String, Object>> listar() {
        return template.queryForList(SQL_SELECT);
    }
    @Override
    public Integer add(CodigoPostal codigoPostal) {
        return template.update(SQL_INSERT, codigoPostal.getId(), codigoPostal.getD_codigo(), codigoPostal.getD_asenta(), codigoPostal.getD_tipo_asenta(),
                codigoPostal.getD_mnpio(), codigoPostal.getD_estado(), codigoPostal.getD_ciudad(), codigoPostal.getD_CP(),
                codigoPostal.getC_estado(), codigoPostal.getC_oficina(), codigoPostal.getC_CP(), codigoPostal.getC_tipo_asenta(),
                codigoPostal.getC_mnpio(), codigoPostal.getId_asenta_cpcons(), codigoPostal.getD_zona(), codigoPostal.getC_cve_ciudad());
    }
    @Override
    public Integer edit(CodigoPostal codigoPostal) {
        return template.update(SQL_UPDATE, codigoPostal.getId(), codigoPostal.getD_codigo(), codigoPostal.getD_asenta(), codigoPostal.getD_tipo_asenta(),
                codigoPostal.getD_mnpio(), codigoPostal.getD_estado(), codigoPostal.getD_ciudad(), codigoPostal.getD_CP(),
                codigoPostal.getC_estado(), codigoPostal.getC_oficina(), codigoPostal.getC_CP(), codigoPostal.getC_tipo_asenta(),
                codigoPostal.getC_mnpio(), codigoPostal.getId_asenta_cpcons(), codigoPostal.getD_zona(), codigoPostal.getC_cve_ciudad());
    }
    @Override
    public Integer delete(Integer id) {
        return template.update(SQL_DELETE,id);
    }
}
