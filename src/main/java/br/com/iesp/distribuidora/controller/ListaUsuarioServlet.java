package br.com.iesp.distribuidora.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.PersistenceContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.iesp.distribuidora.model.Usuario;
import br.com.iesp.distribuidora.service.UsuarioService;

@WebServlet("/listaUsuarios")
public class ListaUsuarioServlet extends HttpServlet {

	private UsuarioService usuarioService;
	
	@Override
	public void init() throws ServletException {
		this.usuarioService = new UsuarioService();
	}
	
	@Override
	//Aqui ele vai listar, quando for uma requisição do tipo GET
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("lista.jsp");
		
		List<Usuario> usuarios = this.usuarioService.findAll();
		
		req.setAttribute("usuarios", usuarios);
		
		dispatcher.forward(req, resp);
	}
	
}
