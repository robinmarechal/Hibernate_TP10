package libs.mvc;

import libs.EntityManagerHolder;
import libs.ui.template.Template;

import javax.persistence.EntityManager;
import java.io.Serializable;

public abstract class Controller<PKType extends Serializable>
{
    protected EntityManager em;

    public Controller()
    {
        this.em = EntityManagerHolder.getEntityManager();
    }

    public abstract void show (PKType id);

    public abstract void showAll();

    public void setTemplateView (View view)
    {
        Template.getInstance().setView(view);
    }
}
