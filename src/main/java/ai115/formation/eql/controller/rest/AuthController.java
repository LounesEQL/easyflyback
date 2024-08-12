package ai115.formation.eql.controller.rest;

import ai115.formation.eql.entity.Person;
import ai115.formation.eql.entity.Role;
import ai115.formation.eql.entity.dto.AuthResponseDto;
import ai115.formation.eql.entity.dto.LoginDto;
import ai115.formation.eql.entity.dto.RegisterDto;
import ai115.formation.eql.repository.PersonDao;
import ai115.formation.eql.repository.RoleDao;
import ai115.formation.eql.security.JWTGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private AuthenticationManager authenticationManager;
    private PersonDao personDao;
    private RoleDao roleDao;
    private PasswordEncoder passwordEncoder;
    private JWTGenerator jwtGenerator;

    @Autowired
    public AuthController(AuthenticationManager authenticationManager, PersonDao personDao, RoleDao roleDao, PasswordEncoder passwordEncoder, JWTGenerator jwtGenerator) {
        this.authenticationManager = authenticationManager;
        this.personDao = personDao;
        this.roleDao = roleDao;
        this.passwordEncoder = passwordEncoder;
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterDto registerDto) {
        if (personDao.existsByUsername(registerDto.getUsername())) {
            return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
        }

        Person person = new Person();
        person.setUsername(registerDto.getUsername());
        person.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        person.setEmail(registerDto.getEmail());
        person.setLicence(registerDto.getLicence());
        person.setName(registerDto.getName());
        person.setSurname(registerDto.getSurname());
        Role roles = roleDao.findByName("PILOT").get();
        person.setRoles(Collections.singletonList(roles));

        personDao.save(person);

        return new ResponseEntity<>("User registered successfully!", HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login(@RequestBody LoginDto loginDto) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword())
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtGenerator.generateToken(authentication);

        return new ResponseEntity<>(new AuthResponseDto(token), HttpStatus.OK);

    }
}
