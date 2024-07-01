package ai115.formation.eql.service;

import ai115.formation.eql.entity.Aircraft;
import ai115.formation.eql.entity.StudentPilot;
import ai115.formation.eql.entity.dto.AircraftAddDto;
import ai115.formation.eql.entity.dto.AircraftDeleteDto;
import ai115.formation.eql.entity.dto.StudentPilotAddDto;
import ai115.formation.eql.entity.dto.StudentPilotDeleteDto;
import ai115.formation.eql.repository.AircraftDao;

import java.util.List;
import java.util.Optional;

public interface SpaceService {

        Optional<Aircraft> findAircraft(Long id);
        List<Aircraft> findAll();
        Aircraft saveAircraft(AircraftAddDto aircraftAddDto);
        void deleteAircraft( AircraftDeleteDto aircraftDeleteDto);

        List<StudentPilot> findStudentPilots(Long id);
        StudentPilot saveStudentPilot(StudentPilotAddDto studentPilotAddDto);

        }








