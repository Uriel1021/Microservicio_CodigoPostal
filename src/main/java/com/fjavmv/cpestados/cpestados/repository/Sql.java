package com.fjavmv.cpestados.cpestados.repository;

public class Sql {
    protected static String SQL_SELECT = "SELECT * FROM codigo_postal";
    protected static String SQL_INSERT = "INSERT INTO codigo_postal (id, d_codigo, d_asenta, d_tipo_asenta, d_mnpio, d_estado, d_ciudad, d_CP, c_estado, c_oficina, c_CP, c_tipo_asenta, c_mnpio, id_asenta_cpcons, d_zona, c_cve_ciudad) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    protected static String SQL_UPDATE = "UPDATE codigo_postal SET d_cp = ?, d_asenta = ?, d_ciudad = ?, d_codigo = ?, d_estado = ?, d_mnpio = ?, d_tipo_asenta = ?, d_zona = ?, c_cp = ?, c_cve_ciudad = ?, c_estado = ?, c_mnpio = ?, c_oficina = ?, c_tipo_asenta = ?, id_asenta_cpcons = ? WHERE id = ?";
    protected static String SQL_DELETE = "DELETE FROM codigo_postal WHERE id = ?";
}
