package interfaces;

import java.util.List;

public interface InterfaceDAO<T> {

	public boolean salvar(T t);
	public boolean update(T t);
	public boolean excluir(int id);
	public boolean excluir(T t);
	public T retornarUm(int id);
	public List<T> retornarTodos();
	
}
