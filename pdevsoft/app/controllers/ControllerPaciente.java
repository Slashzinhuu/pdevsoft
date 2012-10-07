package controllers;

import play.*;
import play.mvc.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import javax.persistence.Id;

import models.*;
import daos.*;


/*Falta o html para criar paciente*/
public class ControllerPaciente extends Controller {
	public static IDaoPaciente daoPaciente;
	
	public ControllerPaciente(IDaoPaciente daoPaciente) {
		this.daoPaciente = daoPaciente;
	}
	
	public static void criarPaciente(Paciente paciente) {
		
		if (paciente.ID != 0) {
			if (daoPaciente.buscarPaciente(paciente.ID) == null) {
				daoPaciente.criarPaciente(paciente);
				showPaciente();
			} else {
				Erro();
			}	
		} else {
			Erro();
		}
	}

	public static void apagarPaciente(Paciente paciente) {
		
		if (paciente.ID != 0) {
			if (daoPaciente.buscarPaciente(paciente.ID) != null) {
				daoPaciente.apagarPaciente(paciente);
				showPaciente();
			} else {
				Erro();
			}	
		} else {
			Erro();
		}
	}

	public static void editarPaciente(Paciente paciente) {
		if (paciente.ID != 0) {
			if (daoPaciente.buscarPaciente(paciente.ID) != null) {
				daoPaciente.editarPaciente(paciente);
				showPaciente();
			} else {
				Erro();
			}	
		} else {
			Erro();
		}
	}

	public static void buscarPaciente(int ID) {
		Paciente paciente = new Paciente();
		paciente = daoPaciente.buscarPaciente(ID);
		render(paciente);
	}

	public static void buscarPacienteCPF(String CPF) {
		Paciente paciente = new Paciente();
		paciente = daoPaciente.buscarPacienteCPF(CPF);
		render(paciente);
	}

	public static void buscarPacienteRG(String RG) {
		Paciente paciente = new Paciente();
		paciente = daoPaciente.buscarPacienteRG(RG);
		render(paciente);
	}
	
	public static void showPaciente() {
		render();
	}
	
	public static void showPaciente_CPF() {
		render();
	}
	
	public static void showPaciente_RG() {
		render();
	}
	
	public static void showCriarPaciente() {
		render();
	}
	
	public static void Erro() {
		render();
	}

}