package ai115.formation.eql.service.impl;

import ai115.formation.eql.entity.Aircraft;
import ai115.formation.eql.entity.StudentPilot;
import ai115.formation.eql.entity.dto.AircraftAddDto;
import ai115.formation.eql.entity.dto.AircraftDeleteDto;
import ai115.formation.eql.entity.dto.StudentPilotAddDto;
import ai115.formation.eql.entity.dto.StudentPilotDeleteDto;
import ai115.formation.eql.repository.AircraftDao;
import ai115.formation.eql.repository.StudentPilotDao;
import ai115.formation.eql.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpaceServiceImpl implements SpaceService {

    @Autowired
    AircraftDao aircraftDao;

    StudentPilotDao studentPilotDao;


    @Override
    public Optional<Aircraft> findAircraft(Long id) {
        return aircraftDao.findById(id);
    }

    @Override
    public Aircraft saveAircraft(AircraftAddDto aircraftAddDto) {
        return null;
    }

    @Override
    public void deleteAircraft(AircraftDeleteDto aircraftDeleteDto) {

    }


    @Override
    public List<StudentPilot> findStudentPilots(Long id) {
        return null;
    }

    @Override
    public StudentPilot saveStudentPilot(StudentPilotAddDto studentPilotAddDto) {
        return null;
    }

    @Override
    public void deleteStudentPilot(StudentPilotDeleteDto studentPilotDeleteDto) {

    }
}
