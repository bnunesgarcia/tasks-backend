package br.ce.wcaquino.taskbackend.controller;

import java.time.LocalDate;

import org.junit.Test;
import br.ce.wcaquino.taskbackend.model.Task;
import br.ce.wcaquino.taskbackend.utils.ValidationException;

public class TaskControllerTest {
	
	@Test
	public void naoDeveSalvarTarefaSemDescricao() throws ValidationException {
		Task todo = new Task();
		todo.setDueDate(LocalDate.now());
		TaskController controller = new TaskController();
		controller.save(todo);
	}
	
	@Test
	public void naoDeveSalvarTarefaSemData() {
		
	}
	
	@Test
	public void naoDeveSalvarTarefaComDataPassada() {
		
	}
	
	@Test
	public void deveSalvarTarefaComSucesso() {
		
	}
}
