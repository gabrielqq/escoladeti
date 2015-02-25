package demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="*")

public class TesteController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello(){
		return "Hello Word!";
	}
	
	@RequestMapping(value="/alunos",method=RequestMethod.GET)
	public Aluno getAluno(){
		Aluno novo = new Aluno("Aluno Jr. " + System.currentTimeMillis());
		return novo;
	}
	
	@RequestMapping(value="/alunos",method=RequestMethod.POST)
	public String criarAluno(@RequestBody(required=true) Aluno novo){
		return "Aluno de nome ["+novo.getnome() + "] recebido com imenso sucesso!";
		
	}
}
