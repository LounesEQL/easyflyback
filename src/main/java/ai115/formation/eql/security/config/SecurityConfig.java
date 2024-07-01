package ai115.formation.eql.security.config;


import ai115.formation.eql.security.AuthEntryPointJwt;
import ai115.formation.eql.security.JWTAuthentificationFilter;
import ai115.formation.eql.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private AuthEntryPointJwt authEntryPointJwt;

    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    public SecurityConfig(AuthEntryPointJwt authEntryPointJwt, CustomUserDetailsService customUserDetailsService) {
        this.authEntryPointJwt = authEntryPointJwt;
        this.customUserDetailsService = customUserDetailsService;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf((csrf) -> csrf.disable())
                .exceptionHandling((exceptionHandling) -> exceptionHandling
                        .authenticationEntryPoint(authEntryPointJwt))
                .sessionManagement((sessionManagement) -> sessionManagement
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS))

                .authorizeHttpRequests((authorize) ->
                        authorize.requestMatchers(HttpMethod.POST, "/api/auth/**").permitAll()
                                .requestMatchers(HttpMethod.GET, "/api/user").permitAll()
                                .requestMatchers(HttpMethod.GET, "/api/space/**").permitAll()
                                .requestMatchers(HttpMethod.DELETE, "/api/space/**").permitAll()
                                .requestMatchers(HttpMethod.POST, "/api/space/**").permitAll()
                                .requestMatchers(HttpMethod.GET, "/api/admin").hasAuthority("ADMIN")
                                .anyRequest().authenticated());
        http.addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
        return http.build();

    }

    @Bean
    public JWTAuthentificationFilter jwtAuthenticationFilter() {return new JWTAuthentificationFilter();}

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration)
            throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}