package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.dto.TopicoDto;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RestController("/topicos")
public class TopicosController {

	@Autowired
	private TopicoRepository topicoRepository;
	
	//@Autowired
	//private CursoRepository cursoRepository;

	@GetMapping
	public List<TopicoDto> lista() {

		System.out.println("CARREGANDO...");
		List<Topico> topicos = topicoRepository.findAll();
		System.out.println(topicos);
		return TopicoDto.converter(topicos);
	}
	/*
	@PostMapping
	public void cadastrar(@RequestBody TopicoForm topicoForm) {
		Topico topico = topicoForm.converter(cursoRepository);
		topicoRepository.save(topico);
	}
	*/
}
