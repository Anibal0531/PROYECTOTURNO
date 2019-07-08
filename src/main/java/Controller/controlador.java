package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

import Vista.INTERFASASESOR;
import Modelo.AsesorVo;

public class controlador implements ActionListener {
      private INTERFASASESOR view;
      private AsesorVo model;
      
      @Override
  	public void actionPerformed(ActionEvent e) {
  		// TODO Auto-generated method stub
  		
  	}
      
	public controlador(INTERFASASESOR view, AsesorVo model) {
		this.view = view;
		this.model = model;
		this.view.addComponentListener((ComponentListener) this);
	}

	public void iniciar() {
		view.add(view, "ingresar");
		
	}
      
}
