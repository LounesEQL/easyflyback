package ai115.formation.eql.controller.rest;


import ai115.formation.eql.entity.Aircraft;
import ai115.formation.eql.entity.StudentPilot;
import ai115.formation.eql.entity.dto.AircraftAddDto;
import ai115.formation.eql.entity.dto.StudentPilotAddDto;
import ai115.formation.eql.repository.AircraftDao;
import ai115.formation.eql.repository.StudentPilotDao;
import ai115.formation.eql.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/space")
@CrossOrigin("${front.url}")
public class SpaceRestController {

    SpaceService spaceService;
    AircraftDao aircraftDao;
    StudentPilotDao studentPilotDao;

    @GetMapping("aircraft/{id}")
    public Optional<Aircraft> findAircraft( @PathVariable long id) {return spaceService.findAircraft(id);}

    @GetMapping("aircraft")
    public List<Aircraft> findAll() {return spaceService.findAll();}

    @PostMapping("aircraft")
    public Aircraft saveAircraft(@RequestBody AircraftAddDto aircraftAddDto)
    {return spaceService.saveAircraft(aircraftAddDto);}

    @DeleteMapping("/aircraft/{id}")
    public void deleteAircraft( @PathVariable long id) {aircraftDao.deleteById(id);}

    @GetMapping("studentPilot")
    public List<StudentPilot> findAllStudentPilot() {return spaceService.findAllStudentPilot();}

    @GetMapping("studentPilot/{id}")
    public Optional<StudentPilot> findStudentPilots( @PathVariable long id) {return spaceService.findStudentPilots(id);}

    @PostMapping("studentPilot")
    public StudentPilot saveStudentPilot(@RequestBody StudentPilotAddDto studentPilotAddDto)
    {return spaceService.saveStudentPilot(studentPilotAddDto);}


    /// Setter ///
    @Autowired
    public void setSpaceService(SpaceService spaceService) {this.spaceService = spaceService;}

    @Autowired
    public void setAircraftDao(AircraftDao aircraftDao) {this.aircraftDao = aircraftDao;}

    @Autowired
    public void setStudentPilotDao(StudentPilotDao studentPilotDao) {this.studentPilotDao = studentPilotDao;}
}