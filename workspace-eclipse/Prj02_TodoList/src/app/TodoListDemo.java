package app;

public class TodoListDemo {

	public static void main(String[] args) {
		
		TodoList listaSpesa = new TodoList();
		
		listaSpesa.addTodo("fintech", 0);
		listaSpesa.addTodo("mobile", 1);
		listaSpesa.addTodo("backend", 2);
		
		System.out.println(listaSpesa.getTodo(1).stampa());
		
		;
		
		
		

	}

}