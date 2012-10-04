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

public class ControllerExame extends Controller {
	
	
	public static void doCreateExame(Exame exame) {
		/*
		 * esse m�todo vai receber uma inst�ncia de exame.
		 * Esse exame deve ser analisado junto ao banco de dados para saber: 
		 * 1-Se j� existe algum exame com esse ID,
		 * 2-Se esse o paciente indicado j� foi criado no banco,
		 * 3-Se o Medico de Laboratorio indicado j� foi criado no banco,
		 * 4-Se o Medico Requisitante indicado j� foi criado no banco.
		 * Para isso faremos 4 buscas nos DAOs respectivos para confirmar
		 * 		esses dados antes de chamar o DAO para inser��o. 
		 * Depois de inserir, chama a p�gina de renderizar o html de "sucesso"
		 */
	}
	
}