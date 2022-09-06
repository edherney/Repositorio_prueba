package com.datasoft.mintic.sistemacontable.controller;

import com.datasoft.mintic.sistemacontable.entity.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EgresoRestController {

    @GetMapping("/Egreso/{id}")
    public Egreso findById(@PathVariable long id){
        Egreso salidaUno = new Egreso(023, TipoMovimiento.EGRESO, new Usuario(1,new TipoDocumento(001,"Cedula Ciudadania","CC",true),"10752341223","Carlos","perez","popayan",603134567,"cperez@hotmail.com",new Rol(0001,"Operario",true),"1q2w3e4r5t",true),812,new Date(),1200000,"Pago publicidad");
        return salidaUno;
    }

    @GetMapping("/Egreso")
    public List<Egreso> findAll(){
        List<Egreso> nuevoEgre = new ArrayList<Egreso>();
        Egreso egresoUno = new Egreso(41, TipoMovimiento.EGRESO, new Usuario(1,new TipoDocumento(001,"Cedula Ciudadania","CC",true),"10752341223","Carlos","perez","popayan",603134567,"cperez@hotmail.com",new Rol(0001,"Operario",true),"1q2w3e4r5t",true),90,new Date(),450000,"pago pedido");
        nuevoEgre.add(egresoUno);
        Egreso egresoDos = new Egreso(39, TipoMovimiento.EGRESO, new Usuario(2,new TipoDocumento(001,"Cedula Ciudadania","CC",true),"10752340023","guillermo","oliveros","santa marta",603134060,"guillermo@hotmail.com",new Rol(0001,"Operario",true),"1q2w3e4r5t",true),91,new Date(),400500,"pago pedido");
        nuevoEgre.add(egresoDos);
        return nuevoEgre;
    }


}