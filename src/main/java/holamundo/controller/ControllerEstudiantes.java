package holamundo.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import holamundo.model.manager.ManagerEstudiantes;

@Named
@SessionScoped
public class ControllerEstudiantes implements Serializable {
	private static final long serialVersionUID = 1L;
	@EJB
	private ManagerEstudiantes managerEstudiantes;
	private String titulo;
	private String titulo2;
	private List<String> listado;

	public void actionListenerConsultar() {
		titulo = "UNIVERSIDAD TECNICA DEL NORTE";
		titulo2="El paul :v";
		listado = managerEstudiantes.consultarListadoEstudiantes();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<String> getListado() {
		return listado;
	}

	public void setListado(List<String> listado) {
		this.listado = listado;
	}

	public String getTitulo2() {
		return titulo2;
	}

	public void setTitulo2(String titulo2) {
		this.titulo2 = titulo2;
	}
	

}
