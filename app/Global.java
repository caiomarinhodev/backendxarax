import models.GenericDAO;
import models.Nacionalidade;
import models.Usuario;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.db.jpa.JPA;

import java.util.List;

/**
 * Created by caio on 24/03/15.
 */

public class Global extends GlobalSettings {

    private static GenericDAO dao = new GenericDAO();

    @Override
    public void onStart(Application app) {
        Logger.info("inicializada...");

        JPA.withTransaction(new play.libs.F.Callback0() {

            public void invoke() throws Throwable {

                List<Usuario> lis = dao.findAllByClassName(Usuario.class.getName());
                if (lis.size()<1) {
                    Usuario a = new Usuario("admin","admin","Administrador", "", 1,"admin@admin.com",0, true);
                    dao.persist(a);

                    String[] lb = new String[]{"Brasil", "Estados Unidos", "México", "Colômbia", "Argentina", "Canadá",
                "Peru", "Venezuela", "Chile", "Equador", "Bolívia", "Paraguai", "Uruguai"};

                    String[] lp = new String[]{"http://bandeira.vlajky.org/32/brasil.png", "http://bandeira.vlajky.org/32/united_states.png",
                    "http://bandeira.vlajky.org/32/mexico.png", "http://bandeira.vlajky.org/32/colombia.png", "http://bandeira.vlajky.org/32/argentina.png",
                    "http://bandeira.vlajky.org/32/canada.png", "http://bandeira.vlajky.org/32/peru.png", "http://bandeira.vlajky.org/32/venezuela.png",
                    "http://bandeira.vlajky.org/32/chile.png","http://bandeira.vlajky.org/32/equador.png", "http://bandeira.vlajky.org/32/bolivia.png",
                    "http://bandeira.vlajky.org/32/paraguai.png", "http://bandeira.vlajky.org/32/uruguai.png"};

                    for(int i=0; i<lb.length;i++){
                        Nacionalidade n = new Nacionalidade(lb[i],lp[i]);
                        dao.persist(n);
                    }
                    dao.flush();

                    Logger.info("Inserindo dados no BD.");
                }
            }
        });
    }

    public void onStop(Application app) {
        Logger.info("desligada...");
    }

}