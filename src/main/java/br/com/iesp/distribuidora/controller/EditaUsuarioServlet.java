package br.com.iesp.distribuidora.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.iesp.distribuidora.model.Usuario;
import br.com.iesp.distribuidora.service.UsuarioService;

@WebServlet("/alteraUsuario")
public class EditaUsuarioServlet extends HttpServlet {

	private UsuarioService usuarioService;
	
	@Override
	public void init() throws ServletException {
		this.usuarioService = new UsuarioService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long id = Long.parseLong(req.getParameter("id"));
		
		Usuario alterar = this.usuarioService.getOne(id);
		
		RequestDispatcher disp = req.getRequestDispatcher("cadastrar.jsp");
		req.setAttribute("usuario", alterar);
		disp.forward(req, resp);
	}
	
}
