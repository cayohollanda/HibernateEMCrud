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

@WebServlet("/cadUsuario")
public class CadastraUsuarioServlet extends HttpServlet {

	private UsuarioService usuarioService;
	
	@Override
	public void init() throws ServletException {
		this.usuarioService = new UsuarioService();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long id = Long.parseLong(req.getParameter("id"));
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		Usuario usuario = new Usuario();
		usuario.setLogin(login);
		usuario.setSenha(senha);
		
		RequestDispatcher disp = req.getRequestDispatcher("lista.jsp");
		
		if(id.toString() == null) {
			this.usuarioService.save(usuario);
		} else {
			usuario.setId(id);
			this.usuarioService.update(usuario);
		}
		
		List<Usuario> usuarios = this.usuarioService.findAll();
		req.setAttribute("usuarios", usuarios);
		disp.forward(req, resp);
	}
	
}
