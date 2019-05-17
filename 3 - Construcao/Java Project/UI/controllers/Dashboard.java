package controllers;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import TOs.UsuarioTO;
import models.IAction;
import models.IActionItem;
import models.UsuarioAtual;

public class Dashboard extends BaseController {
	public void Index() {

		List<IActionItem> itens = new ArrayList<IActionItem>();
		itens.add(new IActionItem("onload", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(null, "on load");
			}
		}));
		itens.add(new IActionItem("btnSair", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UsuarioAtual.usuario = null;
				new controllers.Login().Index(); 
			}
		}));

		itens.add(new IActionItem("btnAddUsuario", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}));
		itens.add(new IActionItem("btnDesativarUsuario", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}));
		itens.add(new IActionItem("btnAddPaciente", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}));
		itens.add(new IActionItem("btnListarPaciente", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}));
		itens.add(new IActionItem("btnListarDoencas", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}));
		super.GenerateView(new IAction(this.getClass(), itens));
	}
}
