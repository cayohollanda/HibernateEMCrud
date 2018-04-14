package br.com.iesp.distribuidora.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.iesp.distribuidora.model.Usuario;
import br.com.iesp.distribuidora.service.UsuarioService;

@WebServlet("/removeUsuario")
public class RemoveUsuarioServlet extends HttpServlet {

	private UsuarioService usuarioService;
	
	@Override
	public void init() throws ServletException {
		this.usuarioService = new UsuarioService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long id = Long.parseLong(req.getParameter("id"));
		
		this.usuarioService.remove(id);
		
		List<Usuario> usuarios = this.usuarioService.findAll();
		
		RequestDispatcher disp = req.getRequestDispatcher("lista.jsp");
		req.setAttribute("usuarios", usuarios);
		disp.forward(req, resp);
	}
	
}
