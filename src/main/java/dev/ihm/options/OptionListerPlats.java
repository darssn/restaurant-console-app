package dev.ihm.options;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dev.service.IPlatService;

@Component
public class OptionListerPlats implements IOptionMenu {

    private IPlatService service;

    public OptionListerPlats(IPlatService service) {
        this.service = service;
    }

    @Override
    public String getTitre() {
        return "Lister plats";
    }

    @Override
    public void executer() {

        this.service.listerPlats().forEach(plat -> {
            System.out.println(plat.getNom() + " (" + (plat.getPrixEnCentimesEuros() /100) + " €)");
        });

    }

	@Override
	public boolean isTerminate() {
		// TODO Auto-generated method stub
		return false;
	}
}
