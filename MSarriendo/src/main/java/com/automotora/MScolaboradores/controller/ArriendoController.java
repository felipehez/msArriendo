package com.automotora.MScolaboradores.controller;
import com.automotora.MScolaboradores.entity.ArriendoEntity;
import com.automotora.MScolaboradores.service.ArriendoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Slf4j
@CrossOrigin(value = {})
@RestController
@RequestMapping("/arriendo")
public class ArriendoController {

    @Autowired
    private ArriendoService service;

    @GetMapping
    public ResponseEntity<?> obtenerArriendos() {  // funcionando =)
        ResponseEntity<?> response;
        System.out.println("obtener arriendos");
        try {
            List<ArriendoEntity> arriendos = this.service.buscarTodos();
            response = new ResponseEntity<>(service, HttpStatus.OK);
            System.out.println("try obtener arriendos");
        } catch(Exception ex) {
            log.error(ex.getMessage(), ex);
            System.out.println("err obtener arriendos");
            response = new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return response;
    }

    /*
    @GetMapping
    public ArriendoEntity mostrarArriendo(@PathVariable("idArriendo") String idArriendo){

        System.out.println("creando mostrar/");

        return new ArriendoEntity("1", "11/04/2019", "p456",
                "123", "789", 3);



        //va a buscar un colaborador según su rut
        /*RestTemplate restTemplate = new RestTemplate();
        PersonaEntity arrendador = restTemplate.getForObject("http://localhost:8096/persona/123", PersonaEntity.class);
        */
    }




