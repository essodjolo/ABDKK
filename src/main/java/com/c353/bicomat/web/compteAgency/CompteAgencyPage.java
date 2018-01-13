package com.c353.bicomat.web.compteAgency;

import com.c353.bicomat.entities.CompteAgency;
import com.c353.bicomat.services.ICompteAgencyService;
import com.c353.bicomat.web.base.BasePage;
import org.wicketstuff.annotation.mount.MountPath;

import java.util.Optional;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;

@MountPath("compteAgency")
public class CompteAgencyPage extends BasePage {

    @SpringBean
    private ICompteAgencyService compteAgencyService;

    public CompteAgencyPage() {
        this(null);
    }

    public CompteAgencyPage(PageParameters param) {
        if (param != null && param.get("idCompteAgency") != null) {
            System.out.println("IdCompteAgency" + param.get("idAgency").toInt());
        }

        CompteAgency compteAgency = new CompteAgency();
        Boolean isModif = super.isModifier(param);
        if (isModif != null) {
            if (isModif) {
                Optional<CompteAgency> optional = compteAgencyService
                        .selectionner(param.get("id").toInt());
                compteAgency = (optional.isPresent()) ? optional.get() : compteAgency;
            } else {
                Optional<CompteAgency> optional = compteAgencyService
                        .selectionner(param.get("id").toInt());
                compteAgencyService.supprimer(optional.get());
            }
        }
        add(new CompteAgencyFormPanel("formPanel", compteAgency));
        add(new CompteAgencyListPanel("listPanel"));
    }
}
