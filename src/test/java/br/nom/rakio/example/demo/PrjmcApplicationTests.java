package br.nom.rakio.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import br.nom.rakio.prjmc.domain.Categoria;
import br.nom.rakio.prjmc.services.CategoriaService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CategoriaService.class)
public class PrjmcApplicationTests {

	@MockBean
	private CategoriaService service;
	private	Categoria categoria = new Categoria();
	
	
	@Before
	public void setUp() {

	}
	
	@Test
	public void contextLoads() {
		categoria.setId(1);
		categoria.setNome("rei");
		Mockito.when(service.find(1)).thenReturn(categoria);
		Categoria findById = service.find(1);
		
		String nome = findById.getNome();
		System.out.println(nome);
		assertEquals("rei", nome);
	}

}
