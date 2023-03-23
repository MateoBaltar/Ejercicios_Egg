package com.eggnews.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.eggnews.news.servicios.UsuarioServicio;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SeguridadWeb {

        @Autowired
        public UsuarioServicio usuarioServicio;

        @Bean
        public PasswordEncoder passwordEncoder() {
                return new BCryptPasswordEncoder();
        }

        @Bean
        SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

                http.csrf().disable()
                                .authorizeHttpRequests(authorize -> authorize
                                                .requestMatchers("/admin/CrearNoticia/**","/admin/AdministrarNoticias/**","/admin/dashboard/").hasAnyRole("ADMIN","EDITOR")
                                                .requestMatchers("/admin/AdministrarUsuarios/**","/admin/RegistroPeriodista/**").hasAnyRole("ADMIN")
                                                .requestMatchers("/CSS/*", "/js/*", "/Imagenes/*", "/templates/**","/noticia/**")
                                                .permitAll()
                                                .anyRequest().permitAll());

                http.formLogin()
                                .loginPage("/login")
                                .loginProcessingUrl("/logincheck")
                                .usernameParameter("email")
                                .passwordParameter("password")
                                .defaultSuccessUrl("/inicio", true)
                                .failureForwardUrl("/")
                                .permitAll();
                http.logout()
                                .logoutUrl("/logout")
                                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                                .logoutSuccessUrl("/")
                                .permitAll();
                http.csrf()
                                .disable();
                return http.build();

        }
}