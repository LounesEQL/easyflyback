package ai115.formation.eql.controller.rest;


import ai115.formation.eql.entity.Aircraft;
import ai115.formation.eql.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/space")
@CrossOrigin("${front.url}")
public class SpaceRestController {

    SpaceService spaceService;

    @GetMapping("aircraft/{id}")
    public Optional<Aircraft> findAircraft( @PathVariable long id) {return spaceService.findAircraft(id);}

    //@PostMapping("/aircraft")


    /// Setter ///
    @Autowired
    public void setSpaceService(SpaceService spaceService) {this.spaceService = spaceService;}
}
