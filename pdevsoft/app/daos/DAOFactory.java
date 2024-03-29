package daos;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class DAOFactory {

	public static final int MYSQL = 0;
	
//	public abstract Connection conexao(String url, String nome, String senha,
//			int banco) throws ClassNotFoundException, SQLException;
//	
//	public abstract IDaoPaciente createDaoPaciente (); //ver se pode retornar interface?
//	public abstract IDaoExame createDaoExame (); 
//	public abstract IDaoMedLab createDaoMedicoLaboratorio ();
//	public abstract IDaoMedReq createDaoMedicoRequisitante ();
//	public abstract IDaoUsuario createDaoUsuario ();
	public abstract DaoPaciente createDaoPaciente (); //ver se pode retornar interface?
	public abstract DaoExame createDaoExame (); 
	public abstract DaoMedicoLaboratorio createDaoMedicoLaboratorio ();
	public abstract DaoMedicoRequisitante createDaoMedicoRequisitante ();
	
	public static DAOFactory createDAOFactory(int whichFactory) {
	
		 switch (whichFactory) {
		    case MYSQL: 
		        return new MySQLDAOFactory();
		 } 
		 return null;

	}

}