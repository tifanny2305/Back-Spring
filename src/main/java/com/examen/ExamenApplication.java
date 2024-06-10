package com.examen;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ExamenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}
/*
	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	UsuarioRepository usuarioRepository;

	@Bean
	CommandLineRunner init(){
		return args -> {
			Usuario usuario = Usuario.builder()
					.email("docente@gmail.com")
					.password(passwordEncoder.encode("12345678"))
					.username("docente1")
					.roles(Set.of(RoleEntity.builder()
							.name(ERole.valueOf(ERole.DOCENTE.name()))
							.build()
					)).build();

			Usuario usuario2 = Usuario.builder()
					.email("administrador@gmail.com")
					.password(passwordEncoder.encode("12345678"))
					.username("administrador2")
					.roles(Set.of(RoleEntity.builder()
							.name(ERole.valueOf(ERole.ADMIN.name()))
							.build()
					)).build();
			usuarioRepository.save(usuario);
			usuarioRepository.save(usuario2);
		};
	}*/
}
