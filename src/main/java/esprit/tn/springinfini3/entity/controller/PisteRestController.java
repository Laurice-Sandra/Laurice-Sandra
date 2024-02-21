package esprit.tn.springinfini3.entity.controller;

import esprit.tn.springinfini3.entity.Piste;
import esprit.tn.springinfini3.serviceInterface.ServicePiste;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PisteRestController {

    private ServicePiste servicePiste;

    @GetMapping("/GetAllPiste")
    //@PreAuthorize("hasAnyAuthority('SCOPE_USER')")(what is preauthorized?
    public List<Piste> getallpiste (){
        return servicePiste.retrieveAllPistes();
    }

    @PostMapping("/addPiste")
    //@PreAuthorize("hasAnyAuthority('SCOPE_ADMIN')")
    public Piste addPiste(@RequestBody Piste piste) {
        return this.servicePiste.addPiste(piste);
    }

    @GetMapping("/getPiste/{id}")
    //@PreAuthorize("hasAnyAuthority('SCOPE_USER')")
    public Piste getPiste(@PathVariable("id") long id) {
        return this.servicePiste.retrievePiste(id);
    }

    @PutMapping ("/Update")
    //@PreAuthorize("hasAnyAuthority('SCOPE_ADMIN')")
    public Piste updatePiste(@RequestBody Piste piste) {
        return this.servicePiste.updatePiste(piste);
    }

}
