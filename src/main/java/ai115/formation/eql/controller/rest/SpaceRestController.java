package ai115.formation.eql.controller.rest;


import ai115.formation.eql.entity.Aircraft;
import ai115.formation.eql.entity.dto.AircraftAddDto;
import ai115.formation.eql.entity.dto.AircraftDeleteDto;
import ai115.formation.eql.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/space")
@CrossOrigin("${front.url}")
public class SpaceRestController {

    SpaceService spaceService;

    @GetMapping("aircraft/{id}")
    public Optional<Aircraft> findAircraft( @PathVariable long id) {return spaceService.findAircraft(id);}

    @GetMapping("aircraft")
    public List<Aircraft> findAll() {return spaceService.findAll();}

    @PostMapping("aircraft")
    public Aircraft saveAircraft(@RequestBody AircraftAddDto aircraftAddDto)
    {return spaceService.saveAircraft(aircraftAddDto);}


    @DeleteMapping("/aircraft/{id}")
    public void deleteAircraft(@RequestBody AircraftDeleteDto aircraftDeleteDto) {spaceService.deleteAircraft(aircraftDeleteDto);}


    /// Setter ///
    @Autowired
    public void setSpaceService(SpaceService spaceService) {this.spaceService = spaceService;}
}
