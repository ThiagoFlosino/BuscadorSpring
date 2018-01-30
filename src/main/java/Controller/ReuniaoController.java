package Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import DAO.ReuniaoRepository;
import domain.Reuniao;


@EnableNeo4jRepositories
@RequestMapping("/reuniao")
public class ReuniaoController {
	
	
	@Autowired
	ReuniaoRepository repo;
	
	@GetMapping
	@ResponseBody
	public List<Reuniao> findAll() {
		return (List<Reuniao>) repo.findAll();
	}

	
	@PostMapping
	@ResponseBody
	public Reuniao create(@RequestParam Date data, @RequestParam String nome, @RequestParam String documento,
			@RequestParam Integer numero) {
		Reuniao reuniao = new Reuniao();
		reuniao.setData(data);
		reuniao.setNome(nome);
		reuniao.setDocumento(documento);
		reuniao.setNumeroReuniao(numero);
		
		repo.save(reuniao);
		
		return reuniao;
	}
}
