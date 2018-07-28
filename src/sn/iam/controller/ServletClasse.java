package sn.iam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.iam.model.Classe;
import sn.iam.model.Domaine;
import sn.iam.model.Filiere;
import sn.iam.model.Responsable;
import sn.iam.model.Site;
import sn.iam.service.IClasseImpl;
import sn.iam.service.IFiliereImpl;
import sn.iam.service.IResponsableImpl;
import sn.iam.service.ISiteImpl;

@WebServlet("/classe")

public class ServletClasse extends HttpServlet {

	private IClasseImpl classeSrv;
	private IFiliereImpl filiereSrv;
	private IResponsableImpl responsableSrv;
	@Override
	public void init() throws ServletException {
		classeSrv=new IClasseImpl();
		filiereSrv=new IFiliereImpl();
		responsableSrv=new IResponsableImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
		//req.setAttribute("mesClasses", classes);
		//this.getServletContext().getRequestDispatcher("/WEB-INF/pages/classe.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Classe classe = null;
		String mode = "ajout";
		int ok = 0;
			ClasseModel model=new ClasseModel();
			//req.setAttribute("model", model);
			String action=req.getParameter("action");
			if (action !=null) {
				if (action.equals("chercher")) {
					
					model.setMotCle(req.getParameter("motCle"));
					List<Classe> classes=classeSrv.classesParMC(model.getMotCle());
					model.setClasses(classes);
				}
				else if(action.equals("delete")) {
					int code = Integer.parseInt(req.getParameter("code"));
					classeSrv.deleteClasse(code);
					ok = 3;
					//model.setClasses(classeSrv.listClasses());
				}
				else if(action.equals("update")) {
					int code = Integer.parseInt(req.getParameter("code"));
					classe = new Classe();
					classe = classeSrv.getClasse(code);
					Filiere filiere = filiereSrv.getFiliere(classe.getFiliere().getCode());
					classe.setFiliere(filiere);
					Responsable responsable = responsableSrv.getResponsable(classe.getResponsable().getCode());
					classe.setResponsable(responsable);
					mode = "edit";
					//ok = 3;
					//model.setClasses(classeSrv.listClasses());
				}
				else if(action.equals("save")) {
//					fileireSrv = new IFiliereImpl();
//					responsableSrv= new IResponsableImpl();
					classe = new Classe();
					mode = req.getParameter("mode");
					classe.setNom(req.getParameter("nom"));
					classe.setAnneeScolaire(req.getParameter("anneescolaire"));
					classe.setNbEtudiant(Integer.parseInt(req.getParameter("nbetudiant")));
					classe.setFiliere(filiereSrv.getFiliere(Integer.parseInt(req.getParameter("filiere"))));
					//classe.setFilere(new Filiere(Integer.parseInt(req.getParameter("filiere")),"BBA",new Domaine()));
					classe.setResponsable(responsableSrv.getResponsable(Integer.parseInt(req.getParameter("responsable"))) );
					//classe.setResponsable(new Responsable(Integer.parseInt(req.getParameter("responsable")),"","","","") );
					if(mode.equals("ajout"))
					{
						try {
							classeSrv.addClasse(classe);
							ok = 1;
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
					if(mode.equalsIgnoreCase("edit"))
					{
						classe.setCode(Integer.parseInt(req.getParameter("code")));
						classeSrv.updateClasse(classe);
						mode = "ajout";
					}
					
					
					//model.setClasses(classeSrv.listClasses());
				}
			}
			List<Filiere> filieres= new IFiliereImpl().findAll();
			req.setAttribute("filieres", filieres);
			List<Responsable> responsables= new IResponsableImpl().findAll();
			req.setAttribute("responsables", responsables);
			req.setAttribute("classe", classe);
			req.setAttribute("ok", ok);
			req.setAttribute("mode", mode);
			List<Classe> listeClasse = classeSrv.listClasses();
			req.setAttribute("listeClasse", listeClasse);
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/classe.jsp").forward(req, resp);
	}
}
