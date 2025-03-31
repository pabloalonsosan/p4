package edu.comillas.icai.gitt.pat.spring.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motos")
public class MotocicletaController {

    @Autowired
    private MotocicletaRepository motoRepo;

    @PostMapping
    public Motocicleta crear(@RequestBody Motocicleta moto) {
        return motoRepo.save(moto);
    }

    @GetMapping
    public List<Motocicleta> listar() {
        return motoRepo.findAll();
    }

    @GetMapping("/{id}")
    public Motocicleta leer(@PathVariable Long id) {
        return motoRepo.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Motocicleta actualizar(@PathVariable Long id, @RequestBody Motocicleta moto) {
        moto.setId(id);
        return motoRepo.save(moto);
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable Long id) {
        motoRepo.deleteById(id);
    }
}

